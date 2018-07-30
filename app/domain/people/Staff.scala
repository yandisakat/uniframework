package domain.people

/**
* Created by Thomas
* @param staff number
* @param department id
* @param employment id
* @param name
* @param surname 
* @param initials
* @param email
*/

 case class Staff(staff_Num:Int, firstname: String, lastname:String, dept_ID:Int , emp_ID:Int, email:String, stud_Initial:String)


object Staff{
 implict val StaffFormat = Json.format[Staff]
def definity: Staff = Staff (0,"","",0,0,"","")
	
}
