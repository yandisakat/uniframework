package services.courses

/**
 * Created by Omega Mbadu
 * Reviewed by Yandisa Katiya
 *
 */

import com.datastax.driver.core.ResultSet
import domain.courses.Department
import services.courses.Impl.DepartmentImpl

import scala.concurrent.Future

trait DepartmentServices 
{
  def save(dep: Department): Future[ResultSet]

  def getDepartment(depId: String): Future[Seq[Department]]

  def editDepartment(depId: String): Future[Department]

  def deleteDepartment(depId: String): Future[ResultSet]
}

object DepartmentServices
{
  def apply: DepartmentServices = new DepartmentServicesImpl
}
