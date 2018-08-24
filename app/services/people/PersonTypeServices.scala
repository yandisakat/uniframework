package services.people

/**
 * creater Kessel
 * reviewer Omega
 *
 */

import com.datastax.driver.core.ResultSet
import domain.people.PersonType
import services.people.Impl.PersonTypeServicesImpl

import scala.concurrent.Future

trait PersonTypesServices {

  def save(personType: PersonType): Future[ResultSet]

  def getPersonTypes(personTypeId: String): Future[Seq[PersonType]

  def getPersonType(personTypeId: String): Future[PersonType]

  def deletePersonType(personTypeId: String): Future[ResultSet]
}

object PersonTypeServices{
  def apply: PersonTypeServices = new PersonTypeServicesImpl
}
