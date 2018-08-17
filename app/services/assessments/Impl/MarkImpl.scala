package services.assessments.Impl

/**
 * created by Yandisa Katiya
 * reviewer Thomas
 *
 */

import com.datastax.driver.core.ResultSet
import domain.assessments.Mark
import repositories.assessment.MarkRepository
import services.assessments.MarkServices

import scala.concurrent.Future

class MarkServicesImpl extends MarkRepository with MarkServices
{
  def save(mark: Mark): Future[ResultSet] = 
  {
      database.markTable.save(mark)
  }
  
  def getMarks(markId: String): Future[Seq[Mark]] =
  {
      database.markTable.getMarks(markId)
  }
  
  def getMark(markId: String): Future[Venue] = 
  {
      database.markTable.getMarks(markId).map(mark => mark.head)
  }
  
  def deleteMarks(markId: String): Future[ResultSet] =
  {
      database.markTable.deleteMarks(markId)
  }
}

object MarkServicesImpl extends MarkServicesImpl with MarkRepository
  
}
