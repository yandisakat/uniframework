
package domain.staff

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm staffID - Staff ID
  *@parm staffName - Name of staff member
  *@parm staffSurname - Surname of staff member
  *@parm staffEmail - Email of staff member
  *@parm staffDOB - Date of birth of staff member
  *@parm staffType - Type of staff member admin/lecturer/cleaners
  *@parm staffPhone - Telephone number of staff member
  *@parm staffCellno - Cellphone number of staff member
  *@parm staffAddress - Address of staff member
  */

 case class Staff(staffID:Int, 
            staffName:String, 
            staffSurname:String, 
            staffEmail:String, 
            staffDOB:LocalDateTime, 
            staffType:String, 
            staffPhone:String, 
            staffCellno:String, 
            staffAddress:String)

object Staff{
  implicit val staffFmt = Json.format[Staff]
  def identityStaff: Staff = Staff(123 , "Helen", "Van Dyk", "vandykh@cput.ac.za", 
"12/05/1960", "Admin", "0219735622", "0744226677", "12 Greyhound Road, Cape Town, 
7600")
}
