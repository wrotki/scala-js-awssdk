package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

@js.native
trait ValidateTemplateParams extends js.Object {
  var TemplateBody: String = js.native
  //  must pass either TemplateBody or TemplateURL
  //  if both are specified, only TemplateBody is used
  var TemplateURL: String = js.native
}