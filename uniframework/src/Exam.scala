/*
 * @param subject name
 * @param venue no the number of the venue
 * @param exam time
 * @param exam controller
 * @param exam date
 *
 */
case class Exam(subject_name:String, venue_no:String, exam_time:String, exam_controller:String, exam_date:String)

object Exam extends App
{

  var exam = new Exam("ADP",venue_no = "1.35", exam_time = "2 PM",exam_date = "17 June",exam_controller = "RothMan")

  println("Subject : " +exam.subject_name )
  println("Venue no: " +exam.venue_no )
  println("Date: " +exam.exam_time)
  println("Time: " +exam.exam_date)
  println("Controller: " +exam.exam_controller )

}
