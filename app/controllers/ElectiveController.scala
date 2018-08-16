package controllers
import javax.inject.Inject
import play.api.mvc._

/**
 * By Natasha (216020492) - 30/07/2018
 *
 */
 
class ElectiveController @Inject()(cc: ControllerComponents) extends AbstractController(cc) 
{
    def index = Action {
    Ok("Elective controller is working.")
    }
}
