package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

@js.native
trait ListStacksParams extends js.Object {
  var NextToken: String = js.native
  var StackStatusFilter: js.Array[String] = js.native
}