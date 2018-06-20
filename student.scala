

/**
  * Created by 216074630 on 6/20/2018.
  */

class student(val stu_Num:Int,val fn:String,val ln:String,val dept_ID:Int,val email:String,val stu_Initial:String){

  var student_num:Int=stu_Num
  var department:Int=dept_ID
  var name:String =fn
  var surname :String = ln
  var student_Initial :String = stu_Initial
  var student_email:String = email
  def getStudeNum(): Int = {
    return this.student_num;
  }

  def getDepartment(): Int = {
    return this.department;
  }

  def getName(): String = {
    return this.name;
  }

  def getSurname(): String = {
    return this.surname;
  }

  def getStudentInitials(): String = {
    return this.student_Initial;
  }

  def getEmail(): String = {
    return this.student_email;
  }
  def show()={

    println("StudentNumber:"+ stu_Num)
    println("Department:"+ department)
    println("Name: "+name)
    println("Surname: "+surname)
    println("Initial:"+ stu_Initial)
    println("Email:"+student_email)


  }

}


object student extends App{
  // Your code here!
  var s = new student(216074630,"Thomas","Miller",21625,"216074630@mycput.ac.za","TH")

  s.show();

}
