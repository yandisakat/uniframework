package repositories.events

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.events.tables._

/*
 * By Omega Mbadu
 * reviewed by Natasha
 */

class ElectiveChoiceEventsDatabase(override val connector: KeySpaceDef) extends Database[ElectiveChoiceEventsDatabase](connector)
{
   object electiveChoiceEventsTable extends ElectiveChoiceEventsTableImp with connector.Connector
}

object ElectiveChoiceEventsDatabase extends ElectiveChoiceEventsDatabase(DataConnection.connector)

trait ElectiveChoiceEventsRepository
{
  def database = ElectiveChoiceEventsDatabase
}
