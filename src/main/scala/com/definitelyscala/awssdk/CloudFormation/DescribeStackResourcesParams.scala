package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

@js.native
trait DescribeStackResourcesParams extends js.Object {
  var StackName: String = js.native
  //  must specify either StackName or PhysicalResourceId
  var LogicalResourceId: String = js.native
  var PhysicalResourceId: String = js.native
}