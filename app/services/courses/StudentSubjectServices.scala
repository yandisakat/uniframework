/** 
 * created by Omega Mbadu
 * reviewer Dorcas Mbi
*/

import com.datastax.driver.core.ResultSet
import domain.courses.StudentSubjects
import services.courses.Impl.SubjectSubjectsServicesImpl

import scala.concurrent.Future

trait StudentSubjectServices {

  def save(studentSubjects: StudentSubjects): Future[ResultSet]

  def getStudentSubjects(studentSubjects: StudentSubjects): Future[Seq[StudentSubjects]]

  def addToStudentSubjects(subjectID:String:Future[Seq[ResultSet]]
  def editStudentSubjects(studentSubjects: StudentSubjects): Future[StudentSubjects]

  def deleteFromStudentSubjects(subjectId: String): Future[ResultSet]
}

object StudentSubjectServices{
  def apply: StudentSubjectServices = new StudentSubjectServicesImpl
}
