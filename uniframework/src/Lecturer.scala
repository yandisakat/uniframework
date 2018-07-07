

/* Reece Waldeck
 * 214218244
 */

import java.io._

case class Lecturer(val nme: String, val srnme: String, val telNo: String, val emailAddr: String,// val classes: List[Subject_Class]
) 
{
  private var _name: String = nme;
  private var _surname: String = srnme;
  private var _phoneNo: String = telNo;
  private var _emailAddress: String = emailAddr;
  //private var _classes: List[Subject_Class];
  
  def name = _name;
  def surname = _surname; 
  def phoneNo = _phoneNo;
  def emailAddress = _emailAddress;
//def classes = _classes;
  
  def name_= (nme:String) : Unit = _name = nme;
  def surname_(srnme: String) : Unit = _surname = srnme;
  def phoneNo_(telNo: String) : Unit = _phoneNo = telNo;
  def emailAddress_(email:String) : Unit = _emailAddress = email;
//def classes_(classs:Subject_Class) : Unit = _classes = classs;  
}