package domain.events

import java.time.LocalDateTime


/**
  *
  * created by Kessel
  * @param student_ID student unique ID
  * @param subject_ID subject unique ID
  * @param event_Date
  */




case class ElectiveChoiceEvents( student_ID:Int, subject_ID:String, event_Date:LocalDateTime)


object ElectiveChoiceEvents {
  implicit val ElectiveC = Json.format[ElectiveChoiceEvents]
  def identify: ElectiveChoiceEvents = ElectiveChoiceEvents (0,"",LocalDateTime.now());

}
