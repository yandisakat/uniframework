package domain.courses
import play.api.libs.json.Json
/*
 * By Yandisa Katiya - 2018/07/30
 */

case class StaffSubjects(id:String,subjects:List[String]) 
{
    implicit val staffSubjects = Json.format[StaffSubjects]
    def identity: StaffSubjects = StaffSubjects("", "")
}
