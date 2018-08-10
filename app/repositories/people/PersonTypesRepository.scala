package repositories.people
/*
 * By Dorcas Mbi
 * Reviewed by Yandisa Katiya
 */

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables._

class PersonTypesDatabase(override val connector: KeySpaceDef) extends Database[PersonTypesDatabase](connector) 
{
  object PersonTypesTable extends PersonTypesTableImpl with connector.Connector

}

object PersonTypesDatabase extends PersonTypesDatabase(DataConnection.connector)

trait PersonTypesRepository 
{
  def database = PersonTypesDatabase
}
