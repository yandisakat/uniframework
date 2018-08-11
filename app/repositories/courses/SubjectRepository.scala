package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables._

/*
 * By Yandisa Katiya
 */

class SubjectDatabase(override val connector: KeySpaceDef) extends Database[SubjectDatabase](connector)
{
   object SubjectTable extends SubjectTableImp with connector.Connector
}

object SubjectDatabase extends SubjectDatabase(DataConnection.connector)

trait SubectRepository
{
  def database = SubjectDatabase
}
