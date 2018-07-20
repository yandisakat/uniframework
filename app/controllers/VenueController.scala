package controllers
import javax.inject.Inject
import play.api.mvc._

/**
 * By Yandisa - 2018/07/21
 */
 
class VenueController @Inject()(cc: ControllerComponents) extends AbstractController(cc) 
{
    def index = Action 
    {
      Ok("Your venue controller works.")
    }

}
