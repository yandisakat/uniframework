package domain.courses

import play.api.libs.json.Json

/**
* Part 2 - Reviewed by Yandisa Katiya
* @param courseId
* @param name
* @param description
* @param subjects
*/


case class Course(id:String, name:String, description:String,credits:Double,subjects:List[String])


object Course
{
  implicit  val courseForm = Json.format[Course]
  def identity:Course = Course("","","", 0.0, NULL)
}
