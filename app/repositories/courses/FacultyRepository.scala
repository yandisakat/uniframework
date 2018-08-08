package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables.FacultyTableImpl

class FacultyDatabase(override val connector: KeySpaceDef) extends Database[FacultyDatabase](connector) {
  object facultyTable extends FacultyTableImpl with connector.Connector
}

object FacultyDatabase extends FacultyDatabase(DataConnection.connector)

trait FacultyRepository {
  def database = FacultyDatabase
}
