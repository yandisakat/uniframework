class staff(val staff_ID:Int, val staff_Name:String, val staff_Surname:String, val staff_Email:String, 
val staff_DOB:Date, val staff_Type:String, val staff_Phone:String, val staff_Cellno:String, val staff_Address:String,)
{

  var staffID: Int = staff_ID //Staff ID
  var staffName: String = staff_Name //Name of staff member
  var staffSurname: String = staff_Surname //Surname of staff member
  var staffEmail: String = staff_Email //Email of staff member
  var staffDOB: Date = staff_DOB //Date of birth of staff member
  var staffType: String = staff_Type //Type of staff member admin/lecturer/cleaners
  var staffPhone: String = staff_Phone //Telephone number of staff member
  var staffCellno: String = staff_Cellno //Cellphone number of staff member
  var staffAddress: String = staff_address //Address of staff member

  def getStaffID(): Int = {
    return this.staffID;
  }

  def getStaffName(): String = {
    return this.staffName;
  }

  def getStaffSurname(): String = {
    return this.staffSurname;
  }

  def getStaffEmail(): String = {
    return this.staffEmail;
  }

  def getStaffDOB(): Date = {
    return this.staffDOB;
  }

  def getStaffType(): String = {
    return this.staffType;
  }

  def getStaffPhone(): String = {
    return this.staffPhone;
  }

  def getStaffCellno(): String = {
    return this.staffCellno;
  }

  def getStaffAddress(): String = {
    return this.staffAddress;
  }

  def show() = {
    println("Staff ID: " + staffID)
    println("Staff Name: " + StaffName)
    println("Staff Surname: " + staffSurname)
    println("Staff Email: " + staffEmail)
    println("Staff DOB: " + staffDOB)
    println("Staff Type: " + staffType)
    println("Staff Phone: " + staffPhone)
    println("Staff Cellno: " + staffCellno)
    println("Staff Address: " + staffAddress)


  }


}

object course extends App{
  
  var s = new staff(123 , "Helen", "Van Dyk", "vandykh@cput.ac.za", "12/05/1960", "Admin", "0219735622", "0744226677", "12 Greyhound Road, Cape Town, 7600");
  s.show();

}
