package repositories.places

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.EntityTableImpl

class EntityDatabase(override val connector: KeySpaceDef) extends Database[EntityDatabase](connector) {
  object EntityTable extends EntityTableImpl with connector.Connector
}

object EntityDatabas extends EntityDatabase(DataConnection.connector)

trait EntityRepository {
  def database = EntityDatabase
}
