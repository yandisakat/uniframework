package controllers
import javax.inject.Inject
import play.api.mvc._

/**
  * By Yandisa Katiya - 2018/07/21
  */
  
  
class StudentController @Inject()(cc:ControllerComponents) extends AbstractController(cc)
{
  def index = Action
  {
    Ok("Your student controller works.")
  }
}
