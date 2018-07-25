package domain.places

import play.api.libs.json.Json

case class Venue(venueId:String, venueName: String, entityId:String, capacity: Int)

object Venue{
  implicit val venueJson = Json.format[Venue]
}
