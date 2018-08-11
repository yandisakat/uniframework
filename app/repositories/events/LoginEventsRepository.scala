package repositories.events

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.events.tables._

class PersonDatabase(override val connector: KeySpaceDef) extends Database[PersonDatabase](connector) {

  object LoginEventTable extends LoginEventTableImpl with connector.Connector

  object LoginTable extends LoginEventOrgTableImpl with connector.Connector


}

object LoginEventDatabase extends LoginEventDatabase(DataConnection.connector)

trait LoginEventsRepository {
  def database = LoginEventDatabase
}
