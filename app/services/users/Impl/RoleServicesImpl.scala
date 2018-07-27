package services.users.Impl

import com.datastax.driver.core.ResultSet
import domain.users.UserRole
import repositories.users.UserRoleRepository
import services.users.RoleServices

import scala.concurrent.Future

class RoleServicesImpl extends UserRoleRepository with RoleServices{
  def save(role: UserRole): Future[ResultSet] = {
    database.userRoleTable.save(role)

  }

  def getUserRoles(emailId: String): Future[Seq[UserRole]] = {
    database.userRoleTable.getUserRoles(emailId)

  }

  def getUserRole(emailId: String): Future[UserRole] = {
    database.userRoleTable.getUserRoles(emailId).map(role => role.head)
  }

  def deleteUserRoles(emailId:String):Future[ResultSet] ={
    database.userRoleTable.deleteUserRoles(emailId)
  }

}

object RoleServicesImpl extends RoleServicesImpl with UserRoleRepository


}
