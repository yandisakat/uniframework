package domain.courses;

import play.api.libs.json.Json;

/** 
 * @created by Reece Waldeck
 * @param id primary key to identify Faculty
 * @param name
 * @param Campus the campus the faculty belongs to
*/

case class Faculty(
    id: Integer, 
    name: String,
    campus: Campus
    ) 
    
object Faculty
{
  implicit val facFmt = Json.format[Faculty];
  def identity: Faculty = Faculty(0, "", null);
}
