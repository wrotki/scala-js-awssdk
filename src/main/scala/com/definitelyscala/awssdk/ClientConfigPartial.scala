package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait ClientConfigPartial extends Services {
  var computeChecksums: Boolean = js.native
  var convertResponseTypes: Boolean = js.native
  var logger: Logger = js.native
  var maxRedirects: Double = js.native
  var maxRetries: Double = js.native
  var paramValidation: Boolean = js.native
  var s3ForcePathStyle: Boolean = js.native
  var apiVersion: js.Any = js.native
  var apiVersions: Services = js.native
  var signatureVersion: String = js.native
  var sslEnabled: Boolean = js.native
  var systemClockOffset: Double = js.native
}
