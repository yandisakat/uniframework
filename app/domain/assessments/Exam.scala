import play.api.libs.json.Json
/**
 * created by Dorcas 
 * @param subject ID
 * @param subject name
 * @param venue no the number of the venue
 * @param exam time
 * @param exam controller
 * @param exam date
 *
 */
case class Exam(subjectID:String, subjectName:String, venueNo:String, examTime:String, examController:String, examDate:String)

object Exam extends App
{

  implicit val exam = Json.format[Exam]

  def identity: Exam = Exam("", "", "","","","")

}
