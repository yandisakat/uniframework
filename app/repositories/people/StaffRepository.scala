package repositories.people

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables._

/*
 * By Yandisa Katiya
 */

class StaffDatabase(override val connector: KeySpaceDef) extends Database(StaffDatabase](connector)
{
  object StaffTable extends StaffTableImpl with connector.Connector
}
                                                                          
object StaffDatabase extends StaffDatabase(DataConnection.connector)
                                                                          
trait StaffRepository
{
  def database = StaffDatabase
}
                                                                            
