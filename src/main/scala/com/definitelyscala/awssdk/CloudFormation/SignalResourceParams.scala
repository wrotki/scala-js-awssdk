package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

  //  cannot set both StackPolicyBody and StackPolicyURL
@js.native
trait SignalResourceParams extends js.Object {
  var StackName: String = js.native
  var LogicalResourceId: String = js.native
  var UniqueId: String = js.native
  var Status: String = js.native
}