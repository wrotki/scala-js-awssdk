package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

@js.native
trait Options extends js.Object {
  var params: js.Any = js.native
  var endpoint: String = js.native
  var accessKeyId: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: js.Any = js.native
  var credentials: js.Any = js.native
  var credentialProvider: js.Any = js.native
  var region: String = js.native
  var maxRetries: Double = js.native
  var maxRedirects: Double = js.native
  var sslEnabled: Boolean = js.native
  var paramValidation: js.Any = js.native
  var computeChecksums: Boolean = js.native
  var convertResponseTypes: Boolean = js.native
  var correctClockSkew: Boolean = js.native
  var s3ForcePathStyle: Boolean = js.native
  var s3BucketEndpoint: Boolean = js.native
  var s3DisableBodySigning: Boolean = js.native
  var retryDelayOptions: js.Any = js.native
  var httpOptions: js.Any = js.native
  var apiVersion: js.Any = js.native
  var apiVersions: js.Any = js.native
  var logger: js.Any = js.native
  var systemClockOffset: Double = js.native
  var signatureVersion: String = js.native
  var signatureCache: Boolean = js.native
}