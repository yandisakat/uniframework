package repositories.events.table



import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.events.LoginEvents

import scala.concurrent.Future


abstract class LoginEventTable extends Table[LoginEventTable, LoginEvent] {

  object username extends StringColumn with Primary

  object password extends StringColumn

  object loginDate extends StringColumn 

}

abstract class LoginEventTableImpl extends LoginEventTable with RootConnector {

  override lazy val tableName = "event"

  def save(event: LoginEvent): Future[ResultSet] = {
    insert
      .value(_.username, event.username)
      .value(_.passport, event.passport)
      .value(_.firstName, person.firstName)
      .future()
  }

  def getLoginDetails(username: String, passport:String): Future[Option[Person]] = {
    select.where(_.username eqs username).and(_.password eqs password).one()
  }

  
  def getLoginDetails Future[Seq[Person]] = {
    select.fetchEnumerator() run Iteratee.collect()
  }

 }

abstract class LoginEventOrgTable extends Table[LoginEventOrgTable, LoginEvent] {

  object username extends StringColumn with Primary

  object password extends StringColumn

  object loginDate extends StringColumn

  

}

abstract class LoginEventOrgTableImpl extends LoginEvent LoginEventOrgTable with RootConnector {

  override lazy val tableName = "orglogin"

  def save(event: LoginEvent): Future[ResultSet] = {
    insert
      .value(_.username, event.username)
      .value(_.passport, event.passport)
      .value(_.firstName, person.firstName)
      .future()
      
  }

   
}






