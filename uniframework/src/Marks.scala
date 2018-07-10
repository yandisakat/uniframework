

/*
 * @param name
 * @param mark
 * @param percentage
 */

case class Marks (var name: String = "",
                  var mark: Int = 0,
                  var percentage: Double = 0) {
 
  def setName(value: String):Unit = name = value
  
  def setMark(value: Int):Unit = mark = value 
  
  def setPercentage(totMk: Int):Unit = percentage = mark / totMk * 100
  
  def getMark() = mark
  
  def getPercentage() = percentage
  
  def getName() = name
  
} //end class
