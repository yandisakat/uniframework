package repositories.security.tables

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.security.Login

import scala.concurrent.Future

abstract class LoginTable extends Table[LoginTable, Login] {

  object email extends StringColumn with PartitionKey

  object sites extends StringColumn
}

abstract class LoginTableImpl extends LoginTable with RootConnector {

  override lazy val tableName = "logins"

  def save(login: Login): Future[ResultSet] = {
    insert
      .value(_.email, login.email)
      .value(_.sites, login.sites)
      .future()
  }

  def getLogins(email:String, sites:Set[String]): Future[Seq[Login]] = {
    select
      .where(_.email eqs email)
      .and(_.sites eqs sites)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteLogins(email:String, sites:Set[String]):Future[Login] ={
    delete
      .where(_.email eqs email)
      .and(_.sites eqs sites)
      .future()
  }
}
