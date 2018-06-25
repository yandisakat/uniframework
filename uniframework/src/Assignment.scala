

class Assignment (val sDate: String, val dDate: String, val desc: String, val assmtTotMk: Int) {
  
  var startDate: String = sDate;
  var dueDate: String = dDate;
  var description: String = desc;
  var assmtTotalMark: Int = assmtTotMk;
  
  def setStartDate(sDate: String){
    
    startDate = sDate;
  }
  
  def setDueDate(dDate: String){
    
    dueDate = dDate;
  }
  
  def setDescription(desc: String)
  {
    description = desc;
  }
  
  def setAssmtTotalMark(assmtTotMk: Int)
  {
    assmtTotalMark = assmtTotMk;
  }
  
  def getStartDate: String =
  {
    return startDate;
  }
  
  def getDueDate: String =
  {
    return dueDate;
  }
  
  def getDescription: String =
  {
    return description;
  }
  
  def getAssmtTotalMark: Int =
  {
    return assmtTotalMark;
  }
  
} //end class