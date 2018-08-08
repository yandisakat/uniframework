package repositories.courses.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.Faculty

import scala.concurrent.Future


abstract class FacultyTable extends Table[FacultyTable, Faculty] {

  object facId extends StringColumn with PartitionKey

  object facName extends StringColumn with Ascending

  object campus extends StringColumn

}

abstract class FacultyImpl extends FacultyTable with RootConnector {

  override lazy val tableName = "faculties"

  def save(faculty: Faculty): Future[ResultSet] = {
    insert
      .value(_.facId, faculty.facId)
      .value(_.facName, faculty.facName)
      .value(_.campus, faculty.campus)
      .future()
  }

  def getFaculties(facId:String, facName: String): Future[Seq[Faculty]] = {
    select
      .where(_.facId eqs facId)
      .and(_.facName eqs facName)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteFaculties(facId:String, facName: String):Future[ResultSet] ={
    delete
      .where(_.facId eqs facId)
      .and(_.facName eqs facName)
      .future()
  }
}
