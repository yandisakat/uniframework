package domain.courses

import play.api.libs.json.Json

/**
* Part 2 - Reviewed by Yandisa Katiya
* @param courseId - Shorthand identification of course/ course code
* @param name
* @param description
* @param subjects - Subjects belonging to the course, type List
*/


case class Course(id:String, name:String, description:String,credits:Double,subjects:List[String])


object Course
{
  implicit  val courseForm = Json.format[Course]
  def identity:Course = Course("","","", 0.0, NULL)
}
