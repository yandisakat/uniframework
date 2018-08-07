package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables.StudentGradeTableImpl

class StudentGradeDatabase(override val connector: KeySpaceDef) extends Database[StudentGradeDatabase](connector) {
  object studentGradeTable extends StudentGradeTableImpl with connector.Connector
}

object StudentGradeDatabase extends StudentGradeDatabase(DataConnection.connector)

trait StudentGradeRepository {
  def database = StudentGradeDatabase
}
