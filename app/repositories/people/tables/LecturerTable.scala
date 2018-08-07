package repositories.people.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.people.Lecturer

import scala.concurrent.Future

/**
  * created by Kessel 
  */

abstract class LecturerTable extends Table[LecturerTable, Lecturer] {

  object lectId extends StringColumn with PartitionKey

  object firstname extends StringColumn
  object lastname extends StringColumn
  object telephoneNo extends StringColumn
  object email extends StringColumn
  object address extends StringColumn
  //missing subject list 


}

abstract class LecturerTableImpl extends LecturerTable with RootConnector {

  override lazy val tableName = "lecturer"

  def save(lect: Lecturer): Future[ResultSet] = {
    insert
      .value(_.lectId, role.lectId)
      .value(_.firstname, role.firstname)
      .value(_.lastname, role.lastname)
      .value(_.telephoneNo, role.telephoneNo)
      .value(_.email, role.email)
      .value(_.address, role.address)
      .future()
  }

  def getUserRoles(lectId:String, email: String): Future[Seq[UserRole]] = {
    select
      .where(_.lectId eqs lectId)
      .and(_.email eqs email)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteLecturer(lectId:String,email:String):Future[ResultSet] ={
    delete
      .where(_.lectId eqs lectId)
      .and(_.email eqs email)
      .future()
  }
}
