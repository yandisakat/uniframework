package domain.people
import play.api.libs.json.Json
/**
  * By Yandisa Katiya - 2018/07/21
  */


case class Student(val studentId: String, val deptId: String, val firstName:String, val lastName: String, val initial: String, val email: String) {

  object Student
  {
    implicit val studentJson = Json.format[Lecturer]
  }
}
