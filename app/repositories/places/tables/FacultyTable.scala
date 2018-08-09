package repositories.places.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.places.faculty

import scala.concurrent.Future


abstract class FacultyTable extends Table[FacultyTable, Faculty] {

  object facId extends StringColumn with PartitionKey

  object facName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending

  object campus extends StringColumn

}

abstract class FacultyTableImpl extends FacultyTable with RootConnector {

  override lazy val tableName = "faculty"

  def save(fac: Faculty): Future[ResultSet] = {
    insert
      .value(_.facId, fac.facId)
      .value(_.facName, fac.facName)
      .value(_.campus, fac.campus)
      
      .future()
  }

  def getFaculty(facId:String): Future[Seq[UserRole]] = {
    select
      .where(_.facId eqs facId)
     
      .fetchEnumerator() run Iteratee.collect()
  }

}
