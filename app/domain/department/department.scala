/*
Created by Dorcars on 


--Documentation

*/

import play.api.libs.json.Json
/*
 * @param dpId department ID
 * @param dpName department name
 */

case class Department(dpId: String, dpName: String)

object Department extends  App
{
  implicit val department = Json.format[Department]

  def identity: Department = Department("", "")

}
