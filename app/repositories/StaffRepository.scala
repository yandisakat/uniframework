package repositories.places

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.StaffTableImpl

class StaffDatabase(override val connector: KeySpaceDef) extends Database[StaffDatabase](connector)
{
  object StaffDatabase extends StaffDatabase(DataConnection.connector)
  
  trait StaffRepository
  {
    def database = StaffDatabase
}
