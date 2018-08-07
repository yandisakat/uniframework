package services.courses.Impl

import com.datastax.driver.core.ResultSet
import domain.courses.Faculty
import repositories.courses.FacultyRepository
import services.courses.FacultyServices

import scala.concurrent.Future

class FacultyServicesImpl extends FacultyRepository with FacultyServices{
  def save(faculty: Faculty): Future[ResultSet] = {
    database.facultyTable.save(faculty)
  }

  def getFaculties(facId: String): Future[Seq[Faculty]] = {
    database.facultyTable.getFaculties(facId)
  }

  def getFaculty(facId: String): Future[Faculty] = {
    database.facultyTable.getFaculties(facId).map(faculty => faculty.head)
  }

  def deleteFaculties(facId:String):Future[ResultSet] ={
    database.facultyTable.deleteFaculties(facId)
  }
}

object FacultyServicesImpl extends FacultyServicesImpl with FacultyRepository
}
