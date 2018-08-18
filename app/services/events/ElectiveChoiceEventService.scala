package services.events

/**
  * created by Natasha
  * reviewer Reece
  */

import com.datastax.driver.core.ResultSet
import domain.events.ElectiveChoiceEvent
import services.events.Impl.ElectiveChoiceEventServicesImpl

import scala.concurrent.Future

trait ElectiveChoiceEventServices {

  def save(role: ElectiveChoiceEvent): Future[ResultSet]

  def getElectiveChoiceEvent(electiveId: String): Future[Seq[ElectiveChoiceEvent]]

  def getElectiveChoiceEvent(electiveId: String): Future[ElectiveChoiceEvent]

  def deleteElectiveChoiceEvent(electiveId: String): Future[ResultSet]
}

object ElectiveChoiceEventServices{
  def apply: ElectiveChoiceEventServices = new ElectiveChoiceEventServicesImpl
}
