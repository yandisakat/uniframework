package repositories.security

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.security.tables.LoginTableImpl

class LoginDatabase(override val connector: KeySpaceDef) extends Database[LoginDatabase](connector) {
  object loginTable extends LoginTableImpl with connector.Connector
}

object LoginDatabase extends LoginDatabase(DataConnection.connector)

trait LoginRepository {
  def database = LoginDatabase
}
