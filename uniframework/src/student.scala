/**
* Created by 216074630 on 6/20/2018.
* @param student number
* @param department id
* @param name
* @param surname 
* @param initials
* @param email
*/

 case class student(var stud_Num:Int = 0,
		    var fn:String = "",
		    var ln:String = "",
		    var dept_ID:Int = 0,
		    var email:String = "",
 		    var stud_Initial:String =""){
 
        def setstud_Num(value: Int):Unit = stud_Num = value
        def setfn(value: String): Unit = fn = value
        def setln(value: String): Unit = ln = value
        def setdept_ID(value: Int):Unit = dept_ID = value
        def setemail(value: String): Unit = email = value
        def setstu_Initial(value: String): Unit = stud_Initial = value
  
        def getstud_Num = stud_Num;
        def getfn = fn;
        def getln = ln;
        def getdept_ID = dept_ID;
        def getemail = email;
        def getintial = stud_Initial;
    

  
def show()={

    println("StudentNumber:"+ getstud_Num)
    println("Department:"+ getdept_ID)
    println("Name: "+ getfn)
    println("Surname: "+getln)
    println("Initial:"+ getintial)
    println("Email:"+ getemail)


  }

}


object student extends App{
  // Your code here!
  var s = new student(216074630,"Thomas","Miller",21625,"216074630@mycput.ac.za","TH")

  s.show();

}
