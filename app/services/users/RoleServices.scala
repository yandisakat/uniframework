package services.users

import com.datastax.driver.core.ResultSet
import domain.users.UserRole
import services.users.Impl.RoleServicesImpl

import scala.concurrent.Future

trait RoleServices {

  def save(role: UserRole): Future[ResultSet]

  def getUserRoles(emailId: String): Future[Seq[UserRole]]

  def getUserRole(emailId: String): Future[UserRole]

  def deleteUserRoles(emailId: String): Future[ResultSet]
}

object RoleServices{
  def apply: RoleServices = new RoleServicesImpl
}
