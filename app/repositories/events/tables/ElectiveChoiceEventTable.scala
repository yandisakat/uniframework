
package repositories.events.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.events.ElectiveChoiceEvent

import scala.concurrent.Future


abstract class ElectiveChoiceEventTable extends Table[ElectiveChoiceEventTable, ElectiveChoiceEvent] {

  object studID extends StringColumn with PrimaryKey

  object subId extends StringColumn with PrimaryKey

  object eventDate extends Col[LocalDateTime]

}

abstract class ElectiveChoiceEventTableImpl extends ElectiveChoiceEventTable with RootConnector {

  override lazy val tableName = "electiveChoiceEvent"

  def save(elect: ElectiveChoiceEvent): Future[ResultSet] = {
    insert
      .value(_.studId, elect.orgId)
      .value(_.subId, elect.email)
      .value(_.eventDate, elect.state)
      .future()
  }

  def getEvent(studId: String, subId:String): Future[Option[ElectiveChoiceEvent]] = {
    select.where(_.studId eqs studId).and(_.subId eqs subId).one()
  }

 
    def deleteEvent(studId: String, subId:String): Future[ResultSet] = {
    delete.where(_.studId eqs studId).and(_.subId eqs subId).future()
  }
}










