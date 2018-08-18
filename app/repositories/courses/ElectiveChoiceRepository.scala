package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables._

/*
 * By Omega Mbadu
 */

class ElectivesDatabase(override val connector: KeySpaceDef) extends Database[ElectivesDatabase](connector)
{
   object ElectivesTable extends ElectivesTableImp with connector.Connector
}

object ElectivesDatabase extends ElectivesDatabase(DataConnection.connector)

trait ElectiveChoiceRepository
{
  def database = ElectivesDatabase
}
