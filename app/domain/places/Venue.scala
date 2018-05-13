package domain.places

import play.api.libs.json.Json

case class Venue(id:String, room: String, description:String)

object Venue{
  implicit val venueJson = Json.format[Venue]
}
