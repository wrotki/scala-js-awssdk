package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait PutObjectRequest extends js.Object {
  var ACL: String = js.native
  var Body: js.Any = js.native
  var Bucket: String = js.native
  var CacheControl: String = js.native
  var ContentDisposition: String = js.native
  var ContentEncoding: String = js.native
  var ContentLanguage: String = js.native
  var ContentLength: String = js.native
  var ContentMD5: String = js.native
  var ContentType: String = js.native
  var Expires: js.Any = js.native
  var GrantFullControl: String = js.native
  var GrantRead: String = js.native
  var GrantReadACP: String = js.native
  var GrantWriteACP: String = js.native
  var Key: String = js.native
  var Metadata: js.Dictionary[String] = js.native
  var ServerSideEncryption: String = js.native
  var StorageClass: String = js.native
  var WebsiteRedirectLocation: String = js.native
}