package communication
import java.util._
import java.time.LocalDateTime


/*
Full Name: Kessel Okinga Koumou
Student Number: 216012759
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

