package services.events.Impl

/**
  * created Natasha
  * reviewer Reece
  */

import com.datastax.driver.core.ResultSet
import domain.events.ElectiveChoiceEvent
import repositories.events.ElectiveChoiceEventRepository
import services.events.ElectiveChoiceEventServices

import scala.concurrent.Future

class ElectiveChoiceEventServicesImpl extends ElectiveChoiceEventRepository with ElectiveChoiceEventServices{
  def save(role: ElectiveChoiceEvent): Future[ResultSet] = {
    database.ElectiveChoiceEventTable.save(role)

  }

  def getElectiveChoiceEvent(electiveId: String): Future[Seq[ElectiveChoiceEvent]] = {
    database.ElectiveChoiceEventTable.getElectiveChoiceEvent(electiveId)

  }

  def getElectiveChoiceEvent(electiveId: String): Future[ElectiveChoiceEvent] = {
    database.ElectiveChoiceEventTable.getElectiveChoiceEvent(electiveId).map(role => role.head)
  }

  def deleteElectiveChoiceEvent(electiveId:String):Future[ResultSet] ={
    database.ElectiveChoiceEventTable.deleteElectiveChoiceEvent(electiveId)
  }

}

object ElectiveChoiceEventServicesImpl extends ElectiveChoiceEventServicesImpl with ElectiveChoiceEventRepository


}
