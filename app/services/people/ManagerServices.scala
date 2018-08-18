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
  
  def getManager(manId: String): Future[Seq[Manager]]
  
  def getManager(manId: String): Future[Manager]
  
  def deleteManager(manId: String): Future[ResultSet]
  
 }
 
 object ManagerServices
 {
    def apply: ManagerServices = new ManagerServicesImpl
    
  }
