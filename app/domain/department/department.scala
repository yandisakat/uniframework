package domain.department

import java.time.LocalDateTime
import play.api.libs.json.Json

/**
  * created by Reece
  * part1: reviewed by Kessel
  * part2:
  *
  * @param dpId
  * @param dpName
  * @param managerID
  * @param managerStartDate
  * @param managerEndDate
  *
  *
  *  managerStartDate: when the contract start
  *  managerEndDate: when the constract end
  */

case class Department(dpId: String, dpName: String, managerID: String, managerStartDate: LocalDateTime, managerEndDate: LocalDateTime)

object Department
{
  implicit val DepartmentFormat = Json.format[Department]


  def identity: Department = Department("", "","",LocalDateTime.now(),LocalDateTime.now())

}
