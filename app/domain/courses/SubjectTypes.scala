package domain.courses

import play.api.libs.json.Json

/**
  * @created by Natasha
  * @param id
  * @param name
  * @param description
  * @param subjects
  This class is for describing the type of subject eg major or minor
  */

case class SubjectTypes(id:String, name:String, description:String,subjects:List[String])

object SubjectTypes{
  implicit  val SubjectTypesForm = Json.format[SubjectTypes]
  def identity:SubjectTypes = SubjectTypes("","","", Nil)
}
