package repositories.people.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.people.student

import scala.concurrent.Future


abstract class studentSubjectTable extends Table[StudentSubjectTable, StudentSubject] {

  object orgId extends StringColumn with PrimaryKey

  object firstName extends StringColumn 

  object lastName extends StringColumn

  object screenName extends StringColumn

  object password extends StringColumn

  object state extends StringColumn

  object date extends LocalDateTime

}

abstract class StudentSubjectTableImpl extends StudentSubjectTable with RootConnector {

  override lazy val tableName = "studentSubject"

  def save(sub: StudentSubject): Future[ResultSet] = {
    insert
      .value(_.orgId, sub.orgId)
      .value(_.firstName, sub.firstName)
      .value(_.lastName, sub.lastName)
      .value(_.screenName, sub.screenName)
      .value(_.password, sub.password)
      .value(_.state, sub.state)
      .value(_.date, sub.date)      
      .future()
  }

 

}
