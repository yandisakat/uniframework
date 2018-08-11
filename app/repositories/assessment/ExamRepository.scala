package repositories.assessment

/**
  * created by Wailed
  * reviewer Kessel
  */

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.assessment.tables.ExamTableImpl

class ExamDatabase(override val connector: KeySpaceDef) extends Database[ExamDatabase](connector) {
  object examTable extends ExamTableImpl with connector.Connector
}

object ExamDatabase extends ExamDatabase(DataConnection.connector)

trait ExamRepository {
  def database = ExamDatabase
}
