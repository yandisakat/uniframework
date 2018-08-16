/**
 * creater Dorcas
 * reviewer Reece
 *
 */
package services.assessments.Impl

import com.datastax.driver.core.ResultSet
import domain.assessments.Exam
import repositories.assessment.ExamRepository
import services.assessments.ExamService

import scala.concurrent.Future

class ExamServicesImpl extends ExamRepository with ExamService{
  def save(exam: Exam: Future[ResultSet] = {
    database.ExamTable.save(exam)

  }
   def getExamDetails(examId: String): Future[Seq[Exam]] = {
     database.ExamTable.getExamDetails(examId)

  }
   def getExamDetails(examId: String): Future[Exam] = {
      database.ExamTable.getExamDetails(examId).map(exam => exam.head)
  }
           
   def deleteExam(examId:String):Future[ResultSet] ={
      database.ExamTable.deleteExam(examId)
  }
