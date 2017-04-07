package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

@js.native
trait GetTemplateSummaryParams extends js.Object {
  //  must specify one of the three
  var TemplateBody: String = js.native
  var TemplateURL: String = js.native
  var StackName: String = js.native
}