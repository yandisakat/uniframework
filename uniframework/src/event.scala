package domain.event

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm eventID - Event ID
  *@parm eventName - Name of the event
  *@parm eventLocation - Where event is held
  *@parm eventOrganisation - rganisation responsible for the event
  *@parm eventDate - Date of the event
  *@parm eventTime - The time the event is starting
  *@parm eventContactPersonName - Person's name responsible for the event
  *@parm eventContactPersonNumber - Person's number responsible for the event
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
