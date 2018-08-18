package repositories.people.tables

/*
 * By Omega Mbadu
 * Reviewer Walied Abrahams
 */

import java.time.LocalDateTime
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.people.Manager
import scala.concurrent.Future

abstract class ManagerTable extends Table[ManagerTable, Manager]
{
  object managerId extends StringColumn with PartitionKey
  
  object firstName extends StringColumn
 
  object lastName extends StringColumn
  
  object telNum extends StringColumn
  
  object email extends StringColumn
  
  object address extends StringColumn
  
  object jobTitle extends StringColumn
  
  object startDate extends Col[LocalDateTime] with PrimaryKey with ClusteringOrder with Ascending
  
}

abstract class ManagerTableImpl extends ManagerTable with RootConnector
{
    override lazy val = tableName = "manager"
  
    def save(manager: Manager): Future[ResultSet]=
    {
       insert
        .value(_.managerId, manager.managerId)
        .value(_.firstName, manager.firstName)
        .value(_.lastName, manager.lastName)
        .value(_.telNum, manager.telNum)
        .value(_.email, manager.email)
        .value(_.address, manager.address)
        .value(_.jobTitle, manager.jobTitle)
        .value(_.startDate, manager.startDate)
        .future()
    }
    
  def getManager(managerId:String, startDate:LocalDateTime): Future[Seq[Manager]] = 
  {
    select
      .where(_.managerId eqs managerId)
      .and(_.startDate eqs startDate)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  def deleteManager(managerId:String, startDate:LocalDateTime): Future[ResultSet] = 
  {
    delete
      .where(_.managerId eqs managerId)
      .and(_.startDate eqs startDate)
      .future()
  }
}
