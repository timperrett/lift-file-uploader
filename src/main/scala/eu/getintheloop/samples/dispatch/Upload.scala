package eu.getintheloop.samples.dispatch

import net.liftweb.http.JsonResponse
import net.liftweb.http.rest.RestHelper
import net.liftweb.json.JsonAST.{JObject,JField,JBool}

object Upload extends RestHelper {
  serve {
    case "upload" :: Nil Post req => {
      println(req.body.map(_.length))
      JsonResponse(JObject(JField("success", JBool(true)) :: Nil))
    }
  }
}
