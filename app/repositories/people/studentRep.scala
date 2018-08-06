
package repositories.student

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.StudentTableImpl

class StudentDatabase(override val connector: KeySpaceDef) extends Database[StudentDatabase](connector)
{
  object StudentDatabase extends StudentDatabase(DataConnection.connector)
  
  trait StudentRepository
  {
    def database = StudentDatabase
  }
