
package repositories.course

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.CourseTableImpl

class CourseDatabase(override val connector: KeySpaceDef) extends Database[CourseDatabase](connector)
{
  object CourseDatabase extends CourseDatabase(DataConnection.connector)
  
  trait CourseRepository
  {
    def database = CourseDatabase
  }
