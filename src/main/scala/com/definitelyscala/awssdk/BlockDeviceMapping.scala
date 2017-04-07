package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait BlockDeviceMapping extends js.Object {
  var VirtualName: String = js.native
  var DeviceName: String = js.native
  var Ebs: Ebs = js.native
  var NoDevice: Boolean = js.native
}