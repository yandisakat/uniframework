package repositories.users.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.users.User

import scala.concurrent.Future


abstract class UserTable extends Table[UserTable, User] {

  object email extends StringColumn with PartitionKey

  object orgId extends StringColumn with PrimaryKey

  object state extends StringColumn

  object screenName extends StringColumn

  object firstname extends OptionalStringColumn

  object lastName extends OptionalStringColumn

  object password extends StringColumn

  object date extends Col[LocalDateTime]

}

abstract class UserTableImpl extends UserTable with RootConnector {

  override lazy val tableName = "users"

  def save(user: User): Future[ResultSet] = {
    insert
      .value(_.orgId, user.orgId)
      .value(_.email, user.email)
      .value(_.state, user.state)
      .value(_.screenName, user.screenName)
      .value(_.firstname, user.firstName)
      .value(_.lastName, user.lastName)
      .value(_.password, user.password)
      .value(_.date, user.date)
      .future()
  }

  def getUser(email: String, orgId:String): Future[Option[User]] = {
    select.where(_.email eqs email).and(_.orgId eqs orgId).one()
  }

  def getUserAccounts(email: String):Future[Seq[User]] = {
    select.where(_.email eqs email).fetchEnumerator() run Iteratee.collect()
  }

  def getUsers: Future[Seq[User]] = {
    select.fetchEnumerator() run Iteratee.collect()
  }

  def deleteUser(email: String, siteId:String): Future[ResultSet] = {
    delete.where(_.email eqs email).and(_.orgId eqs siteId).future()
  }
}

abstract class UserOrgTable extends Table[UserOrgTable, User] {

  object orgId extends StringColumn with PartitionKey

  object email extends StringColumn with PrimaryKey

  object state extends StringColumn

  object screenName extends StringColumn

  object firstname extends OptionalStringColumn

  object lastName extends OptionalStringColumn

  object password extends StringColumn

  object date extends Col[LocalDateTime]

}

abstract class UserOrgTableImpl extends UserOrgTable with RootConnector {

  override lazy val tableName = "orgusers"

  def save(user: User): Future[ResultSet] = {
    insert
      .value(_.orgId, user.orgId)
      .value(_.email, user.email)
      .value(_.state, user.state)
      .value(_.screenName, user.screenName)
      .value(_.firstname, user.firstName)
      .value(_.lastName, user.lastName)
      .value(_.password, user.password)
      .value(_.date, user.date)
      .future()
  }

  def getSiteUsers(orgId: String): Future[Seq[User]] = {
    select.where(_.orgId eqs orgId).fetchEnumerator() run Iteratee.collect()
  }

  def getSiteUser(orgId: String, email: String): Future[Option[User]] = {
    select.where(_.orgId eqs orgId).and(_.email eqs email).one
  }

  def deleteUser(orgId: String, email: String): Future[ResultSet] = {
    delete.where(_.orgId eqs orgId).and(_.email eqs email).future()
  }
}


abstract class UserTimeLineTable extends Table[UserTimeLineTable, User] {

  object siteId extends StringColumn with PartitionKey

  object date extends Col[LocalDateTime] with PrimaryKey

  object email extends StringColumn with PrimaryKey

  object state extends StringColumn

  object screenName extends StringColumn

  object firstname extends OptionalStringColumn

  object lastName extends OptionalStringColumn

  object password extends StringColumn

}


