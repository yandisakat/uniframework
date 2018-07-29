package domain.places

/**
 * created by Katiya 
 * @param Venue ID
 * @param Venue name
 
 --Complete the documentation
 *
 */

import play.api.libs.json.Json

case class Venue(venueId:String, venueName: String, entityId:String, capacity: Int)

object Venue{
  implicit val venueJson = Json.format[Venue]
}
