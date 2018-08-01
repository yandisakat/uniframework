
package domain.staff

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm staff_ID - Staff ID
  *@parm staff_Name - Name of staff member
  *@parm staff_Surname - Surname of staff member
  *@parm staff_Email - Email of staff member
  *@parm staff_DOB - Date of birth of staff member
  *@parm staff_Type - Type of staff member admin/lecturer/cleaners
  *@parm staff_Phone - Telephone number of staff member
  *@parm staff_Cellno - Cellphone number of staff member
  *@parm staff_Address - Address of staff member
  */

 case class Staff(staff_ID:Int, 
            staff_Name:String, 
            staff_Surname:String, 
            staff_Email:String, 
            staff_DOB:LocalDateTime, 
            staff_Type:String, 
            staff_Phone:String, 
            staff_Cellno:String, 
            staff_Address:String)

object Staff{
  implicit val staffFmt = Json.format[Staff]
  def identityStaff: Staff = Staff(123 , "Helen", "Van Dyk", "vandykh@cput.ac.za", 
"12/05/1960", "Admin", "0219735622", "0744226677", "12 Greyhound Road, Cape Town, 
7600")
}

package domain.staff

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm staff_ID - Staff ID
  *@parm staff_Name - Name of staff member
  *@parm staff_Surname - Surname of staff member
  *@parm staff_Email - Email of staff member
  *@parm staff_DOB - Date of birth of staff member
  *@parm staff_Type - Type of staff member admin/lecturer/cleaners
  *@parm staff_Phone - Telephone number of staff member
  *@parm staff_Cellno - Cellphone number of staff member
  *@parm staff_Address - Address of staff member
  */

 case class Staff(staff_ID:Int, 
            staff_Name:String, 
            staff_Surname:String, 
            staff_Email:String, 
            staff_DOB:LocalDateTime, 
            staff_Type:String, 
            staff_Phone:String, 
            staff_Cellno:String, 
            staff_Address:String)

object Staff{
  implicit val staffFmt = Json.format[Staff]
  def identityStaff: Staff = Staff(123 , "Helen", "Van Dyk", "vandykh@cput.ac.za", 
"12/05/1960", "Admin", "0219735622", "0744226677", "12 Greyhound Road, Cape Town, 
7600")
}

