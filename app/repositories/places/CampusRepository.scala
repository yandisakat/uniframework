package repositories.places

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables._

/*
 * By Yandisa Katiya
 * reviewed by Natasha
 */

class CampusDatabase(override val connector: KeySpaceDef) extends Database[CampusDatabase](connector)
{
  object CampusTable extends CampusTableImp with connector.Connector
}

object CampusDatabase extends CampusDatabase(DataConnection.connector)

trait CampusRepository
{
  def database = CampusDatabase
}
