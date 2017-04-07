package com.definitelyscala.awssdk.DynamoDB

import scala.scalajs.js

@js.native
trait UpdateParam extends _DDBDC_Writer {
  var Key: DynamoDB._DDBDC_Keys = js.native
  var UpdateExpression: String = js.native
  var AttributeUpdates: js.Dictionary[js.Any] = js.native
}