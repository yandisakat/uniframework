package services.assessments

/**
 * Created by Yandisa Katiya
 * reviewer Thomas Miller
 *
 */

import com.datastax.driver.core.ResultSet
import domain.assessments.Mark
import services.assessments.Impl.MarkImpl

import scala.concurrent.Future

trait MarkServices
{
  def save(mark: Mark): Future[ResultSet]
  
  def getMarks(markId: String): Future[Seq[Mark]]
  
  def getMark(markId: String): Future[Mark]
  
  def deleteMark(markId: String): Future[ResultSet]
  
}

object MarkServices
{
  def apply: MarkServices = new MarkServicesImpl
}
