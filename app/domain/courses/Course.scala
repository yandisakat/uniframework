package domain.courses

import play.api.libs.json.Json

/**
* @param courseId
* @param name
* @param description
* @param subjects
*/

case class Course(courseId:String, name:String, description:String,subjects:List[String])

object Course{
  implicit  val courseForm = Json.format[Course]
  def identity:Course = Course("","","", Nil)
}
