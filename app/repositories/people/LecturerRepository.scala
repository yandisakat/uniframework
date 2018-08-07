package repositories.people

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.lecturer.tables.LecturerTablelmpl


class LecturerDatabase(override val connector: KeySpaceDef)extends Database [lecturerDatabase](connect) {


  object lecturerTable extends LecturerTableLmpl with connector.Connector

}


object peopleDatabase extends LecturerDatabase(DataConnection.connector)

trait PeopleRepository {
  def database = LecturerDatabase
}
