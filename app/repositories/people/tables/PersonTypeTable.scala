package repositories.person.table



import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.users.person

import scala.concurrent.Future


abstract class PersonTable extends Table[PersonTable, Person] {

  object personId extends StringColumn with Primary

  object depId extends StringColumn

  object firstName extends StringColumn

  object lastName extends StringColumn

  object initials extends StringColumn

  object email extends StringColumn with PartitionKey

  

}

abstract class PersonTypeTableImpl extends PersonTypeTable with RootConnector {

  override lazy val tableName = "person"

  def save(person: Person): Future[ResultSet] = {
    insert
      .value(_.personId, person.personId)
      .value(_.depId, person.depId)
      .value(_.firstName, person.firstName)
      .value(_.lastName, person.lastName)
      .value(_.initials, person.intitials)
      .value(_.email, person.email)
      
      .future()
  }

  def getPerson(email: String, personId:String): Future[Option[Person]] = {
    select.where(_.email eqs email).and(_.personId eqs personId).one()
  }

  
  def getPersons: Future[Seq[Person]] = {
    select.fetchEnumerator() run Iteratee.collect()
  }

  def deletePerson(email: String, personId:String): Future[ResultSet] = {
    delete.where(_.email eqs email).and(_.personId eqs personId).future()
  }
}

abstract class PersonOrgTable extends Table[PersonOrgTable, Person] {

  object personId extends StringColumn with Primary

  object depId extends StringColumn

  object firstName extends StringColumn

  object lastName extends StringColumn

  object initials extends StringColumn

  object email extends StringColumn with PartitionKey
  

}

abstract class PersonrOrgTableImpl extends Person PersonOrgTable with RootConnector {

  override lazy val tableName = "orgperson"

  def save(person: Person): Future[ResultSet] = {
    insert
      .value(_.personId, person.personId)
      .value(_.depId, person.depId)
      .value(_.firstName, person.firstName)
      .value(_.lastName, person.lastName)
      .value(_.initials, person.intitials)
      .value(_.email, person.email)
      .future()
  }

    def deletePerson(personId: String, email: String): Future[ResultSet] = {
    delete.where(_.personId eqs personId).and(_.email eqs email).future()
  }
}





