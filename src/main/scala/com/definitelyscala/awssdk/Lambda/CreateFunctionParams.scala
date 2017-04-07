package com.definitelyscala.awssdk.Lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CreateFunctionParams extends js.Object {
  var Code: js.Any = js.native
  var FunctionName: String = js.native
  var Handler: String = js.native
  var Role: String = js.native
  var Runtime: String = js.native
  /* 'nodejs | java8 | python2.7', */
  var Description: String = js.native
  var MemorySize: Double = js.native
  var Publish: Boolean = js.native
  var Timeout: Double = js.native
  var VpcConfig: js.Any = js.native
}