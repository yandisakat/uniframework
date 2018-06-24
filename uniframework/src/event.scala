class event(val event_ID:Int,val event_Name:String, val event_Location:String, 
val event_Organisation:String, val event_Date:Date, val event_Time:Date, 
val event_ContactPersonName:String,val event_ContactPersonNumber:String)
{

  var eventID: Int = event_ID //Event ID
  var eventName: String = event_Name //Name of the event
  var eventLocation: String = event_Location //Where event is held
  var eventOrganisation: String = event_Organisation //Organisation responsible for the event
  var eventDate: Date = event_Date //Date of the event
  var eventTime: Date = event_Time //The time the event is starting
  var eventContactPersonName: String = event_ContactPersonName //Person's name responsible for the event
  var eventContactPersonNumber: String = event_ContactPersonNumber //Person's number responsible for the event

  def getEventID(): Int = {
    return this.eventID;
  }

  def getEventName(): String = {
    return this.eventName;
  }

  def getEventLocation(): String = {
    return this.eventLocation;
  }

  def getEventDate(): Date = {
    return this.eventDate;
  }

  def getEventTime(): Date = {
    return this.eventTime;
  }

  def getEventContactPersonName(): String = {
    return this.eventContactPersonName;
  }

  def getEventContactPersonNumber(): String = {
    return this.eventContactPersonNumber;
  }

  def show() = {
    println("Event ID: " + eventID)
    println("Event Name: " + eventName)
    println("Event Location: " + eventLocation)
    println("Event Organisation: " + eventOrganisation)
    println("Event Date: " + eventDate)
    println("Event Time: " + eventTime)
    println("Event Contact Person Name: " + eventContactPersonName)
    println("Event Contact Person Number: " + eventContactPersonNumber)


  }


}

object course extends App{
  
  var e = new event(123 , "Open day", "Bellville Campus", "CPUT", "12/05/2018", "09:00", "Jessica", "0724526677");
  e.show();

}
