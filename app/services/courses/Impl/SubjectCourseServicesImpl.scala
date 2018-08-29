package services.courses.Impl

import com.datastax.driver.core.ResultSet
import domain.courses.SubjectCourse
import repositories.courses.SubjectCourseRepository
import services.courses.SubjectCourseServices

import scala.concurrent.Future

/** 
 * creater Wailed
 * reviewer Omega
 *
 *
*/

class SubjectCourseServicesImpl extends SubjectCourseRepository with SubjectCourseServices{
  def save(subjectCourse: SubjectCourse): Future[ResultSet] = {
    database.subjectCourseTable.save(subjectCourse)

  }

  def getSubjectCourses(subjectId: String): Future[Seq[SubjectCourse]] = {
    database.subjectCourseTable.getSubjectCourse(subjectId)

  }

  def getSubjectCourse(subjectId: String): Future[SubjectCourse] = {
    database.SubjectCourseTable.getSubjectCourse(subjectId).map(subjectCourse => subjectCourse.head)
  }

  def deleteSubjectCourses(subjectId:String):Future[ResultSet] ={
    database.subjectCourseTable.deleteSubjectCourses(subjectId)
  }

}

object SubjectCourseServicesImpl extends SubjectCourseServicesImpl with SubjectCourseRepository


}
