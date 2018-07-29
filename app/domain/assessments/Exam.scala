import play.api.libs.json.Json
/*
 * @param subject ID
 * @param subject name
 * @param venue no the number of the venue
 * @param exam time
 * @param exam controller
 * @param exam date
 *
 */
case class Exam(subject_ID:String, subject_name:String, venue_no:String, exam_time:String, exam_controller:String, exam_date:String)

object Exam extends App
{

  implicit val exam = Json.format[Exam]

  def identity: Exam = Exam("", "", "","","","")

}
