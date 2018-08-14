package services.people.Impl

/**
 * creater Yandisa
 * reviewer Kessel
 *
 */

import com.datastax.driver.core.ResultSet
import domain.people.Staff
import repositories.people.StaffRepository
import services.people.StaffServices

import scala.concurrent.Future

class StaffServicesImpl extends StaffRepository with StaffServices
{
  def save(course: Course): Future[ResultSet] = 
  {
    database.staffTable.save(staff)
  }
  
  def getStaff(staffId: String): Future[Seq[Course]] = 
  {
    database.staffTable.getStaff(staffId)
  }
  
  def getUserRole(staffId:String): Future[Staff] =
  {
    database.staffTable.getStaff(staffId).map(staff => staff.head)
  }
  
  def deleteStaff(staffId:String): Future[ResultSet] =
  {
    database.staffTable.deleteStaff(staffId)
  }

object StaffServicesImpl extends StaffServicesImpl with StaffRepository
}
