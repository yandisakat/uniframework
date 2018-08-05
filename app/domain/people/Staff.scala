package domain.people

/**
* Created by Thomas
* @param staffId
* @param firstName
* @param lastName
* @param deptId
* @param empId 
* @param email
* @param studInitial
* @param position
*/

 case class Staff(staffId:String, firstname: String, lastname:String, deptId:String , empId:String, email:String, studInitial:String,position:String)


object Staff{
 implict val StaffFormat = Json.format[Staff]
def definity: Staff = Staff ("","","","","","","","")
	
}
