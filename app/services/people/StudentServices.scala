package services.people

import com.datastax.driver.core.ResultSet
import domain.people.Student
import services.people.Impl.StudentServicesImpl

import scala.concurrent.Future

trait StudentServices {

  def save(student: Student): Future[ResultSet]

  def getStudents(studentId: String): Future[Seq[Student]]

  def getStudent(studentId: String): Future[Student]

  def deleteStudents(studentd: String): Future[ResultSet]
}

object StudentServices{
  def apply: StudentServices = new StudentServicesImpl
}
