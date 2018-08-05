package repositories.event

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.event.tables.EventTableImp

class EventDatabase(override val connector: KeySpaceDef) extends Database[EventDatabase](connector){
  object eventTable extends EventTableImpl with connector.Connector
}

  object EventDatabase extends EventDatabase(DataConnection.connector)

  trait EventRepository
  {
    def database = EventDatabase
  }
