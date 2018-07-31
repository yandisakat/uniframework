
package domain.courses

import java.time.LocalDateTime
import play.api.libs.json.Json


/**
*
* Created by Thomas
* Thomas Miller
* @param student number
* @param subject code
* @param Exam name
* @param Marks
* @param average
* @param date marks was taken
*/

  
  class SubjectGrade(
    stud_Num:Int,
	  subject_code:Option[String],
		exam_name:Option[String],
		marks:Double,
		total:Double,
		date:LocalDateTime) 
		
object SubjectGrade{
  
  implicit val gradeFmt = Json.format[Grades]
  def identity: SubjectGrade = SubjectGrade(0,"","",0.0,0.0,LocalDateTime.now())

}

