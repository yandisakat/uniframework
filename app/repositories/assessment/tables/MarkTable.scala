package repositories.assessment.tables

/*
 * By Yandisa Katiya
 */

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import dpmain.assessments.Mark

import scala.concurrent.Future

abstract class MarkTable extends Table[MarkTable, Mark]
{
    object studentId extends StringColumn with PartitionKey
    
    object subjectId extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
 
    object markId extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
    
    object subjectName extends StringColumn
    
    object examiner extends StringColumn
  
    object date extends Col[LocalDateTime]
    
    object mark extends DoubleColumn
    
    object assessmentWeight extends DoubleColumn
  
}     

abstract class MarkTableImpl extends MarkTable with RootConnector
{
  override lazy val tableName = "mark"
  
  def save(mark: Mark): Future[ResultSet] =
  {
      insert
        .value(_.studentId, mark.studentId)
        .value(_.subjectId, mark.subjectId)
        .value(_.markId, mark.markId)
        .value(_.subjectName, mark.subjectName)
        .value(_.examiner, mark.examiner)
        .value(_.date,mark.date)
        .value(_.mark, mark.mark)
  `     .value(_.assessmentWeight, mark.assessmentWeight)
        .future()
  }
  
  def getMark(studentId: String, subjectId: String, markId: String):Future[Seq[Mark]] = 
  {
    select
      .where(_.studentId eqs studentId)
      .and(_.subjectId eqs subjectId)
      .and(_.markId eqs markId)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  def deleteMark(studentId:String, subjectId:String, markId: String):Future[ResultSet] = 
  {
    delete
      .where(_.studentId eqs studentId)
      .and(_.subjectId eqs subjectId)
      .and(_.markId eqs markId)
      .future()
  }
  
}
  
