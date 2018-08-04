package controllers.roles

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

class CourseRouter @Inject()
(courseController: CourseController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
