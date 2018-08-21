package services.places.Impl

/**
 * creater Reece
 * reviewer Natasha
 */

import com.datastax.driver.core.ResultSet
import domain.places.Entity
import repositories.places.EntityRepository
import services.places.EntityServices

import scala.concurrent.Future

class EntityServicesImpl extends EntityRepository with EntityServices{
  def save(entity: Entity): Future[ResultSet] = {
    database.entityTable.save(entity)

  }

  def getEntities(entityId: String): Future[Seq[Entity]] = {
    database.entityTable.getEntities(entityId)

  }

  def getEntity(entityId: String): Future[Entity] = {
    database.entityTable.getEntities(entityId).map(entity => entity.head)
  }

  def deleteEntities(entityId:String):Future[ResultSet] ={
    database.entityTable.deleteEntities(entityId)
  }

}

object EntityServicesImpl extends EntityServicesImpl with EntityRepository


}
