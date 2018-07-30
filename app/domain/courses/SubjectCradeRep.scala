/**
* Created by 216074630 on 7/30/2018.
**/

package repositories.student

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.SubjectGradeTableImpl

class SubjectGradeDatabase(override val connector: KeySpaceDef) extends Database[SubjectGradeDatabase](connector)
{
  object SubjectGradeDatabase extends SubjectGradeDatabase(DataConnection.connector)
  
  trait SubjectGradeRepository
  {
    def database = SubjectGradeDatabase
  }
}