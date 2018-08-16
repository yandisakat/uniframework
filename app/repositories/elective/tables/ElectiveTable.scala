package repositories.elective.tables

import java.time.LocalDateTime
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.elective.Elective
import scala.concurrent.Future

/**
  * By Natasha (216020492) - 30/07/2018
  */

abstract class ElectiveTable extends Table[ElectiveTable]
{
  object elective_Code extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  object elective_Name extends StringColumn
  object elective_Description extends StringColumn
  object elective_Status extends StringColumn
  object elective_Credits extends DoubleColumn
  object elective_Duration extends StringColumn
}

abstract class ElectiveTableImpl extends ElectiveTable with RootConnector
{
  override lazy val tableName = "Elective"
  
  def save(elective: Elective): Future[ResultSet] = 
  {
    insert
      .value(_.elective_Code, role.elective_Code)
      .value(_.elective_Name, role.elective_Name)
      .value(_.elective_Description, role.elective_Description)
      .value(_.elective_Status, role.elective_Status)
      .value(_.elective_Credits, role.elective_Credits)
      .value(_.elective_Duration, role.elective_Duration)
      .future()
  }
  
  def getElective(elective_Code:String):Future[Seq[Elective]] =
  {
    select
      .where(_.elective_Code eqs elective_Code)
      .fetchEnumerator() run Iteratee.collect()
  }
  
  
  def deleteElective(elective_Code:String):Future[ResultSet]=
  {
    delete
      .where(_.elective_Code eqs elective_Code)
      .future()
  }
}
