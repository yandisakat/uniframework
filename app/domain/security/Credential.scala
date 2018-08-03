package domain.security
import play.api.libs.json.Json

/*
 * @param email
 * @param password
 * @param siteId
*/

case class Credential(email:String, password:String, siteId:String)

object Credential 
{
  implicit val credentialFmt = Json.format[Credential]
  def identity:Credential = Credential("","","")
}
