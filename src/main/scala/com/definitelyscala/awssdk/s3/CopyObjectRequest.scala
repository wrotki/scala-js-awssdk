package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait CopyObjectRequest extends js.Object {
  var Bucket: String = js.native
  var CopySource: String = js.native
  var Key: String = js.native
  var ACL: String = js.native
  var CacheControl: String = js.native
  var ContentDisposition: String = js.native
  var ContentEncoding: String = js.native
  var ContentLanguage: String = js.native
  var ContentType: String = js.native
  var CopySourceIfMatch: String = js.native
  var CopySourceIfModifiedSince: js.Any = js.native
  var CopySourceIfNoneMatch: String = js.native
  var CopySourceIfUnmodifiedSince: js.Any = js.native
  var CopySourceSSECustomerAlgorithm: String = js.native
  var CopySourceSSECustomerKey: js.Any = js.native
  var CopySourceSSECustomerKeyMD5: String = js.native
  var Expires: js.Any = js.native
  var GrantFullControl: String = js.native
  var GrantRead: String = js.native
  var GrantReadACP: String = js.native
  var GrantWriteACP: String = js.native
  var Metadata: js.Dictionary[String] = js.native
  var MetadataDirective: String = js.native
  var RequestPayer: String = js.native
  var SSECustomerAlgorithm: String = js.native
  var SSECustomerKey: js.Any = js.native
  var SSECustomerKeyMD5: String = js.native
  var SSEKMSKeyId: String = js.native
  var ServerSideEncryption: String = js.native
  var StorageClass: String = js.native
  var WebsiteRedirectLocation: String = js.native
}