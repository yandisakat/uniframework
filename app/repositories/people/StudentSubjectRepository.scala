package repositories.people

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.people.tables._

class StudentSubjectDatabase(override val connector: KeySpaceDef) extends Database[StudentSubjectDatabase](connector) {

  object StudentSubjectTable extends StudentSubjectTableImpl with connector.Connector

}

object StudentSubjectDatabase extends StudentSubjectDatabase(DataConnection.connector)

trait StudentSubjectRepository {
  def database = StudentSubjectDatabase
}
