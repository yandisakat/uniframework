class course(val course_ID:Int,val dept_ID:Int,val course_Title:String,val course_Descript:String,
           val course_Credit:String,val course_Level:String,val course_Duration:String)
{

  var courseID: Int = course_ID
  var deptID: Int = dept_ID
  var courseTitle: String = course_Title
  var courseDescript: String = course_Descript
  var courseCredit: String = course_Credit
  var courseLevel: String = course_Level
  var courseDuration: String = course_Duration

  def getCourseID(): Int = {
    return this.courseID;
  }

  def getDeptID(): Int = {
    return this.deptID;
  }

  def getTitle(): String = {
    return this.courseTitle;
  }

  def getDescript(): String = {
    return this.courseDescript;
  }

  def getCredit(): String = {
    return this.courseCredit;
  }

  def getLevel(): String = {
    return this.courseLevel;
  }

  def getDuration(): String = {
    return this.courseDuration;
  }

  def show() = {
    println("Course ID: " + courseID)
    println("Department ID: " + deptID)
    println("Course Title: " + courseTitle)
    println("Course Descript: " + courseDescript)
    println("Course Credit: " + courseCredit)
    println("Course Level: " + courseLevel)
    println("Course Duration: " + courseDuration)


  }


}

object course extends App{
  // Your code here!
  var c = new course(216256, 258, "ICT", "Progaramming", "256S", "25639", "5years")

  //println(c.getCourseID());
  c.show();
}
