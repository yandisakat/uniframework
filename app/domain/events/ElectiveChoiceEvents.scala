
import java.time.LocalDateTime

abstract class ElectiveChoiceEvents(val studentID: Int, val subjectID: String, val eventData: LocalDateTime)

{
  var student_ID: Int = studentID
  var subject_ID: String = subjectID
  var event_Data: LocalDateTime

  def getStudent_ID(): Int = {
    return this.student_ID
  }
  def getSubject_ID(): String = {
    return this.subjectID
  }
  def getEvent_Data(): LocalDateTime ={
    return this.event_Data
  }
  def choice()= {

    println("Student ID: "+student_ID)
    println("Subject ID: "+subject_ID)
    println("Event Data and Time: "+event_Data)
  }

}


object ElectiveChoiceEvents extends App
{
  var elChoice = new ElectiveChoiceEvents (216012734, "ICE3213", "12/05/2018 09:00" );
  elChoice.choice();
}
