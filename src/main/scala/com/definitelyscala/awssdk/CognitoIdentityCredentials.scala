package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("CognitoIdentityCredentials")
class CognitoIdentityCredentials protected () extends Credentials {
  def this(params: CognitoIdentity.CognitoIdentityCredentialsParams) = this()
}