package domain.places

import play.api.libs.json.Json
import domain.courses.Faculty

/**
  * created by Reece Waldeck
  * @param campId
  * @param campName
  * @param campAddr
  * @param faculties  List of faculties a campus hosts
*/ 

case class Campus(campId: String, campName: String, campAddr: String, faculties: List[Faculty])

object Campus
{
  implicit val Campusfmt = Json.format[Campus]
  def definity: Campus = Campus ("","","",null)
}
