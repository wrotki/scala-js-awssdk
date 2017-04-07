package com.definitelyscala.awssdk.Lambda

import scala.scalajs.js

  /* new Buffer('...') || string; */
@js.native
trait UpdateFunctionConfigurationParams extends js.Object {
  var FunctionName: String = js.native
  var Description: String = js.native
  var Handler: String = js.native
  var MemorySize: Double = js.native
  var Role: String = js.native
  var Timeout: Double = js.native
  var VpcConfig: js.Any = js.native
}