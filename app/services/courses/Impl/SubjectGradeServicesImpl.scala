package services.courses.Impl

/** 
 * created by Natasha
 * reviewer Omega
*/

import com.datastax.driver.core.ResultSet
import domain.courses.SubjectGrade
import repositories.courses.SubjectGradeRepository
import services.courses.SubjectGradeServices

import scala.concurrent.Future

class SubjectGradeServicesImpl extends SubjectGradeRepository with SubjectGradeServices{
  def save(subjectgrade: SubjectGrade): Future[ResultSet] = {
    database.subjectGradeTable.save(subjectgrade)

  }

  def getSubjectGrade(subjectId: String): Future[Seq[SubjectGrade]] = {
    database.subjectGradeTable.getSubjectGrade(subjectId)

  }

  def getSubjectGrade(subjectId: String): Future[SubjectGrade] = {
    database.subjectGradeTable.getSubjectGrade(subjectId).map(subjectgrade => subjectgrade.head)
  }

  def deleteSubjectGrade(subjectId:String):Future[ResultSet] ={
    database.subjectGradeTable.deleteSubjectGrade(subjectId)
  }

}

object SubjectGradeServicesImpl extends SubjectGradeServicesImpl with SubjectGradeRepository


}
