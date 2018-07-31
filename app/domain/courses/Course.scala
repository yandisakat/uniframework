package domain.courses

/**
*
*created by .....

---Documentation
*
*
*/



import play.api.libs.json.Json


case class Course(id:String, name:String, description:String,subjects:List[String])

object Course{
  implicit  val courseForm = Json.format[Course]
  def identity:Course = Course("","","", Nil)
}
