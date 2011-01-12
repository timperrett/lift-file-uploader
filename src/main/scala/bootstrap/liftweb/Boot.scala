package bootstrap.liftweb

import net.liftweb.http.{LiftRules, NotFoundAsTemplate, ParsePath}
import eu.getintheloop.samples.dispatch.Upload

class Boot {
  def boot {
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))
    LiftRules.dispatch.append(Upload)
  }
}