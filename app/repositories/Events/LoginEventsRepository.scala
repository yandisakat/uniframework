package repositories.events

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.events.tables.LoginEventsTableImpl

class LoginEventsDatabase(override val connector: KeySpaceDef) extends Database[LoginEventsDatabase](connector)
{
  object loginEventsTable extends LoginEventsTableImpl with connector.Connector
}

object LoginEventsDatabase extends LoginEventsDatabase(DataConnection.connector)
  
  trait LoginEventsRepository {
    def database = LoginEventsDatabase
}
