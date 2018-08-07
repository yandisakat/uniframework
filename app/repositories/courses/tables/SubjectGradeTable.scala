package repositories.courses.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.StudentGrade

import scala.concurrent.Future


abstract class StudentGradeTable extends Table[StudentGradeTable, StudentGrade] {

  object studentNumber extends StringColumn with PartitionKey

  object subjectCode extends StringColumn

  object examName extends Col[String] with Ascending

  object category extends StringColumn
  
  object marks extends DoubleColumn
  
  object date extends Col[LocalDateTime]
}

abstract class StudentGradeTableImpl extends StudentGradeTable with RootConnector {

  override lazy val tableName = "studentgrade"

  def save(studentgrade: StudentGrade): Future[ResultSet] = {
    insert
      .value(_.studentNumber, studentgrade.orgId)
      .value(_.studentCode, studentgrade.emailId)
      .value(_.examName, studentgrade.roleId)
      .value(_.category, studentgrade.date)
      .value(_.marks, studentgrade.marks)
      .value(_.date, studentgrade.date)
      .future()
  }

  def getStudentGrades(studentNumber:String, examName: String): Future[Seq[StudentGrade]] = {
    select
      .where(_.studentNumber eqs studentNumber)
      .and(_.examName eqs examName)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteStudentGrades(studentNumber:String, examName: String):Future[ResultSet] ={
    delete
      .where(_.studentNumber eqs studentNumber)
      .and(_.examName eqs examName)
      .future()
  }
}
