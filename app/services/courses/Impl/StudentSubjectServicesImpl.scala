
package services.courses.Impl


/**
 * creater Omega
 * created by Kessel
 * reviewer Dorcas
 */

import com.datastax.driver.core.ResultSet
import domain.courses.StudentSubject
import repositories.courses.StudentSubjectRepository
import services.courses.StudentSubjectService

import scala.concurrent.Future

class StudentSubjectServicesImpl extends StudentSubjectRepository with StudentSubjectService{
  def save(studentsubject: StudentSubject: Future[ResultSet] = {
    database.StudentSubjectTable.save(studentsubject)

  }
   def getStudentSubjectDetails(orgId: String): Future[Seq[StudentSubject]] = {
     database.StudentSubjectTable.getStudentSubjectDetails(orgId)

  }
   def getStudentSubjectetails(orgId: String): Future[StudentSubject] = {
      database.StudentSubjectTable.getStudentSubjectDetails(orgId).map(studentsubject => studentsubject.head)
  }
           
   def deleteStudentSubject(orgId:String):Future[ResultSet] ={
      database.StudentSubjectTable.deleteStudentSubject(orgId)
  }
}

object StudentSubjectServicesImpl extends StudentSubjectServicesImpl with StudentSubjectRepository


}
