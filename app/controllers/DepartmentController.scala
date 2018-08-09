package controllers.department

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

/**
  * Created Dorcas on 2018/07/18.
  */
class DepartmentController @Inject()(cc: ControllerComponents) extends AbstractController(cc)  {

  def index = Action {
    Ok("Department controller is working")
}
}

