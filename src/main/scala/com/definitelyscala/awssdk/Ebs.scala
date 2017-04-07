package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait Ebs extends js.Object {
  var SnapshotId: String = js.native
  var VolumeSize: Double = js.native
  var VolumeType: String = js.native
  var DeleteOnTermination: Boolean = js.native
  var Iops: Double = js.native
  var Encrypted: Boolean = js.native
}