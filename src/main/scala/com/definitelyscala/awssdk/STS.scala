package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("STS")
class STS protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  /**
     * Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a security token) that you can use to access AWS resources that you might not normally have access to.
     */
  def assumeRole(params: sts.AssumeRoleParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Returns a set of temporary security credentials for users who have been authenticated via a SAML authentication response.
     */
  def assumeRoleWithSAML(params: sts.AssumeRoleWithSAMLParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Returns a set of temporary security credentials for users who have been authenticated in a mobile or web application with a web identity provider, such as Amazon Cognito, Login with Amazon, Facebook, Google, or any OpenID Connect-compatible identity provider.
     */
  def assumeRoleWithWebIdentity(params: sts.AssumeRoleWithWebIdentityParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Creates a credentials object from STS response data containing credentials information.
     */
  def credentialsFrom(params: sts.CredentialsFromParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Decodes additional information about the authorization status of a request from an encoded message returned in response to an AWS request.
     */
  def decodeAuthorizationMessage(params: sts.DecodeAuthorizationMessageParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Returns details about the IAM identity whose credentials are used to call the API.
     */
  def getCallerIdentity(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a security token) for a federated user.
     */
  def getFederationToken(params: sts.GetFederationTokenParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Returns a set of temporary credentials for an AWS account or IAM user.
     */
  def getSessionToken(params: sts.GetSessionTokenParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}