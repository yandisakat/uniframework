package domain.department;

import play.api.libs.json.Json

/* 
 * @created by dorcas
 * @param depId department ID
 * @param depName department name
 */

case class Department(depId: String, depName: String)

object Department
{
  implicit val department = Json.format[Department]
  def identity: Department = Department("", "")
}
