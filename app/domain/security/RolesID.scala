package domain.security

import javax.inject.Singleton

@Singleton
object RolesID {

  def ADMIN_STAFF: String = "ADMIN STAFF"

  def LECTURER: String = "LECTURER"

  def STUDENT: String = "STUDENT"

  def SITE_ADMIN: String = "SITE_ADMINISTRATOR"

  def ADMIN: String = "SYSTEM_ADMINISTRATOR"
}
