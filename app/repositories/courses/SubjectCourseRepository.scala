package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.users.tables.SubjectCourseTableImpl

/**
  * created by Natasha
  * 
  */


class SubjectCourseDatabase(override val connector: KeySpaceDef) extends Database[SubjectCourseDatabase](connector) {
  object subjectCourseTable extends SubjectCourseTableImpl with connector.Connector
}

object SubjectCourseDatabase extends SubjectCourseDatabase(DataConnection.connector)

trait SubjectCourseRepository {
  def database = SubjectCourseDatabase
}
