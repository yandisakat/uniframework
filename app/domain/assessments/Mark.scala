package domain.assessment

import play.api.libs.json.Json

/**
*created by Wailed
*
* @param subjectId
* @param studentId
* @param mark student mark
* @param percentage
*
*/

case class Mark(subjectId: String,
                studentId: String,
                mark: Double,
                percentage: Double)

object Mark
{
  
  implicit val Mark = Json.format[Mark]
  
  def identity: Mark = Mark("", "", 0.0, 0.0)
  
}
