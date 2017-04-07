package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("S3")
class S3 protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def getObject(params: s3.GetObjectRequest, callback: js.Function2[Error, js.Any, Unit] = js.native): js.Dynamic = js.native
  def putObject(params: s3.PutObjectRequest, callback: js.Function2[Error, js.Any, Unit] = js.native): js.Dynamic = js.native
  def copyObject(params: s3.CopyObjectRequest, callback: js.Function2[Error, js.Any, Unit] = js.native): js.Dynamic = js.native
  def deleteObject(params: s3.DeleteObjectRequest, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
  def headObject(params: s3.HeadObjectRequest, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
  def getSignedUrl(operation: String, params: js.Any): String = js.native
  def getSignedUrl(operation: String, params: js.Any, callback: js.Function2[Error, String, Unit]): Unit = js.native
  def upload(params: s3.PutObjectRequest = js.native, options: s3.UploadOptions = js.native, callback: js.Function2[Error, js.Any, Unit] = js.native): Unit = js.native
  def listObjects(params: s3.ListObjectRequest, callback: js.Function2[Error, s3.ListObjectResponse, Unit]): Unit = js.native
  def listObjectsV2(params: s3.ListObjectV2Request, callback: js.Function2[Error, s3.ListObjectV2Response, Unit]): Unit = js.native
  def waitFor(state: String, params: s3.HeadObjectRequest, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
  def createMultipartUpload(params: js.Any, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
  def uploadPart(params: js.Any, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
  def listParts(params: js.Any, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
  def completeMultipartUpload(params: js.Any, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
}