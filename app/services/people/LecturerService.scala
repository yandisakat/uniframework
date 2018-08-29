package services.people

/**
 * creater Kessel
 * reviewer Omega
 *
 */

import com.datastax.driver.core.ResultSet
import domain.people.Lecturer
import services.people.Impl.LecturerServicesImpl

import scala.concurrent.Future

trait LecturerServices {

  def save(lecturer: Lecturer): Future[ResultSet]

  def getLectures(lectId: String): Future[Seq[Lecturer]

  def getLecture(lectId: String): Future[Lecturer]

  def deleteLecturer(lectId: String): Future[ResultSet]
}

object LecturerServices{
  def apply: LecturerServices = new LecturerServicesImpl
}
