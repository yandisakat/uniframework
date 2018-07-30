package repositories.staff.tables

import java.time.LocalDateTime
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.staff.Staff
import scala.concurrent.Future

/**
  * By Natasha (216020492) - 30/07/2018
  */

abstract class StaffTable extends Table[StaffTable]
{
  object staff_ID extends IntColumn with PrimaryKey with ClusteringOrder with Ascending
  object staff_Name extends StringColumn
  object staff_Surname extends StringColumn
  object staff_Email extends StringColumn
  object staff_DOB extends DateColumn
  object staff_Type extends StringColumn
  object staff_Phone extends StringColumn
  object staff_Cellno extends StringColumn
  object staff_Address extends StringColumn
}

abstract class StaffTableImpl extends StaffTable with RootConnector
{
  override lazy val tableName = "Staff"
  
  def save(role: Staff): Future[ResultSet] = 
  {
    insert
      .value(_.staff_ID, role.staff_ID)
      .value(_.staff_Name, role.staff_Name)
      .value(_.staff_Surname, role.staff_Surname)
      .value(_.staff_Email, role.staff_Email)
      .value(_.staff_DOB, role.staff_DOB)
      .value(_.staff_Type, role.staff_Type)
      .value(_.staff_Phone, role. staff_Phone)
      .value(_.staff_Cellno, role.staff_Cellno)
      .value(_.staff_Address, role.staff_Address)
      .future()
  }
  
  def getStaff(staff_ID:String):Future[Seq[Staff]] =
  {
    select
      .where(_.staff_ID eqs staff_ID)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  
  def deleteStaff(staff_ID:Int):Future[ResultSet]=
  {
    delete
      .where(_.staff_ID eqs staff_ID)
      .future()
  }
}
