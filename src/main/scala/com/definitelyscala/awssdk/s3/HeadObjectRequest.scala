package com.definitelyscala.awssdk.s3

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.Date

@js.native
trait HeadObjectRequest extends js.Object {
  var Bucket: String = js.native
  var Key: String = js.native
  var IfMatch: String = js.native
  var IfModifiedSince: Date = js.native
  var IfNoneMatch: String = js.native
  var IfUnmodifiedSince: Date = js.native
  var Range: String = js.native
  var RequestPayer: String = js.native
  var SSECustomerAlgorithm: String = js.native
  var SSECustomerKey: Array[_] | String = js.native
  var SSECustomerKeyMD5: String = js.native
  var VersionId: String = js.native
}