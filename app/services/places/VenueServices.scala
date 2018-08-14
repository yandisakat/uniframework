package services.places


/**
 * creater Reece
 * reviewer Wailed
 *
 */

import com.datastax.driver.core.ResultSet
import domain.places.Venue
import services.places.Impl.VenueServicesImpl

import scala.concurrent.Future

trait VenueServices {

  def save(venue: Venue): Future[ResultSet]

  def getVenues(venueId: String): Future[Seq[Venue]]

  def getVenue(venueId: String): Future[Venue]

  def deleteVenues(venueId: String): Future[ResultSet]
}

object VenueServices{
  def apply: VenueServices = new VenueServicesImpl
}
