package repositories.people.tables

/*
 * By Yandisa Katiya
 * Reviewed by Dorcas
 */

import java.time.LocalDateTime
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.people.Staff
import scala.concurrent.Future

abstract class StaffTable extends Table[StaffTable, Staff]
{
  object staffId extends StringColumn with PartitionKey
  
  object firstName extends StringColumn
 
  object lastName extends StringColumn
  
  object telNum extends StringColumn
  
  object email extends StringColumn
  
  object address extends StringColumn
  
  object jobTitle extends StringColumn
  
  object startDate extends Col[LocalDateTime] with PrimaryKey with ClusteringOrder with Ascending
  
}

abstract class StaffTableImpl extends StaffTable with RootConnector
{
    override lazy val = tableName = "staff"
  
    def save(staff: Staff): Future[ResultSet]=
    {
       insert
        .value(_.staffId, staff.staffId)
        .value(_.firstName, staff.firstName)
        .value(_.lastName, staff.lastName)
        .value(_.telNum,staff.telNum)
        .value(_.email, staff.email)
        .value(_.address, staff.address)
        .value(_.jobTitle, staff.jobTitle)
        .value(_.startDate, staff.startDate)
        .future()
    }
    
  def getStaff(staffId:String, startDate:LocalDateTime): Future[Seq[Staff]] = 
  {
    select
      .where(_.staffId eqs staffId)
      .and(_.startDate eqs startDate)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  def deleteStaff(staffId:String, startDate:LocalDateTime): Future[ResultSet] = 
  {
    delete
      .where(_.staffId eqs staffId)
      .and(_.startDate eqs startDate)
      .future()
  }
}
