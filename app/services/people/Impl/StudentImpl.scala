package services.people.Impl

import com.datastax.driver.core.ResultSet
import domain.people.Student
import repositories.people.StudentRepository
import services.people.StudentServices

import scala.concurrent.Future

class StudentServicesImpl extends StudentRepository with StudentServices{
  def save(people: Student): Future[ResultSet] = {
    database.studentTable.save(people)

  }

  def getStudents(studentId: String): Future[Seq[Student]] = {
    database.studentTable.getStudents(studentId)

  }

  def getStudent(studentId: String): Future[Student] = {
    database.studentTable.getStudents(studentId).map(student => student.head)
  }

  def deleteStudents(studentId:String):Future[ResultSet] ={
    database.studentTable.deleteStudents(studentId)
  }

}

object StudentServicesImpl extends StudentServicesImpl with StudentRepository


}
