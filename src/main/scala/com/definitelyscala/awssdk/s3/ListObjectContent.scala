package com.definitelyscala.awssdk.s3

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.Date

@js.native
trait ListObjectContent extends js.Object {
  var Key: String = js.native
  var LastModified: Date = js.native
  var ETag: String = js.native
  var Size: Double = js.native
  var StorageClass: String | String | String = js.native
  var Owner: Owner = js.native
}