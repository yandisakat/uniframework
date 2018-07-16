package controllers.users

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  * Created by hashcode on 2017/03/04.
  */
class UsersRouter @Inject()
 (userCreationRouter: UserController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
