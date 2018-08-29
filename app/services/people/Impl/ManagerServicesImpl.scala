package services.people.Impl

/**
 * creater Omega
 * reviewer Thomas
 *
 */


import com.datastax.driver.core.ResultSet
import domain.people.Manager
import repositories.people.ManagerRepository
import services.people.ManagerServices

import scala.concurrent.Future

class ManagerServicesImpl extends ManagerRepository with ManagerServices
{
  def save(manager: Manager): Future[ResultSet] = 
  {
      database.ManagerTable.save(Manager)
  }
  
  def getManager(managerID: String): Future[Seq[Manager]] =
  {
      database.ManagerTable.getManager(managerID)
  }
  
  def getManager(managerID: String): Future[Manager] = 
  {
      database.ManagerTable.getManager(managerID).map(Manager => Manager.head)
  }
  
  def deleteManager(managerID: String): Future[ResultSet] =
  {
      database.ManagerTable.deleteManager(managerID)
  }
}

object ManagerServicesImpl extends ManagerServicesImpl with ManagerRepository
  
}
