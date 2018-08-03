package domain.events

import java.time.LocalDateTime
import play.api.libs.json.Json

/**
  *
  * created by Kessel
  * @param username
  * @param password
  * @param login_Date
  
  */


case class LoginEvents(username: String, password: String, login_Date:LocalDateTime)

object LoginEvents {

  implicit val Login = Json.format[LoginEvents]

  def identity: LoginEvents = LoginEvents ("","",LocalDateTime.now())

}
