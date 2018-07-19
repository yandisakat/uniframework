/**
* Created by 216074630 on 6/20/2018.
* @param  course id
* @param department id
* @param course title
* @param course descript 
* @param course credit
* @param course level
* @param course duration
*/
class course(
    var course_ID:Int =0,
    var dept_ID:Int = 0,
    var course_Title:String = "",
    var course_Descript:String = "",
    var course_Credit:String = "",
    var course_Level:String = "",
    var course_Duration:String = "")
{

  def courseID(value: Int):Unit = course_ID = value
  def deptID(value: Int):Unit = dept_ID = value
  def courseTitle(value: String): Unit = course_Title = value
  def courseDescript(value: String): Unit = course_Descript = value
  def courseCredit(value: String): Unit = course_Credit = value
  def courseLevel(value: String): Unit = course_Level = value
  def courseDuration(value: String): Unit = course_Duration = value
  def getCourseID = course_ID;
  def getDeptID = dept_ID;
  def getTitle = course_Title;
  def getDescript = course_Descript;
  def getCredit = course_Credit;
  def getLevel = course_Level;
  def getDuration = course_Duration;

  def show() = {
    println("Course ID: " + course_ID)
    println("Department ID: " + dept_ID)
    println("Course Title: " + course_Title)
    println("Course Descript: " + course_Descript)
    println("Course Credit: " + course_Credit)
    println("Course Level: " + course_Level)
    println("Course Duration: " + course_Duration)


  }


}

object course extends App{
  // Your code here!
  var c = new course(216256, 258, "ICT", "Progaramming", "256S", "25639", "5years")

  //println(c.getCourseID());
  c.show();
}
