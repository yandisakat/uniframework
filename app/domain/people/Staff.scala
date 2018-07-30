/**
* Created by 216074630 on 6/20/2018.
* @param staff number
* @param department id
* @param employment id
* @param name
* @param surname 
* @param initials
* @param email
*/

 case class Staff(var staff_Num:Int = 0,
		    var fn:String = "",
		    var ln:String = "",
		    var dept_ID:Int = 0,
		    var emp_ID:Int = 0,
		    var email:String = "",
 		    var stud_Initial:String =""){
 
        def setstaff_Num(value: Int):Unit = staff_Num = value
        def setfn(value: String): Unit = fn = value
        def setln(value: String): Unit = ln = value
        def setdept_ID(value: Int):Unit = dept_ID = value
        def setemp_ID(value: Int):Unit = emp_ID = value
        def setemail(value: String): Unit = email = value
        def setstu_Initial(value: String): Unit = stud_Initial = value
  
        def getstaff_Num = staff_Num;
        def getfn = fn;
        def getln = ln;
        def getdept_ID = dept_ID;
        def getemp_ID = emp_ID;
        def getemail = email;
        def getintial = stud_Initial;
    

  
def show()={

    println("StudentNumber:"+ getstaff_Num)
    println("Department:"+ getdept_ID)
    println("Employee ID:"+ getdept_ID)
    println("Name: "+ getfn)
    println("Surname: "+getln)
    println("Initial:"+ getintial)
    println("Email:"+ getemail)


  }

}


object Staff extends App{
  // Your code here!
  var s = new Staff(216074630,"Thomas","Miller",21625,1996,"216074630@mycput.ac.za","TH")

  s.show();

}
