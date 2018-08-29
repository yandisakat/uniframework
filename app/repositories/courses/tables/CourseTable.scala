
package repositories.courses.tables

/*created for Wailed
 * created by Kessel 
 */

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.Course

import scala.concurrent.Future


abstract class CourseTable extends Table[CourseTable, Course] {

  object courseId   extends StringColumn with PartitionKey

  object name extends StringColumn

  object subjects extends StringColumn  with Ascending

}

abstract class CourseImpl extends CourseTable with RootConnector {

  override lazy val tableName = "course"

  def save(course: Course): Future[ResultSet] = {
    insert
      .value(_.courseId  , faculty.courseId)
      .value(_.name, faculty.name)
      .value(_.subjects, faculty.subjects)
      .future()
  }

  def getCourse(courseId:String, name: String): Future[Seq[Course]] = {
    select
      .where(_.courseId eqs cousreId)
      .and(_.name eqs name)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteCourse(courseId:String, name: String):Future[ResultSet] ={
    delete
      .where(_.courseId eqs courseId)
      .and(_.name eqs name)
      .future()
  }
}
