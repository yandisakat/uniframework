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
    
    object subjectId extends StringColumn with PrimaryKey with ClusteringOrder with Asceneding
    
    object subjectName extends StringColumn
    
    object examiner extends StringColumn
  
    object date extends Col[LocalDateTime]
    
    object mark extends DoubleColumn
    
    object assessmentWeight extends DoubleColumn
  
}     

abstract class MarkTableImpl extends MarkTable with RootConnector
{
  override lazy val tableName = "mark"
  
  def save(role: mark): Future[ResultSet] =
  {
      insert
        .value(_.studentId, role.studentId)
        .value(_.subjectId, role.subjectId)
        .value(_.subjectName, role.subjectName)
        .value(_.examiner, role.examiner)
        .value(_.date, role.date)
        .value(_.mark, role.mark)
  `     .value(_.assessmentWeight, role.assessmentWeight)
        .future()
  }
  
  def getMark(studentId: String, subjectId: String):Future[Seq[Mark]] = 
  {
    select
      .where(_.studentId eqs studentId)
      .and(_.subjectId eqs subjectId)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  def deleteMark(studentId:String, subjectId:String):Future[ResultSet] = 
  {
    delete
      .where(_.studentId eqs studentId)
      .and(_.subjectId eqs subjectId)
      .future()
  }
  
}
  
