package domain.courses

import play.api.libs.json.Json

/**
* Reviewed by Yandisa Katiya
* @param courseId  shorthand identification of course/ course code
* @param name
* @param description
* @param credits
* @param subjects  list of subjects belonging to the course
*/

case class Course(courseId:String,
                  name:String,
                  description:String,
                  credits:Double,
                  subjects:List[String])

object Course
{
  implicit val courseForm = Json.format[Course]
  def identity:Course = Course("","","", 0.0, null)
}
