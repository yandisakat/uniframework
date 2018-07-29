package domain.events

import java.time.LocalDateTime
import play.api.libs.json.Json

/**
  *
  * created by Kessel
  * @param username
  * @param password
  */


case class LoginEvents(username: String, password: String)

object LoginEvents {

  implicit val Login = Json.format[LoginEvents]

  def identity: LoginEvents = LoginEvents ("","")

}
