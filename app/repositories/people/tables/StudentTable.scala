package repositories.people.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.people.Student

import scala.concurrent.Future


abstract class StudentTable extends Table[StudentTable, Student] {

  object studentId extends StringColumn with PartitionKey

  object deptId extends StringColumn

  object firstName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  
  object lastName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  
  object initial extends StringColumn
  
  object dateOfbirth extends Col[LocalDateTime] with PrimaryKey with ClusteringOrder with Ascending

  object address extends StringColumn
  
  object telephoneNo extends IntColumn
  
  object level extends StringColumn
  
  object StudentType extends StringColumn

}

abstract class StudentTableImpl extends StudentTable with RootConnector {

  override lazy val tableName = "student"

  def save(std: Student): Future[ResultSet] = {
    insert
      .value(_.studentId, std.studentId)
      .value(_.deptId, std.deptId)
      .value(_.firstName, std.firstName)
      .value(_.lastName, std.lastName)
      .value(_.initial, std.initial)
      .value(_.dateOfbirth, std.dateOfbirth)
      .value(_.address, std.address)
      .value(_.telephoneNo, std.telephoneNo)
      .value(_.level, std.level)
      .value(_.StudentType, std.StudentType)
      .future()
  }

  def getStudent(studentId:String, firstName: String, lastName: String, dateOfBirth:LocalDateTime): Future[Seq[Student]] = {
    select
      .where(_.studentId eqs studentId)
      .and(_.firstName eqs firstName)
      .and(_.lastName eqs lastName)
      .and(_.dateOfBirth eqs dateOfBirth)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteStudent(studentId:String, firstName: String, lastName: String, dateOfBirth:LocalDateTime):Future[ResultSet] ={
    delete
      .where(_.studentId eqs studentId)
      .and(_.firstName eqs firstName)
      .and(_.lastName eqs lastName)
      .and(_.dateOfBirth eqs dateOfBirth)
      .future()
  }
}
