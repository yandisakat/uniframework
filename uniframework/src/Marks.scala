

/*
 * @param subjectId
 * @param studentId
 * @param mark student mark obtained
 * @param percentage
 */

case class Marks (var subjectId: String = "",
                  var studentId: String = "",
                  var mark: Double = 0,
                  var percentage: Double = 0) {
 
  def setSubjectId(value: String):Unit = subjectId = value
  
  def setStudentId(value: String):Unit = studentId = value
  
  def setMark(value: Int):Unit = mark = value
  
  def setPercentage(totMk: Int):Unit = percentage = mark / totMk * 100
  
  def getMark() = mark
  
  def getPercentage() = percentage
  
  def getSubjectId() = subjectId
  
  def getStudentId() = studentId
  
} //end class
