package domain.places

import org.scalatest.FunSuite
import play.api.libs.json.Json

class VenueTest extends FunSuite{

  test("Test the Venue Creation and Json generation "){
    val venue = Venue("1","T9","Lecture")
    val json = Json.toJson(venue)
    assert("T9"==venue.room)
    println("Json is ", json)
  }

}
