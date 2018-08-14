package repositories.assessment

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.assessment.tables._

/*
 * By Yandisa Katiya
 * Reviewer Kessel
 */

class MarkDatabase(override val connector: KeySpaceDef) extends Database[MarkDatabase](connector)
{
  object MarkTable extends MarkTableImpl with connector.Connector
}

object MarkDatabase extends MarkDatabase(DataConnection.connector)

trait MarkRepository
{
   def database = MarkDatabase
}

