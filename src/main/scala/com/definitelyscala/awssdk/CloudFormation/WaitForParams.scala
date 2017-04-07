package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

  //  must pass either TemplateBody or TemplateURL
@js.native
trait WaitForParams extends js.Object {
  var StackName: String = js.native
  var NextToken: String = js.native
}