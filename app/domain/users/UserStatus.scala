package domain.users

import java.time.LocalDateTime

import play.api.libs.json.Json

case class UserStatus(userId: String,
                      date: LocalDateTime,
                      status: String
                     )

object UserStatus {
  implicit val userFmt = Json.format[UserStatus]

  def identity: UserStatus = UserStatus("", LocalDateTime.now(), "")
}

