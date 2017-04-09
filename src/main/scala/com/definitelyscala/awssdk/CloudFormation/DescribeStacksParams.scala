package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

//  must specify either StackName or PhysicalResourceId
@js.native
trait DescribeStacksParams extends js.Object {
  var StackName: String = js.native
  var NextToken: String = js.native
}