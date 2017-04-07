package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait AutoScalingOptions extends js.Object {
  var params: js.Any = js.native
  var endpoint: String = js.native
  var accessKeyId: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: Credentials = js.native
  var credentials: Credentials = js.native
  var credentialProvider: js.Any = js.native
  var region: String = js.native
  var maxRetries: Double = js.native
  var maxRedirects: Double = js.native
  var sslEnabled: Boolean = js.native
  var paramValidation: Boolean = js.native
  var computeChecksums: Boolean = js.native
  var convertResponseTypes: Boolean = js.native
  var correctClockSkew: Boolean = js.native
  var s3ForcePathStyle: Boolean = js.native
  var s3BucketEndpoint: Boolean = js.native
  var s3DisableBodySigning: Boolean = js.native
  var retryDelayOptions: RetryDelayOption = js.native
  var httpOptions: HttpOptions = js.native
  var apiVersion: String = js.native
  var apiVersions: js.Dictionary[String] = js.native
  var logger: Logger = js.native
  var systemClockOffset: Double = js.native
  var signatureVersion: String = js.native
  var signatureCache: Boolean = js.native
}