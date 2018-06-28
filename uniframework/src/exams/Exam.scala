package uniframeWork

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

  def getSubjectName(): String = {
       return this.subName;
     }

  def getVenueNo() : String = {
    return this.venueNo
  }

  def getExamTime() : String = {
    return this.examTime
  }

  def getExamDate() : String = {
    return this.examDate
  }

  def getExamController() : String = {
    return this.examController
  }

  def ExamDetails() =
  {
    println("Subject : " +getSubjectName() )
    println("Venue no: " +getVenueNo())
    println("Date: " +getExamDate())
    println("Time: " +getExamTime())
    println("Controller: " +getExamController())
  }
}
object Exam extends App
{

  var exam = new Exam("ADP",venue_no = "1.35", exam_time = "2 PM",exam_date = "17 June",exam_controller = "RothMan")

  exam.ExamDetails()

}
