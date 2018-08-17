package services.courses

/**
 * creater Reece
 * reviewer Yandisa
 *
 */

import com.datastax.driver.core.ResultSet
import domain.courses.Faculty
import services.courses.Impl.FacultyImpl

import scala.concurrent.Future

trait FacultyServices 
{
  def save(fac: Faculty): Future[ResultSet]

  def getFaculties(facId: String): Future[Seq[Faculty]]

  def getFaculty(facId: String): Future[Faculty]

  def deleteFaculties(facId: String): Future[ResultSet]
}

object FacultyServices
{
  def apply: FacultyServices = new FacultyServicesImpl
}
