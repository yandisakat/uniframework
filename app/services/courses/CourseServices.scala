package services.courses


/**
 * creater Reece
 * Reviewed by Thomas -  
 *
 */

import com.datastax.driver.core.ResultSet
import domain.courses.Course
import services.courses.Impl.CourseImpl

import scala.concurrent.Future

trait CourseServices {

  def save(course: Course): Future[ResultSet]

  def getCourses(courseId: String): Future[Seq[Course]]

  def getCourse(courseId: String): Future[Course]

  def deleteCourses(courseId: String): Future[ResultSet]
}

object CourseServices{
  def apply: CourseServices = new CourseServicesImpl
}
