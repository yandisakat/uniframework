package domain.assessment

import play.api.libs.json.Json

/**
*created by Wailed
* @param name
* @param mark
* @param percentage
*
*/

case class Mark(subjectName: String,
                mark: Int,
                percentage: Double)

object Mark
{
  
  implicit val Mark = Json.format[Mark]
  
  def identity: Mark = Mark("", "", "")
  
}
