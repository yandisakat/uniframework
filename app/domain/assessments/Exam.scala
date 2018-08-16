package domain.assessments

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
 * created by Dorcas
 * @param examId /this variable as been added to identify each exam by its ID seeing that many exams can be written 
 * the same day and simultaniously
 * @param subjectId
 * @param subjectName
 * @param venueNo   -  the Venue Number
 * @param examTime  -  Exam starting time 
 * @param examController
 * @param examDate
 *
 */

case class Exam(examId: String,
                subjectId:String,
                subjectName:String,
                venueNo:String,
                examTime:String,
                examController:String,
                examDate: LocalDateTime)

object Exam{
  implicit val examFmt = Json.format[Exam]
  def identity: Exam = Exam("", "", "", "", "", LocalDateTime.now())

}
