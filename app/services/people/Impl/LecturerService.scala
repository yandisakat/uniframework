package services.people.Impl

/**
 * creater Kessel
 * reviewer Omega
 *
 */


import com.datastax.driver.core.ResultSet
import domain.people.Lecturer
import repositories.people.LecturerRepository
import services.people.LecturerServices

import scala.concurrent.Future

class LecturerServicesImpl extends LecturerRepository with LecturerServices
{
  def save(lecture: Lecturer): Future[ResultSet] = 
  {
      database.LecturerTable.save(lecturer)
  }
  
  def getLecturer(lectId: String): Future[Seq[Lecturer]] =
  {
      database.lecturerTable.getLecturer(lectId)
  }
  
  def getMark(lectId: String): Future[lecturer] = 
  {
      database.lecturerTable.getLecturer(lectId).map(lecturer => lecturer.head)
  }
  
  def deleteLecturer(lectId: String): Future[ResultSet] =
  {
      database.lecturerTable.deleteLecturer(lecturerId)
  }
}

object LecturerServicesImpl extends LecturerServicesImpl with LecturerRepository
  
}

