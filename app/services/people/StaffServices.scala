package services.people

import com.datastax.driver.core.ResultSet
import domain.people.Staff
import services.people.Impl.StaffImpl

import scala.concurrent.Future

trait StaffServices
{
  def save(staff: Staff): Future[ResultSet]
  
  def getStaff(staffId: String): Future[Seq[Staff]]
  
  def getStaff(staffId: String): Future[Staff]
  
  def deleteStaff(staffId: String): Future[ResultSet]
  
 }
 
 object StaffServices
 {
    def apply: StaffServices = new StaffServicesImpl
    
  }
