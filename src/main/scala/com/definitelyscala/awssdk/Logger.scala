package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait Logger extends js.Object {
  var write: js.Function3[js.Any, String, js.Function0[Unit], Unit] = js.native
  var log: js.Function = js.native
}