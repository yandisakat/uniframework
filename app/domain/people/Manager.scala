package domain.people

import java.time.LocalDateTime
import play.api.libs.json.Jso

/**
  *
  * @param managerID
  * @param firstname
  * @param lastname
  * @param dateofbirth
  * @param telNo
  * @param emailAddr
  * @param addr
  * @param managerStartDate
  * @param managerEndDate
  */

case class Manager(managerID: String, firstname: String, lastname: String,dateofbirth: LocalDate, telNo: Int, emailAddr: String, addr: String, managerStartDate: LocalDateTime, managerEndDate: LocalDateTime)

object Manager {

  implicit val managerFormat = Json.format[Manager]
  def identity: Manager = Manager("","","",LocalDateTime.now(),0,"","",LocalDateTime.now(),LocalDateTime.now())

}
