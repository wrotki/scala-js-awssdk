package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CreateStackParams extends js.Object {
  var StackName: String = js.native
  var TemplateBody: String = js.native
  //  specify either TemplateBody or TemplateURL
  var TemplateURL: String = js.native
  //  specify either TemplateBody or TemplateURL
  var Parameters: js.Array[Parameter] = js.native
  var DisableRollback: Boolean = js.native
  //  cannot specify both DisableRollback and OnFailure
  var TimeoutInMinutes: Double = js.native
  var NotificationARNs: js.Array[String] = js.native
  var Capabilities: js.Array[String] = js.native
  var ResourceTypes: js.Array[String] = js.native
  var OnFailure: js.Array[String] = js.native
  //  cannot specify both DisableRollback and OnFailure
  //  DO_NOTHING | ROLLBACK | DELETE
  var StackPolicyBody: String = js.native
  //  cannot specify both StackPolicyBody and StackPolicyURL
  var StackPolicyURL: String = js.native
  //  cannot specify both StackPolicyBody and StackPolicyURL
  var Tags: js.Array[Tag] = js.native
}