package domain.people
import play.api.libs.json.Json
/*
 * @param Student ID
 * @param Department ID
 * @param First Name
 * @param Last Name
 * @param Initial
 * @param Email Address
 *
 *By Yandisa Katiya - 2018/07/21
 *
 */

case class Student(studentId: String, deptId: String, firstName:String, lastName: String, initial: String, email: String) 
{
  object Student
  {
    implicit val studentJson = Json.format[Lecturer]
    def identity: Student = Student("","","","","","")
  }
}
