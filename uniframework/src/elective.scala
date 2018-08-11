package domain.elective

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm electiveCode 
  *@parm electiveName - 
  *@parm electiveDescription - 
  *@parm electiveStatus - Status of space in the elective
  *@parm electiveCredits - Amount of credits awarded for elective
  *@parm electiveDuration - 
  */

 case class Elective(electiveCode:String, 
            electiveName:String, 
            electiveDescription:String, 
            electiveStatus:String, 
            electiveCredits:Double, 
            electiveDuration:String, )

object Elective{
  implicit val electiveFmt = Json.format[Elective]
  def identityElective: Elective = Elective("CYBER300" , "Cybersecurity", "Security in the cyberspace.", "vandykh@cput.ac.za", 
"Full", 5.00 , "1 Semester")
}
