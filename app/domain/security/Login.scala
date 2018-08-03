package domain.security
import play.api.libs.json.Json

/*
 * @param email
 * @param sites
 */

case class Login(email:String, sites:Set[String])

object Login {

  implicit val loginFmt = Json.format[Login]

  def identity: Login = Login("",Set())

}
