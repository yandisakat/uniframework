package domain.people
import play.api.libs.json.Json
/**
  * @ Created by Yandisa Katiya - 2018/07/21
  
  --Documentation
  */


case class Student(studentId: String, deptId: String, firstName:String, lastName: String, initial: String, email: String) 
{
  object Student
  {
    implicit val studentJson = Json.format[Lecturer]
  }
}
