package domain.courses;

import play.api.libs.json.Json;

/** 
 * created by Reece Waldeck
 * @param facId  primary key to identify Faculty
 * @param facName
 * @param Campus  the campus the faculty belongs to
*/

case class Faculty(
    facId: String, 
    facName: String,
    campus: Campus
    ) 
    
object Faculty
{
  implicit val facFmt = Json.format[Faculty];
  def identity: Faculty = Faculty("", "", null);
}
