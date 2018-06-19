package domain.courses


case class Subject(var id: String, var name:String, var credits: Double) {

  //set methods
  def setId(subjId: String) : Unit = {
    id = subjId
  }
  def setName(subjName: String) : Unit = {
    name = subjName
  }
  def setCredits(cred: Double) : Unit = {
    credits = cred
  }

  //get methods
  def getId :String = {
    id
  }
  def getName :String = {
    name
  }

  def getCredits :Double = {
    credits
  }

  //override existing toString() method
  override def toString :String = {
    val output: String = "Subject ID: %s \nSubject Name: %s \nCredits: %.2f".format(getId, getName, getCredits)
    output
  }

}

