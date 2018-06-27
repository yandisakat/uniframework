/**
  * Created by Dorcas
  * Exam class version 1.1
  */
class Exam(val subject_name:String, val venue_no:String, val exam_time:String, val exam_controller:String, val exam_date:String)
{
  var subName: String = subject_name
  var venueNo: String = venue_no
  var examTime: String = exam_time
  var examDate: String = exam_date
  var examController: String = exam_controller


}
object Exam extends App
{

  var exam = new Exam("ADP",venue_no = "1.35", exam_time = "2 PM",exam_date = "17 June",exam_controller = "RothMan")

  println("Subject : " +exam.subject_name )
  println("Venue no: " +exam.venue_no )
  println("Date: " +exam.exam_time)
  println("Time: " +exam.exam_date)
  println("Controller: " +exam.exam_controller )

}
