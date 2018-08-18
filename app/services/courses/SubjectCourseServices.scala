package services.courses

import com.datastax.driver.core.ResultSet
import domain.courses.SubjectCourseServices
import services.courses.Impl.SubjectCourseServicesImpl

import scala.concurrent.Future

/** 
 * creater Wailed
 * reviewed Omega
 *
 *
*/


trait SubjectCourseServices {

  def save(subjectCourse: SubjectCourse): Future[ResultSet]

  def getSubjectCourse(subjectId: String): Future[Seq[SubjectCourse]]

  def getSubjectCourse(subjectId: String): Future[SubjectCourse]

  def deleteSubjectCourses(subjectId: String): Future[ResultSet]
}

object SubjectCourseServices{
  def apply: SubjectCourseServices = new SubjectCourseServicesImpl
}
