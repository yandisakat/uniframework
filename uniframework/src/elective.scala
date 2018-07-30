package domain.elective

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm elective_Code - Code for the elective
  *@parm elective_Name - Name of the elective
  *@parm elective_Description - Describes the elective
  *@parm elective_Status - Status of space in the elective
  *@parm elective_Credits - Amount of credits for the elective
  *@parm elective_Duration - How long the elective will last
  */

 case class Elective(elective_Code:String, 
            elective_Name:String, 
            elective_Description:String, 
            elective_Status:String, 
            elective_Credits:Double, 
            elective_Duration:String, )

object Elective{
  implicit val electiveFmt = Json.format[Elective]
  def identityElective: Elective = Elective("CYBER300" , "Cybersecurity", "Security in the cyberspace.", "vandykh@cput.ac.za", 
"Full", 5.00 , "1 Semester")
}
