package domain.people;

import play.api.libs.json.Json;

/** 
 * created by Reece Waldeck
 * @param lect_id primary key to identify Lecturer
 * @param nme
 * @param srnme
 * @param telNo
 * @param emalAddr
 * @param subjects the list of subjects the Lecturer lectures
 */

case class Lecturer(
    lect_id: Integer, 
    nme: String, 
    srnme: String, 
    telNo: String, 
    emailAddr: String,
    subjects: List[Subject]
)

object Lecturer
{
  implicit val lectFmt = Json.format[Lecturer];
  def identity: Lecturer = Lecturer(0, "", "", "", "", null);
}
