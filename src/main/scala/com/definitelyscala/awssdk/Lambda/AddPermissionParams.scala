package com.definitelyscala.awssdk.Lambda

import scala.scalajs.js

@js.native
trait AddPermissionParams extends js.Object {
  var Action: String = js.native
  var FunctionName: String = js.native
  var Principal: String = js.native
  var StatementId: String = js.native
  var Qualifier: String = js.native
  var SourceAccount: String = js.native
  var SourceArn: String = js.native
}