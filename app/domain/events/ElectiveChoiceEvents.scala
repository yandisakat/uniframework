package domain.event

import java.time.LocalDateTime

 class ElectiveChoiceEvents(val studentID: Int, val subjectID: String, val eventData: LocalDateTime) {
  var student_ID: Int = studentID
  var subject_ID: String = subjectID
  var event_Data: LocalDateTime

  def getStudent_ID(): Int = {
    return this.student_ID
  }

  def getSubject_ID(): String = {
    return this.subjectID
  }

  def getEvent_Data(): LocalDateTime = {

    return this.event_Data
  }

  def choice(): Unit = {

    println(s"Student ID: ${student_ID}");
    println(s"Subject ID: ${subject_ID}");
    println(s"Event Data and Time: ${event_Data}");

  }


}

object ElectiveChoiceEvents extends App
{
  var elChoice = new ElectiveChoiceEvents (216012734, "ICE3213", LocalDateTime.now()) {
    elChoice.choice()
  }

}
