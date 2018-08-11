
package domain.courses

import java.time.LocalDateTime
import play.api.libs.json.Json


/**
*
* Created by Thomas
* Thomas Miller
* @param studentNumber
* @param subjectCode
* @param examName
* @param category
* @param marks
* @param total
* @param date - date on which marks was taken
*/

  
  class SubjectGrade(
    		studentNumber:String,
	 	subjectCode:Option[String],
		examName:Option[String],
	  	category:List[String];
		marks:Double,
		total:Double,
		date:LocalDateTime) 
		
object SubjectGrade{
  
  implicit val gradeFmt = Json.format[Grades]
  def identity: SubjectGrade = SubjectGrade(0,"","",Nil,0.0,0.0,LocalDateTime.now())

}

