

class Marks (val mk: Int, val pcent: Double) {
  
  var mark: Int = mk;
  var percentage: Double = pcent;
  
  def setMark(mk: Int)
  {
     mark = mk;
  }
  
  def setPercentage(testTotal: Int)
  {
      percentage = (mark/testTotal) * 100;
  }
  
  def getMark: Int =
  {
     return mark;
  }

  def getPercentage: Double =
  {
     return percentage; 
  }
	
  
} //end class