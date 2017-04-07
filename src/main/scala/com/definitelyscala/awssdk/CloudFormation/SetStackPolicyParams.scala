package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

@js.native
trait SetStackPolicyParams extends js.Object {
  var StackName: String = js.native
  var StackPolicyBody: String = js.native
  //  cannot set both StackPolicyBody and StackPolicyURL
  var StackPolicyURL: String = js.native
}