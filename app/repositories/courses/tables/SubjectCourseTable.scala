package repositories.courses.tables

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.SubjectCourse
import scala.concurrent.Future

/**
  * created by Natasha
  *
  */

abstract class SubjectCourseTable extends Table[SubjectCourseTable, SubjectCourse] {

  object studentId extends StringColumn PrimaryKey with ClusteringOrder with Ascending

  object courseId extends StringColumn 
}

abstract class SubjectCourseTableImpl extends SubjectCourseTable with RootConnector {

  override lazy val tableName = "subjectcourse"

  def save(role: SubjectCourse): Future[ResultSet] = {
    insert
      .value(_.studentId, role.studentId)
      .value(_.courseId, role.courseId)
      .future()
  }

  def getSubjectCourse(studentId:String, courseId: String): Future[Seq[SubjectCourse]] = {
    select
      .where(_.studentId eqs studentId)
      .and(_.courseId eqs courseId)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteSubjectCourse(studentId:String, courseId: String):Future[ResultSet] ={
    delete
      .where(_.studentId eqs studentId)
      .and(_.courseId eqs courseId)
      .future()
  }
}
