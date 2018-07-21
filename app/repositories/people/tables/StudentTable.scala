package repositories.people.tables

import java.time.LocalDateTime
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.people.Student
import scala.concurrent.Future

/**
  * By Yandisa Katiya - 2018/07/21
  */

abstract class StudentTable extends Table[StudentTable]
{ 
  object studentId extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  object deptId extends StringColumn with PartitionKey
  object firstName extends StringColumn
  object lastName extends StringColumn
  object initial extends StringColumn
  object yearOfStudy extends IntColumn
  object email extends StringColumn
}

abstract class StudentTableImpl extends StudentTable with RootConnector
{
  override lazy val tableName = "Students"
  
  def save(role: Student): Future[ResultSet] =
  {
    insert
      .value(_.studentId, role.studentId)
      .value(_.deptId, role.deptId)
      .value(_.firstName, role.firstName)
      .value(_.initial, role.initial)
      .value(_.lastName, role.lastName)
      .value(_.yearOfStudy, role.yearOfStudy)
      .value(_.email, role.email)
      .future()
  }
  
  def getStudents(studentId:String, deptId: String, initial: String, lastName: String, email: String):Future[Seq[Venue]]=
  {
    select
      .where(_.studentId eqs studentId)
      .and(deptId eqs deptId)
      .fetchEnumerator() run Iteratee.collect()   
  }
  
  def deleteStudents(studentId: String, deptId: String):Future[ResultSet]=
  {
    delete
      .where(_.studentId eqs studentId)
      .and (_.deptId eqs deptId)
      .future()  
  }
}
