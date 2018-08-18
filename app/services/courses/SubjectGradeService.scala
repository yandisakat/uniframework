package services.courses

/** 
 * created by Natasha
 * reviewer Omega
*/

import com.datastax.driver.core.ResultSet
import domain.courses.SubjectGrade
import services.courses.Impl.SubjectGradeServicesImpl

import scala.concurrent.Future

trait SubjectGradeServices {

  def save(subjectgrade: SubjectGrade): Future[ResultSet]

  def getSubjectGrade(subjectId: String): Future[Seq[SubjectGrade]]

  def getSubjectGrade(subjectId: String): Future[SubjectGrade]

  def deleteSubjectGrade(subjectId: String): Future[ResultSet]
}

object SubjectGradeServices{
  def apply: SubjectGradeServices = new SubjectGradeServicesImpl
}
