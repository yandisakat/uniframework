package repositories.places.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.places.Venue

import scala.concurrent.Future

/*
 * @created by Natasha
 * @param venueId
 * @param venueName
 * @param capacity
 * @param description
 */

abstract class VenueTable extends Table[VenueTable, Venue] {

  object venueId extends StringColumn with PartitionKey

  object venueName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending

  object capacity extends IntColumn

  object description extends StringColumn

}

abstract class VenueTableImpl extends VenueTable with RootConnector {

  override lazy val tableName = "venue"

  def save(role: Venue): Future[ResultSet] = {
    insert
      .value(_.venueId, role.venueId)
      .value(_.venueName, role.venueName)
      .value(_.capacity, role.capacity)
      .value(_.description, role.description)
      .future()
  }

  def getVenues(venueId:String, venueName: String): Future[Seq[Venue]] = {
    select
      .where(_.orgId eqs orgId)
      .and(_.emailId eqs emailId)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteVenues(venueId:String,venueName:String):Future[ResultSet] ={
    delete
      .where(_.venueId eqs venueId)
      .and(_.venueName eqs venueName)
      .future()
  }
}
