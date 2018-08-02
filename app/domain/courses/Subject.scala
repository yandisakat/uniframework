package domain.courses

/**
  *created by Kessel
  * @param SubjectId
  * @param name
  * @param credits
  * @param description
  */

case class Subject(SubjectId: String,description: String, name:String, credits: Double)

object Subject {

  implicit val s = Json.format[Subejct]
  def identify:Subject = Subject ("","","",0.0)

}
