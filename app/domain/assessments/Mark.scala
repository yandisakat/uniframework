package domain.assessment

import play.api.libs.json.Json

/**
* @param name
* @param mark
* @param percentage
*
*/

case class Mark(name: String,
                mark: Int,
                percentage: Double)

object Mark extends App
{
  
  implicit val Mark = Json.format[Mark]
  
  def identity: Mark = Mark("", "", "")
  
}
