package domain.event

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm eventID 
  *@parm eventName
  *@parm eventLocation - Where event is held
  *@parm eventOrganisation - organisation responsible 
  *@parm eventDate 
  *@parm eventTime 
  *@parm eventContactPersonName
  *@parm eventContactPersonNumber
  */
  
case class Event(eventID:Int,
                eventName:String, 
                eventLocation:String, 
                eventOrganisation:String, 
                eventDate:LocalDateTime, 
                eventTime:LocalDateTime, 
                eventContactPersonName:String,
                eventContactPersonNumber:String)

object Event{
  implicit val eventFmt = Json.format[Event]
  def newEvent: Event = Event(123 , "Open day", "Bellville Campus", "CPUT", "12/05/2018", 
"09:00", "Jessica", "0724526677");
}
