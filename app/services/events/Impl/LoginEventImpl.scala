package services.events.Impl

import com.datastax.driver.core.ResultSet
import domain.events.LoginEvent
import repositories.events.LoginEventRepository
import services.users.LoginEventServices

import scala.concurrent.Future

/**
  *
  * creater Wailed
  * reviewer Dorcas
  */

class LoginEventServicesImpl extends LoginEventRepository with LoginEventServices{
  def save(loginEvent: LoginEvent): Future[ResultSet] = {
    database.loginEventTable.save(loginEvent)

  }

  def getLoginEvent(username: String): Future[Seq[LoginEvent]] = {
    database.loginEventTable.getLoginEvent(username)

  }

  def getLoginEvent(username: String): Future[LoginEvent] = {
    database.loginEventTable.getLoginEvent(username).map(loginEvent => loginEvent.head)
  }

  def deleteLoginEvents(username:String):Future[ResultSet] ={
    database.loginEventTable.deleteLoginEvents(username)
  }

}

object LoginEventServicesImpl extends LoginEventServicesImpl with LoginEventRepository


}
