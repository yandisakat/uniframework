package services.places.Impl

/**
 * creater Reece
 * reviewer Wailed
 *
 */

import com.datastax.driver.core.ResultSet
import domain.places.Venue
import repositories.places.VenueRepository
import services.places.VenueServices

import scala.concurrent.Future

class VenueServicesImpl extends VenueRepository with VenueServices{
  def save(venue: Venue): Future[ResultSet] = {
    database.venueTable.save(venue)

  }

  def getVenues(venueId: String): Future[Seq[Venue]] = {
    database.venueTable.getVenues(venueId)

  }

  def getVenue(venueId: String): Future[Venue] = {
    database.venueTable.getVenues(venueId).map(venue => venue.head)
  }

  def deleteVenues(venueId:String):Future[ResultSet] ={
    database.venueTable.deleteVenues(venueId)
  }

}

object VenueServicesImpl extends VenueServicesImpl with VenueRepository


}
