package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js
import scala.scalajs.js.|

  //  SUCCESS | FAILURE
@js.native
trait UpdateStackParams extends js.Object {
  var StackName: String = js.native
  var TemplateBody: String = js.native
  //  specify either TemplateBody or TemplateURL, not both
  var TemplateURL: String = js.native
  //  specify either TemplateBody or TemplateURL, not both
  var UsePreviousTemplate: Boolean = js.native
  var StackPolicyDuringUpdateBody: String = js.native
  //  cannot set both StackPolicyDuringUpdateBody and StackPolicyDuringUpdateURL
  var StackPolicyDuringUpdateURL: String = js.native
  //  cannot set both StackPolicyDuringUpdateBody and StackPolicyDuringUpdateURL
  var Parameters: js.Array[Parameter] = js.native
  var Capabilities: js.Array[String] = js.native
  //  CAPABILITY_IAM | CAPABILITY_NAMED_IAM
  var ResourceTypes: js.Array[String] = js.native
  var StackPolicyBody: String = js.native
  //  cannot set both StackPolicyBody and StackPolicyURL
  var StackPolicyURL: String = js.native
  //  cannot set both StackPolicyBody and StackPolicyURL
  var NotificationARNs: js.Array[String] = js.native
  var Tags: js.Array[Tag] = js.native
}