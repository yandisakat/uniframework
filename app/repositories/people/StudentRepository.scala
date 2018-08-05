package repositories.people

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables._

/**
  * By Yandisa Katiya - 2018/07/21
  */

class StudentDatabase(override val connector: KeySpaceDef) extends Database[StudentDatabase](connector) 
{
  object studentTable extends StudentTableImpl with connector.Connector
}

object StudentDatabase extends StudentDatabase(DataConnection.connector)

trait StudentRepository 
{
  def database = StudentDatabase
}
