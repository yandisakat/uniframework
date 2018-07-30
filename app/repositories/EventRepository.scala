package repositories.event

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.EventTableImpl

class EventDatabase(override val connector: KeySpaceDef) extends Database[EventDatabase](connector)
{
  object EventDatabase extends EventDatabase(DataConnection.connector)
  
  trait EventRepository
  {
    def database = EventDatabase
}
