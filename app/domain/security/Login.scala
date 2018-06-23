package domain.security

import play.api.libs.json.Json

case class Login(email:String, sites:Set[String])

object Login {

  implicit val loginFmt = Json.format[Login]

  def identity: Login = Login("",Set())

}
