package domain.assessments

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
 * created by Dorcas
 *
 * @param subjectId
 * @param subjectName
 * @param venueNo   -  the Venue Number
 * @param examTime  -  Exam starting time 
 * @param examController
 * @param examDate
 *
 */

case class Exam(subjectId:String,
                subjectName:String,
                venueNo:String,
                examTime:String,
                examController:String,
                examDate: LocalDateTime)

object Exam{
  implicit val examFmt = Json.format[Exam]
  def identity: Exam = Exam("", "", "", "", "", LocalDateTime.now())

}
