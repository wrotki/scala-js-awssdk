package com.definitelyscala.awssdk.CloudFormation

import scala.scalajs.js

@js.native
trait EstimateTemplateCostParams extends js.Object {
  var TemplateBody: String = js.native
  //  must specify either TemplateBody or TemplateURL
  //  if both are passed, only TemplateBody is used
  var TemplateURL: String = js.native
  //  must specify either TemplateBody or TemplateURL
  var Parameters: js.Array[Parameter] = js.native
}