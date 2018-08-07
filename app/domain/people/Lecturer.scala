package domain.people;
import play.api.libs.json.Json;


/**
  *
  * created by Reece Waldeck
  * Part 1 - reviewed by Yandisa
  * @param lectId
  * @param firstname
  * @param lastname
  * @param telephoneNo
  * @param email
  * @param address
  * @param subjects
  */


case class Lecturer(
    lectId: String,
    firstname: String,
    lastname: String,
    telephoneNo: String,
    email: String,
    address: String,
    subjects: List[Subject]
)

object Lecturer
{
  implicit val lectFmt = Json.format[Lecturer];

  def identity: Lecturer = Lecturer("", "", "", "", "", "", null);

}
