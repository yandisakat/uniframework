package domain.courses
import java.time.LocalDateTime
import play.api.libs.json.Json

/**
* Thomas Miller
* @param subjectId Student Number 
* @param subjectName
* @param description
* @param course
*/

class SubjectCourse(
    	subjectId:String,
	subjectName:String,
	description:String,
	course:String) 
		
object SubjectCourse
{  
  implicit val SubjectCourseFmt = Json.format[SubjectCourse]
  def identity: SubjectCourse = SubjectCourse("","","","")
}
