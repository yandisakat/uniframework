package domain.people;
import play.api.libs.json.Json;

/** 
 * created by Reece Waldeck
 * Part 1 - reviewed by Yandisa
 * @param lectId primary key to identify Lecturer
 * @param name
 * @param srname
 * @param telNo
 * @param emailAddr 
 * @param addr 
 * @param subjects the list of subjects the Lecturer lectures
 */

case class Lecturer(
    lectId: String, 
    name: String, 
    srname: String, 
    telNo: String, 
    emailAddr: String,
    addr: String,
    subjects: List[Subject]
)

object Lecturer
{
  implicit val lectFmt = Json.format[Lecturer];

  def identity: Lecturer = Lecturer("", "", "", "", "", "", null);

}
