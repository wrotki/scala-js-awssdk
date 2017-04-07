package com.definitelyscala.awssdk.Lambda

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait ListEventSourceMappingsParams extends js.Object {
  var EventSourceArn: String = js.native
  var FunctionName: String = js.native
  var Marker: String = js.native
  var MaxItems: Double = js.native
}