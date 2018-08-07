package repositories.people

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables.PeopleTablelmpl


class peopleDatabase(override val connector: KeySpaceDef)extends Database [peopleDatabase](connect) {


  object peopleTable extends peopleTableLmpl with connector.Connector

}


object peopleDatabase extends PeopleDatabase(DataConnection.connector)

trait PeopleRepository {
  def database = PeopleDatabase
}
