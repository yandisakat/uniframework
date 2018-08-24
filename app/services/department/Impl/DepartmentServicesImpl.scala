
package services.courses.Impl

/** 
 * Created by Reece
 * Reviewed by Yandisa Katiya
 *
 *
*/

import com.datastax.driver.core.ResultSet
import domain.courses.Department
import repositories.courses.DepartmentRepository
import services.courses.DepartmentServices

import scala.concurrent.Future

class DepartmentServicesImpl extends DepartmentRepository with DepartmentServices{
  def save(department: Department): Future[ResultSet] = {
    database.departmentTable.save(department)
  }

  def getDepartments(depId: String): Future[Seq[Department]] = {
    database.departmentTable.getDepartments(depId)
  }

  def getDepartment(depId: String): Future[Department] = {
    database.departmentTable.getDepartments(depId).map(department => department.head)
  }

  def deleteDepartments(depId: String):Future[ResultSet] ={
    database.departmentTable.deleteDepartments(depId)
  }
}

object DepartmentServicesImpl extends DepartmentServicesImpl with DepartmentRepository
}
