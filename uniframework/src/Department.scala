/*
 * @param dpId department ID
 * @param dpName department name
 */

case class Department(dpId: String, dpName: String)

object Department extends  App
{
  implicit val department = Department(dpId= "", dpName = "")


  println("Department details :" +department.dpId+ "" + department.dpName)

}
