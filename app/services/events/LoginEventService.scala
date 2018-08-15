package services.events

import com.datastax.driver.core.ResultSet
import domain.events.LoginEvent
import services.events.Impl.LoginEventServicesImpl

import scala.concurrent.Future

/**
  *
  * creater Wailed
  * reviewer Dorcas
  */


trait LoginEventServices {

  def save(loginEvent: LoginEvent): Future[ResultSet]

  def getLoginEvent(username: String): Future[Seq[LoginEvent]]

  def getLoginEvent(username: String): Future[LoginEvent]

  def deleteLoginEvents(username: String): Future[ResultSet]
}

object LoginEventServices{
  def apply: LoginEventServices = new LoginEventServicesImpl
}
