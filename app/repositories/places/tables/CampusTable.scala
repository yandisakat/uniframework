package repositories.places.tables

/*
 * By Yandisa Katiya
 * reviewed by Natasha
 */

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.places.Campus
import scala.concurrent.Future

abstract class CampusTable extends Table[CampusTable, Campus]
{
  object campusId extends StringColumn with PartitionKey
  
  object campusName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  
  object location extends StringColumn
 
}

abstract class CampusTableImpl extends CampusTable with RootConnector
{
  override lazy val tableName = "campus"
  
  def save(role: campus): Future[ResultSet] = 
  {
    insert
      .value(_.campusId, role.campusId)
      .value(_.campusName, role.campusName)
      .value(_.location, role.location)
      .future()
  }
  
  def getCampus(campusId: String, campusName: String, location: String): Future[Seq[Campus]] =
  {
    select
      .where(_.campusId eqs campusId)
      .and(_.campusName eqs campusName)
      .and(_.location eqs location)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  def deleteExam(campusId: String, campusName: String, location: String): Future[ResultSet] =
  {
    delete
      .where(_.campusId eqs campusId)
      .and(_.campusName eqs campusName)
      .and(_.location eqs location)
      .future()
  }

}
