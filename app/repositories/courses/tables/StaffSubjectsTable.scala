package repositories.course.tables

/*
 * By Yandisa Katiya
 */

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.StaffSubjects

import scala.concurrent.Future

abstract class StaffSubjectsTable extends Table[StaffSubjectsTable, Table]
{
    object staffId extends StringColumn with PartitionKey
    
    object subjectId extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  
    object subjectName extends StringColumn
    
}

abstract class StaffSubjectsTableImpl extends StaffSubjectsTable with RootConnector
{
    override lazy val tableName = "staffSubjects"
  
    def save(role: staffSubjects): Future[ResultSet] =
    {
      insert 
        .value(_.staffId, role.staffId)
        .value(_.subjectId, role.subjectId)
        .value(_.subjectName, role.subjectName)
        .future()
    }
  
    def getStaffSubjects(staffId: String, subjectId: String):Future[Seq[StaffSubjects]] =
    {
      select
        .where(_.staffId eqs staffId)
        .and(subjectId eqs subjectId)
        .fetchEnumerator() run Iteratee.collect()
    }
  
    def deleteStaffSubjects(staffId:String, subjectId:String):Future[ResultSet] =
    {
       delete
          .where(_.staffId eqs staffId)
          .and(_.subjectId eqs subjectId)
          .future()
    }
}
      

    
    
                                                
