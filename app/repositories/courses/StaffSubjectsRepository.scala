package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables._

/*
 * By Yandisa Katiya
 */

class StaffSubjectsDatabase(override val connector: KeySpaceDef) extends Database[StaffSubjectsDatabase](connector)
{
  object StaffSubjectsTable extends StaffSubjectsTableImpl with connector.Connector
}

object StaffSubjectsDatabase extends StaffSubjectsDatabase(DataConnection.connector)

trait StaffSubjectsRepository
{
    def database = StaffSubjectsDatabase
}
