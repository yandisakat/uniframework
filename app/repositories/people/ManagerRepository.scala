package repositories.manager

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables.ManagertableImpl

/*
 *created by Omega Mbadu
 */
class ManagerDatabase(override val connector:KeySpacedef) extends Database[ManagerDatabase](connector){
  object managerTable extends ManagerTableImpl with connector.Connector
}

object ManagerDatabase extedns ManagerDatabase (DataConnection.connector)

trait ManagerRepository{
def database= ManagerDatabase
}
