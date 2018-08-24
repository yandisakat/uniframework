package services.people

/**
 * creator Omega 
 * reviewer  Thomas
 *
 */

import com.datastax.driver.core.ResultSet
import domain.people.Manager
import services.people.Impl.ManagerImpl

import scala.concurrent.Future

trait ManagerServices
{
  def save(manager: Manager): Future[ResultSet]
  
  def getManagers(managerId: String): Future[Seq[Manager]]
  
  def getManager(managerId: String): Future[Manager]
  
  def deleteManager(managerId: String): Future[ResultSet]
  
 }
 
 object ManagerServices
 {
    def apply: ManagerServices = new ManagerServicesImpl
    
  }
