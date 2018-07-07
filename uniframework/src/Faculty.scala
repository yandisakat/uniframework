/* Reece Waldeck
 * 214218244
 */

case class Faculty(val name: String) 
{
  private var _facultyName: String = name;
  
  def facultyName = _facultyName;
  def facultyName_= (facultyName:String): Unit = _facultyName = facultyName;
}