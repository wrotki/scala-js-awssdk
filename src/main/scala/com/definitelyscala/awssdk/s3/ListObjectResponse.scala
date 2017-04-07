package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait ListObjectResponse extends ListObjectResponseBase {
  var Marker: String = js.native
  var NextMarker: String = js.native
}