package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CreateChangeSetParams extends js.Object {
  var StackName: String = js.native
  var TemplateBody: String = js.native
  //  specify either TemplateBody or TemplateURL
  var TemplateURL: String = js.native
  //  specify either TemplateBody or TemplateURL
  var UsePreviousTemplate: Boolean = js.native
  var Parameters: js.Array[Parameter] = js.native
  var Capabilities: js.Array[String] = js.native
  //  CAPABILITY_IAM | CAPABILITY_NAMED_IAM
  var ResourceTypes: js.Array[String] = js.native
  var NotificationARNs: js.Array[String] = js.native
  var Tags: js.Array[Tag] = js.native
  var ChangeSetName: String = js.native
  var ClientToken: String = js.native
  var Description: String = js.native
}