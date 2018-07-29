package domain.courses


/**
 * @created by Reece 
 * @param faculty ID
 * @param faculty name
 * @param faculty desscription
 *
 */


import play.api.libs.json.Json

case class Faculty(id:Int, name:String, room: String, description:String)

object Faculty{

  implicit val facultyJson = Json.format[Faculty]
  def identity:Faculty = Faculty("","","","")
  
}
