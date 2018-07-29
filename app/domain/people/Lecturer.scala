package domain.people



/*
*
* @created by Reece

--Ducumentation

*/

import play.api.libs.json.Json

case class Lecturer(val firstname: String, val lastname: String, val telNo: String, val emailAddr: String, val classes: List[Subject_Class])

object Lecturer{
  implicit val lecturerJson = Json.format[Lecturer]
  
  
}
