package domain.courses
import java.time.LocalDateTime
import play.api.libs.json.Json

/**
* Created by 216074630 on 7/30/2018.
* Thomas Miller
* @param subjectId
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
