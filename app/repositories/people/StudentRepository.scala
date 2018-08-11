package repositories.people

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables._

/*
 * Reviewed by Yandisa Katiya
 */

class StudentDatabase(override val connector: KeySpaceDef) extends Database[StudentDatabase](connector) {
  object studentTable extends StudentTableImpl with connector.Connector
}

object StudentDatabase extends StudentDatabase(DataConnection.connector)

trait StudentRepository {
  def database = StudentDatabase
}
