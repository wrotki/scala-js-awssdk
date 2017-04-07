package com.definitelyscala.awssdk.CognitoIdentity

import scala.scalajs.js

@js.native
trait CognitoIdentityCredentialsParams extends js.Object {
  var IdentityPoolId: String = js.native
  var AccountId: String = js.native
  var Logins: js.Dictionary[js.Any] = js.native
  var RoleArn: String = js.native
  var RoleSessionName: String = js.native
  var WebIdentityToken: String = js.native
  var ProviderId: String = js.native
  var Policy: String = js.native
  var DurationSeconds: Double = js.native
  var IdentityId: String = js.native
}