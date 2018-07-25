package repositories.events.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.events.LoginEvents

import scala.concurrent.Future


abstract class LoginEventsTable extends Table[LoginEventsTable, LoginEvents] {

  object username extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  
  object password extends StringColumn with PartitionKey
  
}

abstract class LoginEventsTableImpl extends LoginEventsTable with RootConnector {

  override lazy val tableName = "loginevents"
  
  def save(role: LoginEvents): Future[ResultSet] = {
    insert
      .value(_.username, role.username)
      .value(_.password, role.password)
      .future()
}

  def getLoginEvents(username:String, password: String): Future[Seq[LoginEvents]] = {
    select
      .where(_.username eqs username)
      .and(_.password eqs password)
      .fetchEnumerator() run Iteratee.collect()
}

def deleteLoginEvents(username:String, password:String):Future[ResultSet]=
  {
    delete
      .where(_.username eqs username)
      .and (_.password eqs password)
      .future()
  }
}
