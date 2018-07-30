package repositories.elective

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.ElectiveTableImpl

class ElectiveDatabase(override val connector: KeySpaceDef) extends Database[ElectiveDatabase](connector)
{
  object ElectiveDatabase extends ElectiveDatabase(DataConnection.connector)
  
  trait ElectiveRepository
  {
    def database = ElectiveDatabase
}
