

//*
 * @param sDate starting date
 * @param dDate due date
 * @param desc description
 * @param totalMk assignment total marks
 */

case class Assignment (var sDate: String = "",
                       var dDate: String = "",
                       var desc: String = "",
                       var totalMk: Int = 0) {
  
  def setStartDate(value: String):Unit = sDate = value
  
  def setDueDate(value: String): Unit = dDate = value
  
  def setDescription(value: String):Unit = desc = value
  
  def setAssmtTotalMark(value: Int):Unit = totalMk = value 
  
  def getStartDate() = sDate
  
  def getDueDate() = dDate
  
  def getDescription() = desc
  
  def getTotalMark = totalMk
  
} //end class
