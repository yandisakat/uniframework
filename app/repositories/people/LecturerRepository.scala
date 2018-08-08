package repositories.people

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables.LecturerTableImpl

class LecturerDatabase(override val connector: KeySpaceDef) extends Database[LecturerDatabase](connector) {
  object lecturerTable extends LecturerTableImpl with connector.Connector
}

object LecturerDatabase extends LecturerDatabase(DataConnection.connector)

trait LecturerRepository {
  def database = LecturerDatabase
}
