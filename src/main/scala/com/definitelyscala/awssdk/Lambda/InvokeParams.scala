package com.definitelyscala.awssdk.Lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait InvokeParams extends js.Object {
  var FunctionName: String = js.native
  var ClientContext: String = js.native
  var InvocationType: String = js.native
  /* 'Event | RequestResponse | DryRun' */
  var LogType: String = js.native
  /* 'None | Tail' */
  var Payload: js.Any = js.native
  /* new Buffer('...') || string */
  var Qualifier: String = js.native
}