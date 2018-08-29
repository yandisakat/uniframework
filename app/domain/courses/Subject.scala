package domain.courses
import play.api.libs.json.Json

/**
  *created by Kessel
  * @param subjId
  * @param subjName
  * @param subjDescr
  * @param subjCredits
  */

case class Subject(subjId: String, subjName:String, subjDescr: String, subjCredits: Double)

object Subject {
  implicit val subject = Json.format[Subject]
  def identity:Subject = Subject ("","","",0.0)
}
