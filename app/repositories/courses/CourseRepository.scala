package repositories.courses

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.courses.tables._

/*
*By Omega Mbadu
*/

class CourseDatabase(overide val connector: KeySpaceDef) extends Database [CourseDatabase](connector)
{
    object CourseTable extends CourseTalbleImp with connector.Connector
}

object CourseDatabase extends CourseDatabase(DataConnection.connector)

trait CourseRepository
{
def database=CourseDatabase
}

