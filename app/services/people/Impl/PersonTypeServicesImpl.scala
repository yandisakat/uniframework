package services.people.Impl

/**
 * creater Omega
 * reviewer Natasha
 *
 */



import com.datastax.driver.core.ResultSet
import domain.people.PersonType
import repositories.people.PersonTyperRepository
import services.people.PersonTypeServices

import scala.concurrent.Future

class PersonTypeServicesImpl extends PersonTypeRepository with PersonTypeServices
{
  def save(personType: PersonType): Future[ResultSet] = 
  {
      database.PersonTypeTable.save(PersonType)
  }
  
  def getPersonType(personId: String): Future[Seq[PersonType]] =
  {
      database.PersonTypeTable.getPersonType(personId)
  }
  
  def getPersonType(personId: String): Future[PersonType] = 
  {
      database.PersonTypeTable.getPersonType(personId).map(PersonType => Persontype.head)
  }
  
  def deletePersonType(personId: String): Future[ResultSet] =
  {
      database.PersonTypeTable.deletePersonType(personId)
  }
}

object PersonTypeServicesImpl extends PersonTypeServicesImpl with PersonTypeRepository
  
}
