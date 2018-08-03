package domain.places
import play.api.libs.json.Json

/*
 * @created by Yandisa Katiya
 *
 * @param Venue ID
 * @param Venue name
 * @param Entity ID
 * @param Capacity
 */

case class Venue(venueId:String, venueName: String, entityId:String, capacity: Int)

object Venue
{
  implicit val venueJson = Json.format[Venue]
  def definity: Venue = Venue ("", "", "", 0)
}
