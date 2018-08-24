package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables._

class SubjectTypesDatabase(override val connector: KeySpaceDef) extends Database[SubjectTypesDatabase](connector)
{
   object SubjectTypesTable extends SubjectTypesTableImp with connector.Connector
}

object SubjectTypesDatabase extends SubjectTypesDatabase(DataConnection.connector)

trait SubectTypesRepository
{
  def database = SubjectTypesDatabase
}
