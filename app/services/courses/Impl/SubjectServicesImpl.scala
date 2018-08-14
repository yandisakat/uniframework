package services.courses.Impl

/** 
 * creater Reece
 * reviewer Omega
 *
 *
*/


import com.datastax.driver.core.ResultSet
import domain.courses.Subject
import repositories.courses.SubjectRepository
import services.courses.SubjectServices

import scala.concurrent.Future

class SubjectServicesImpl extends SubjectRepository with SubjectServices{
  def save(subject: Subject): Future[ResultSet] = {
    database.subjectTable.save(subject)

  }

  def getSubjects(subjectId: String): Future[Seq[Subject]] = {
    database.subjectTable.getSubjects(subjId)

  }

  def getSubject(subjId: String): Future[Subject] = {
    database.subjectTable.getSubjects(subjId).map(subject => subject.head)
  }

  def deleteSubjects(subjId:String):Future[ResultSet] ={
    database.subjectTable.deleteSubjects(subjId)
  }

}

object SubjectServicesImpl extends SubjectServicesImpl with SubjectRepository


}
