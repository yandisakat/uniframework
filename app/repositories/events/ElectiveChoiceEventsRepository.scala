package repositories.events

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.events.tables._

/*
 * By Omega Mbadu
 * reviewed by Natasha
 */

class ElectiveChoiceEventDatabase(override val connector: KeySpaceDef) extends Database[ElectiveChoiceEventDatabase](connector)
{
   object electiveChoiceEventTable extends ElectiveChoiceEventTableImp with connector.Connector
}

object ElectiveChoiceEventDatabase extends ElectiveChoiceEventDatabase(DataConnection.connector)

trait ElectiveChoiceEventsRepository
{
  def database = ElectiveChoiceEventDatabase
}
