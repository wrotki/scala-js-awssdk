package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait ListObjectV2Request extends ListObjectRequestBase {
  var ContinuationToken: String = js.native
  var FetchOwner: Boolean = js.native
  var StartAfter: String = js.native
}