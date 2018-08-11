package domain.events
import java.time.LocalDateTime

/**
  *
  * created by Kessel
  *
  * @param studID
  * @param subjID
  * @param eventDate
  */

case class ElectiveChoiceEvents( studId:String, subjId:String, eventDate:LocalDateTime)

object ElectiveChoiceEvents 
{
  implicit val ElectiveC = Json.format[ElectiveChoiceEvents];
  def identify: ElectiveChoiceEvents = ElectiveChoiceEvents ("","",LocalDateTime.now());
}
