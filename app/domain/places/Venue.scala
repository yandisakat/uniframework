package domain.places
import play.api.libs.json.Json

/*
 * @created by Yandisa Katiya
 * @param venueId
 * @param venueName
 * @param capacity
 * @param description
 */

case class Venue(venueId:String, venueName:String, capacity: Int, description: String)

object Venue
{
  implicit val venueJson = Json.format[Venue]
  def identity: Venue = Venue ("", "",0,"")
}
