package services.places

/**
 * creater Reece
 * reviewer Natasha
 */

import com.datastax.driver.core.ResultSet
import domain.places.Entity
import services.places.Impl.EntityServicesImpl

import scala.concurrent.Future

trait EntityServices {

  def save(entity: Entity): Future[ResultSet]

  def getEntities(entityId: String): Future[Seq[Entity]]

  def getEntity(entityId: String): Future[Entity]

  def deleteEntities(entityId: String): Future[ResultSet]
}

object EntityServices{
  def apply: EntityServices = new EntityServicesImpl
}
