package repositories.assessment.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.assessments.Exam

import scala.concurrent.Future

abstract class ExamTable extends Table[ExamTable, Exam] {
  
  object examId extends StringColumn with PrimaryKey
  
  object subjectId extends StringColumn with PartitionKey

  object subjectName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending

  object venueNo extends StringColumn

  object examTime extends StringColumn
  
  object examController extends StringColumn
  
  object examDate extends Col[LocalDateTime] with PrimaryKey with ClusteringOrder with Ascending

}

abstract class ExamTableImpl extends ExamTable with RootConnector {

  override lazy val tableName = "exam"

  def save(role: exam): Future[ResultSet] = {
    insert
      .value(_.examId, exam.examId)
      .value(_.subjectId, role.subjectId)
      .value(_.subjectName, role.subjectName)
      .value(_.venueNo, role.venueNo)
      .value(_.examTime, role.examTime)
      .value(_.examController, role.examController)
      .value(_.examDate, role.examDate)
      .future()
  }

  def getExam(subjectId:String, venueNo:String, examDate:LocalDateTime): Future[Seq[Exam]] = {
    select
      .where(_.subjectId eqs subjectId)
      .and(_.venueNo eqs venueNo)
      .and(_.examDate eqs examDate)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteExam(subjectId:String, venueNo:String, examDate:LocalDateTime):Future[ResultSet] ={
    delete
      .where(_.subjectId eqs subjectId)
      .and(_.venueNo eqs venueNo)
      .and(_.examDate eqs examDate)
      .future()
  }
}
