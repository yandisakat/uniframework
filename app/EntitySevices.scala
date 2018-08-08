package services.places

import com.datastax.driver.core.ResultSet
import domain.courses.Faculty
import services.courses.Impl.EntityImpl

import scala.concurrent.Future

trait EntityServices {

  def save(ent: Entity): Future[ResultSet]

  def getEntities(entityId: String): Future[Seq[Entity]]

  def getEntity(entityId: String): Future[Entity]

  def deleteEntities(entityId: String): Future[ResultSet]
}

object EntityServices{
  def apply: EntityServices = new EntityServicesImpl
}