package domain.users

import java.time.LocalDateTime
import play.api.libs.json.Json

/**
 * 
 * @param orgId
 * @param email
 * @param firstName
 * @param lastName
 * @param screenName
 * @param password
 * @param state
 * @param date
 */

case class StudentSubject(orgId: String,
                          email: String,
                          firstName: Option[String],
                          lastName: Option[String],
                          screenName: String,
                          password: String,
                          state: String,
                          date: LocalDateTime)


object StudentSubject{
  
  implicit val studentSubjectFmt = Json.format[StudentSubject]
  def identity: StudentSubject = StudentSubject("","",None,None,"","","",LocalDateTime.now())
  
}
