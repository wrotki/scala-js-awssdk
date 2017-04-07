package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait ClientConfig extends ClientConfigPartial {
  var update: js.Function2[ClientConfigPartial, Boolean, Unit] = js.native
  var getCredentials: js.Function1[js.Function1[js.Any, Unit], Unit] = js.native
  var loadFromPath: js.Function1[String, Unit] = js.native
}