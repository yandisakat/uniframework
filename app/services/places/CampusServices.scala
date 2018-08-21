package services.places

/**
 * creater Reece
 * reviewer Thomas - Reviewed 
 *
 */

import com.datastax.driver.core.ResultSet
import domain.places.Campus
import services.places.Impl.CampusServicesImpl

import scala.concurrent.Future

trait CampusServices {

  def save(campus: Campus): Future[ResultSet]

  def getCampus(campusId: String): Future[Seq[Campus]]

  def getCampus(campusId: String): Future[Campus]

  def deleteCampuses(campusId: String): Future[ResultSet]
}

object CampusServices{
  def apply: CampusServices = new CampusServicesImpl
}
