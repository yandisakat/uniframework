/**
* Created by 216074630 on 7/30/2018.
* @param student number
* @param department id
* @param percentage
*/

class Grades(
    var stud_Num:Int = 0,
	  var dept_ID:Int = 0,
		var stud_Initial:String ="",
		var ln:String = "",
		var percentage:Double= 0,
		) 
		{
  
  def setstud_Num(value: Int):Unit = stud_Num = value
  def setdept_ID(value: Int):Unit = dept_ID = value
  def setstu_Initial(value: String): Unit = stud_Initial = value
  def setln(value: String): Unit = ln = value
  def setpercent(value: Double): Unit = percentage = value
 
  
  def getStudeNum =stud_Num;
  def getDepartment = dept_ID;
  def getSurname = ln;
  def getStudentInitials = stud_Initial;
  def getPercent = percentage;

  
  def show()={

    println("Student Number:"+getStudeNum )
    println("Initial:"+ getStudentInitials)
    println("Surname: "+getSurname)
    println("Department:"+ getDepartment)
    println("Percentage: "+ getPercent)
    

  }
  
  
}

object Grades extends App{
  // Your code here!
  var s = new Grades(216074630,2136,"TH","Miller",10);

  s.show();

}
