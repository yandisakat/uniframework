package domain.people
import play.api.libs.json.Json

/** Yandisa
 * @param Student ID
 * @param Department ID
 * @param First Name
 * @param Last Name
 * @param Initial
 * @param Email Address
 * @param Phone 
 *
 *
 */

case class Student(studentId: String, deptId: String, firstName:String, lastName: String, initial: String, email: String, phone: String) 
{
  object Student
  {

    implicit val studentJson = Json.format[Student]
    def identity: Student = Student("","","","","","")

  }
}
