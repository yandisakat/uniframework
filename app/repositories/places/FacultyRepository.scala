package repositories.places

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables._

class FacultyDatabase(override val connector: KeySpaceDef) extends Database[FacultyDatabase](connector) {

  object FacultyTable extends FacultyTableImpl with connector.Connector

  object FacultyTable extends FacultyOrgTableImpl with connector.Connector


}

object FacultyDatabase extends FacultyDatabase(DataConnection.connector)

trait FacultyRepository {
  def database = FacultyDatabase
}
