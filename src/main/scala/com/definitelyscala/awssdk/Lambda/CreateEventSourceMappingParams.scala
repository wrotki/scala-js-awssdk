package com.definitelyscala.awssdk.Lambda

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait CreateEventSourceMappingParams extends js.Object {
  var EventSourceArn: String = js.native
  var FunctionName: String = js.native
  var StartingPosition: String = js.native
  /* TRIM_HORIZON | LATEST */
  var BatchSize: Double = js.native
  var Enabled: Boolean = js.native
}