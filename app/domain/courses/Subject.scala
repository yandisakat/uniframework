package domain.courses

/**
  *created by Kessel
  * @param SubjectId
  * @param name
  * @param credits
  */

case class Subject(SubjectId: String, name:String, credits: Double)

object Subject {

  implicit val s = Json.format[Subject]
  def identify:Subject = Subject ("","",0.0)

}
