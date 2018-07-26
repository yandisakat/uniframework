
import java.time.LocalDateTime

 class ElectiveChoiceEvents(val student_ID: Int,
                            val subject_ID: String,
                            val event_Data: LocalDateTime)
 {

   var studentID: Int = student_ID
   var subjectID: String = subject_ID
   var eventData: LocalDateTime = event_Data

  def getStudent_ID(): Int = {
    return this.studentID;
  }

  def getSubject_ID(): String = {
    return this.subjectID;
  }

  def getEvent_Data(): LocalDateTime = {

    return this.eventData;
  }

  def choice()={

    println("Student ID: " + studentID)
    println("Subject ID: " + subjectID)
    println("Event Data and Time: " + eventData)


  }


}

object ElectiveChoiceEvents extends App
{
  var elChoice = new ElectiveChoiceEvents (216012734, "ICE3213", LocalDateTime.now()) {
    elChoice.choice()
  }

}
