package lecturers;

/* Reece Waldeck
 * 214218244
 */

import java.io._;

class Lecturer(val nme: String, val srnme: String, val telNo: String) 
{
  var name: String = nme;
  var surname: String = srnme;
  var phoneNo: String = telNo;
  
  def setName(nme: String) : Unit =
  {
    name = nme;
  }
  
  def setSurname(srnme: String) : Unit =
  {
    surname = srnme;
  }
  
  def setPhoneNo(telNo: String) : Unit =
  {
    phoneNo = telNo;
  }

  def getName() : String =
  {
    return name;
  }
  
  def getSurname() : String =
  {
    return surname;
  }
  
  def getPhoneNo() : String =
  {
    return phoneNo;
  }
 }