package repositories.places

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.users.tables.VenueTableImpl

/*
 * @created by Natasha
 */

class VenueDatabase(override val connector: KeySpaceDef) extends Database[VenueDatabase](connector) {
  object VenueTable extends VenueTableImpl with connector.Connector
}

object VenueDatabase extends VenueDatabase(DataConnection.connector)

trait VenueRepository {
  def database = VenueDatabase
}
