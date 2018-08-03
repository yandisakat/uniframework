package domain.department


import java.time.LocalDateTime
import play.api.libs.json.Json


/**
  *
  * created by Reece
  * part 1: reviewer Kessel
  *
  * @param dpId
  * @param dpName
  * @param managerID
  * @param managerStartDate
  * @param managerEndDate
  *
  *
  * here the manager is like a HOD
  */

case class Department(dpId: String, dpName: String, managerID: String, managerStartDate: LocalDateTime, managerEndDate: LocalDateTime)

object Department
{
  implicit val departmentFormat = Json.format[Department]

  def identity: Department = Department("", "","",LocalDateTime.now(),LocalDateTime.now())

}
