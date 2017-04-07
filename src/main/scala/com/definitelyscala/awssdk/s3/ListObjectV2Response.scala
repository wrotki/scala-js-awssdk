package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait ListObjectV2Response extends ListObjectResponseBase {
  var KeyCount: Double = js.native
  var ContinuationToken: String = js.native
  var NextContinuationToken: String = js.native
  var StartAfter: String = js.native
}