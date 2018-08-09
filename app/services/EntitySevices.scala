package services.places

import com.datastax.driver.core.ResultSet
import domain.pdomain.places.Place
import services.places.Impl.EntityImpl

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
