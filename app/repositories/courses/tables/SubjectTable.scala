package repositories.courses.tables

/*
 * By Yandisa Katiya
 */

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.Subject
import scala.concurrent.Future

abstract class SubjectTable extends Table[SubjectTable, Subject]
{
  object subjectId extends StringColumn with PartitionKey
 
  object subjectName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  
  object subjectCredits extends StringColumn
  
  object subjectDuration extends StringColumn
  
  object minPassPercent extends DoubleColumn
  
}

abstract class SubjectTableImpl extends SubjectTable with RootConnector
{
    override lazy val tableName = "subject"
    
    def save(subject: Subject): Future[ResultSet] =
    {
      insert
        .value(_.subjectId, subject.subjectId)
        .value(_.subjectName, role.subjectName) 
        .future()
    }
  
    def getSubject(subjectId:String, subjectName:String): Future[Seq[Subject]] =
    {
       select 
          .where(_.subjectId eqs subjectId)]
          .and(subjectName eqs subjectName)
          .fetchEnumerator() run Iteratee.collect()
    }
  
    def deleteSubject(subjectId:String, subjectName:String):Future[ResultSet] =
    {
      delete
        .where(_.subjectId eqs subjectId)
        .and(_.subjectName eqs subjectName)
        .future()
    }
  
}
