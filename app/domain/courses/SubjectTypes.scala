package domain.courses

import play.api.libs.json.Json

/**
  *@created by Natasha
  */

case class SubjectTypes(id:String, name:String, description:String,subjects:List[String])

object SubjectTypes{
  implicit  val SubjectTypesForm = Json.format[SubjectTypes]
  def identity:SubjectTypes = SubjectTypes("","","", Nil)
}
