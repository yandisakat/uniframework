package services.courses

/** 
 * creater Reece
 * reviewed by Omega
 *
 *
*/

import com.datastax.driver.core.ResultSet
import domain.courses.Subject
import services.courses.Impl.SubjectServicesImpl

import scala.concurrent.Future

trait SubjectServices {

  def save(subject: Subject): Future[ResultSet]

  def getSubjects(subjId: String): Future[Seq[Subject]]

  def getSubject(subjId: String): Future[Subject]

  def deleteSubjects(subjId: String): Future[ResultSet]
}

object SubjectServices{
  def apply: SubjectServices = new SubjectServicesImpl
}
