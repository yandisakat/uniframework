package repositories.places.tables

import java.time.LocalDateTime
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.places.Venue
import scala.concurrent.Future

/**
  * By Yandisa Katiya - 2018/07/21
  */

abstract class VenueTable extends Table[VenueTable]
{
  object venueId extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  object entityId extends StringColumn with PartitionKey
  object capacity extends IntColumn
  object venueName extends StringColumn
}

abstract class VenueTableImpl extends VenueTable with RootConnector
{
  override lazy val tableName = "Venues"
  
  def save(role: Venue): Future[ResultSet] = 
  {
    insert
      .value(_.venueId, role.venueId)
      .value(_.entityId, role.entityId)
      .value(_.capacity, role.capacity)
      .value(_.venueName, role.venueName)
      .future()
  }
  
  def getVenues(venueId:String, entityId:String):Future[Seq[Venue]] =
  {
    select
      .where(_.venueId eqs venueId)
      .and(entityId eqs entityId)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  
  def deleteVenues(venueId:String, entityId:String):Future[ResultSet]=
  {
    delete
      .where(_.venueId eqs venueId)
      .and (_.entityId eqs entityId)
      .future()
  }
}
