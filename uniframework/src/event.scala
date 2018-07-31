package domain.event

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  *@parm event_ID - Event ID
  *@parm event_Name - Name of the event
  *@parm event_Location - Where event is held
  *@parm event_Organisation - rganisation responsible for the event
  *@parm event_Date - Date of the event
  *@parm event_Time - The time the event is starting
  *@parm event_ContactPersonName - Person's name responsible for the event
  *@parm event_ContactPersonNumber - Person's number responsible for the event
  */
  
case class Event(event_ID:Int,
                event_Name:String, 
                event_Location:String, 
                event_Organisation:String, 
                event_Date:LocalDateTime, 
                event_Time:LocalDateTime, 
                event_ContactPersonName:String,
                event_ContactPersonNumber:String)

object Event{
  implicit val eventFmt = Json.format[Event]
  def newEvent: Event = Event(123 , "Open day", "Bellville Campus", "CPUT", "12/05/2018", 
"09:00", "Jessica", "0724526677");
}
