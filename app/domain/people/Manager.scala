package domain.people

import java.time.LocalDateTime
import play.api.libs.json.Jso

/**
  *
  * created by Kessel
  * @param managerID
  * @param firstname
  * @param lastname
  * @param telNo
  * @param emailAddr
  * @param addr
  * @param managerStartDate
  * @param managerEndDate
  *
  */


case class Manager(managerID: String, firstname: String, lastname: String, telNo: Int, emailAddr: String, addr: String, managerStartDate: LocalDateTime, managerEndDate: LocalDateTime)

object Manager {

  implicit val managerFormat = Json.format[Manager]
  def identity: Manager = Manager("","","",0,"","",LocalDateTime.now(),LocalDateTime.now())

}
