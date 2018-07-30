package domain.places

/*
 * created ny Yandisa
 * @param Venue ID
 * @param Venue name
 * @param Entity ID
 * @param Capacity
 *
 * By Yandisa Katiya
 */

import play.api.libs.json.Json

case class Venue(venueId:String, venueName: String, entityId:String, capacity: Int)

object Venue
{
  implicit val venueJson = Json.format[Venue]
  def definity: Venue = Venue ("", "", "", 0)
}
