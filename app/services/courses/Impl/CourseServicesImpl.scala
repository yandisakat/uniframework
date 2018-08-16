package services.courses.Impl

/**
 * creater Reece
 * reviewer Thomas
 *
 */

import com.datastax.driver.core.ResultSet
import domain.courses.Course
import repositories.courses.CourseRepository
import services.courses.CourseServices

import scala.concurrent.Future

class CourseServicesImpl extends CourseRepository with CourseServices{
  def save(course: Course): Future[ResultSet] = {
    database.courseTable.save(course)
  }

  def getCourses(courseId: String): Future[Seq[Course]] = {
    database.courseTable.getCourses(courseId)
  }

  def getUserRole(courseId: String): Future[Course] = {
    database.courseTable.getCourses(coursesId).map(course => course.head)
  }

  def deleteCourses(courseId:String):Future[ResultSet] ={
    database.courseTable.deleteCourses(courseId)
  }
}

object CourseServicesImpl extends CourseServicesImpl with CourseRepository
}
