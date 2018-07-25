package controllers.roles

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  * Created by hashcode on 2017/03/04.
  */
class UtilRouter @Inject()
(roleController: RoleController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
