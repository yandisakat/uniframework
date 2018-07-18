package ElectiveSubject
import java.time.LocalDateTime
import play.api.libs.json.Json

/*
Full Name and Student Number: Kessel Okinga Koumou  216012759
Full Name and Student Number: Natasha dU Toit 21
*/

case class Subject (status: String,
                    description: String,
                    duration: String)

object Subjectubject {
  implicit val subj = Json.format[Subject]

  def identity: Subject = Subject ("","","")
}

