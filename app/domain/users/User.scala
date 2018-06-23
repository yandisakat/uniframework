package domain.users

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *
  * @param orgId Organisation or Site or Institution Unique IID
  * @param email
  * @param firstName
  * @param lastName
  * @param screenName the Pseudo name for a Use
  * @param password
  * @param state is the Account Active or Deactivated
  * @param date Date the User was created
  */



case class User(orgId: String,
                email: String,
                firstName:  Option[String],
                lastName:  Option[String],
                screenName: String,
                password: String,
                state: String,
                date: LocalDateTime)

object User {
  implicit val userFmt = Json.format[User]
  def identity: User = User("", "", None, None, "", "", "", LocalDateTime.now())
}