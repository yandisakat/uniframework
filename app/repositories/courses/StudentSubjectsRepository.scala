package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables._

/*
 * By Omega Mbadu
 * Reviewed by Yandisa Katiya
 */

class StudentSubjectsDatabase(override val connector: KeySpaceDef) extends Database[StudentSubjectsDatabase](connector)
{
  object StudentSubjectsTable extends StudentSubjectsTableImpl with connector.Connector
}

object StudentSubjectsDatabase extends StudentSubjectsDatabase(DataConnection.connector)

trait StudentSubjectsRepository
{
    def database = StudentSubjectsDatabase
}
