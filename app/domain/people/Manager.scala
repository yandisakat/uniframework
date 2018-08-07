package domain.people;
import play.api.libs.json.Json;

/** 
 * created by Kessel
 * Part 1 - reviewed by Yandisa
 * @param lectId primary key to identify Lecturer
 * @param name
 * @param srname
 * @param telNo
 * @param emailAddr 
 * @param addr 
 * @param subjects the list of subjects the Lecturer lectures
 */


case class Manager(managerID: String, firstname: String, lastname: String, telNo: Int, emailAddr: String, addr: String, managerStartDate: LocalDateTime, managerEndDate: LocalDateTime)

object Manager
{
  implicit val managerFormat = Json.format[Manager];

  def identity: Manager = Manager("","","",0,"",);

}
