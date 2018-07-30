package repositories.event.tables

import java.time.LocalDateTime
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.event.Event
import scala.concurrent.Future

/**
  * By Natasha (216020492) - 30/07/2018
  */

abstract class EventTable extends Table[EventTable]
{
  object event_ID extends IntColumn with PrimaryKey with ClusteringOrder with Ascending
  object event_Name extends StringColumn
  object event_Location extends StringColumn
  object event_Organisation extends StringColumn
  object event_Date extends DateColumn
  object event_Time extends DateColumn
  object event_ContactPersonName extends StringColumn
  object event_ContactPersonNumber extends StringColumn
}

abstract class EventTableImpl extends EventTable with RootConnector
{
  override lazy val tableName = "Event"
  
  def save(role: Event): Future[ResultSet] = 
  {
    insert
      .value(_.event_ID, role.event_ID)
      .value(_.event_Name, role.event_Name)
      .value(_.event_Location, role.event_Location)
      .value(_.event_Organisation, role.event_Organisation)
      .value(_.event_Date, role.event_Date)
      .value(_.event_Time, role.event_Time)
      .value(_.event_ContactPersonName, role. event_ContactPersonName)
      .value(_.event_ContactPersonNumber, role.event_ContactPersonNumber)
      .future()
  }
  
  def getEvent(event_ID:String):Future[Seq[Event]] =
  {
    select
      .where(_.event_ID eqs event_ID)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  
  def deleteEvent(event_ID:Int):Future[ResultSet]=
  {
    delete
      .where(_.event_ID eqs event_ID)
      .future()
  }
}
