package com.definitelyscala.awssdk.sts

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait CredentialsFromParams extends js.Object {
  /**
         * Data retrieved from a call to AWS.STS.getFederatedToken, getSessionToken(), assumeRole(), or assumeRoleWithWebIdentity().
         */
  var Data: js.Any = js.native
  /**
         * An optional credentials object to fill instead of creating a new object. Useful when modifying an existing credentials object from a refresh call.
         */
  var Credentials: Credentials = js.native
}