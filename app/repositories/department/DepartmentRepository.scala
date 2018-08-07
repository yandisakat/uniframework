package repositories.department

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.department.tables._
/*
 *  By Yandisa Katiya 
 */


class DepartmentDatabase(override val connector: KeySpaceDef) extends Database[DepartmentDatabase](connector)
{
  object DepartmentTable extends DepartmentTableImp with connector.Connector
}

object DepartmentDatabase extends DepartmentDatabase(DataConnection.connector)

trait DepartmentRepository
{
  def database = DepartmentDatabase
}


