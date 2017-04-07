package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait GetObjectRequest extends js.Object {
  var Bucket: String = js.native
  var IfMatch: String = js.native
  var IfModifiedSince: js.Any = js.native
  var IfNoneMatch: String = js.native
  var IfUnmodifiedSince: js.Any = js.native
  var Key: String = js.native
  var Range: String = js.native
  var ResponseCacheControl: String = js.native
  var ResponseContentDisposition: String = js.native
  var ResponseContentEncoding: String = js.native
  var ResponseContentLanguage: String = js.native
  var ResponseContentType: String = js.native
  var ResponseExpires: js.Any = js.native
  var VersionId: String = js.native
}