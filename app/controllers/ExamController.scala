package controllers.exam

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

/**
  * Created Dorcas on 2018/07/18.
  */
class ExamController @Inject()(cc: ControllerComponents) extends AbstractController(cc)  {
 
 def index = Action {
    Ok("Exam controller is working")
}


}

