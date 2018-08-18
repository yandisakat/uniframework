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

  def save(role: SubjectGrade): Future[ResultSet]

  def getUserRoles(subjectId: String): Future[Seq[SubjectGrade]]

  def getUserRole(subjectId: String): Future[SubjectGrade]

  def deleteUserRoles(subjectId: String): Future[ResultSet]
}

object SubjectGradeServices{
  def apply: SubjectGradeServices = new SubjectGradeServicesImpl
}
