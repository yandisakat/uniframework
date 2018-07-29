package communication
import java.util._
import java.time.LocalDateTime


/**
  * created by Kessel
  * @param comID
  * @param comTitle
  * @param desc
  * @param date
  */

case class Communication (comID: String,
                 comTitle: String,
                 desc: String,
                 date: LocalDateTime)
                 //time: LocalDateTime;



object communication {
  implicit val communicationFormat = Json.format[Communication]

  def identity: Communication = Communication("", "", "", LocalDateTime.now())
}

