package services.assessments

import com.datastax.driver.core.ResultSet
import domain.assessments.Exam
import services.assessments.Impl.ExamServicesImpl

import scala.concurrent.Future

trait ExamServices {

  def save(examId: Exam): Future[ResultSet]

  def getExamDetails(examId: String): Future[Seq[Exam]]

  def getExamDetails(examId: String): Future[Exam]

  def deleteExam(examId: String): Future[ResultSet]
}

object ExamServices{
  def apply: ExamServices = new ExamServicesImpl
}
