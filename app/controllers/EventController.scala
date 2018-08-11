package controllers
import javax.inject.Inject
import play.api.mvc._

/**
 * By Natasha (216020492) - 30/07/2018
 */
 
class EventController @Inject()(cc: ControllerComponents) extends AbstractController(cc) 
{
    def index = Action {
    Ok("Event controller is working.")
    }
}
