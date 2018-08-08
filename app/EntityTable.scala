package repositories.places.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.Faculty

import scala.concurrent.Future


abstract class EntityTable extends Table[EntityTable, Entity] {

  object entityId extends StringColumn with PartitionKey

  object entityName extends StringColumn with Ascending

  object uniId extends StringColumn
  
  object facultyId extends StringColumn
  
  object departmentId extends StringColumn

}

abstract class EntityImpl extends EntityTable with RootConnector {

  override lazy val tableName = "entities"

  def save(entity: Entity): Future[ResultSet] = {
    insert
      .value(_.entityId, entity.facId)
      .value(_.entityName, entity.entityName)
      .value(_.uniId, entity.uniId)
	  .value(_.facultyId, entity.facultyId)
	  .value(_.departmentId, entity.departmentId)
      .future()
  }

  def getEntity(entityId:String, entityName: String):Future[Seq[Entity]] = {
    select
      .where(_.entityId eqs entityId)
      .and(_.entityName eqs entityName)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteFaculties(entityId:String, entityName: String):Future[ResultSet] ={
    delete
      .where(_.entityId eqs entityId)
      .and(_.entityName eqs entityName)
      .future()
  }
}
