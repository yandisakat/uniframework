package domain.users


import java.time.LocalDateTime

import domain.security.RolesID
import play.api.libs.json.Json


/**
  *
  * @param orgId Organisation or Site or Institution Unique ID
  * @param email
  * @param date Date the User was created
  * @param roleId role Unique ID
  */


case class UserRole(orgId: String,
                    emailId: String,
                    date: LocalDateTime,
                    roleId: String)

object UserRole {
  implicit val userroleFmt = Json.format[UserRole]

  def identity: UserRole = UserRole(" "," ", LocalDateTime.now(), RolesID.STUDENT)
}
 
