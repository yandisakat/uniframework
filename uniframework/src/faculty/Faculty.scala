package faculty

/* Reece Waldeck
 * 214218244
 */

class Faculty(val name: String) 
{
  var facultyName : String = name;
  
  def setFacultyName(nme: String) : Unit =
  {
    facultyName = nme;
  }
  
  def getName() : String =
  {
    return facultyName;
  }
}