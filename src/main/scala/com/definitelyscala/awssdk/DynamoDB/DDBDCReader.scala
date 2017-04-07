package com.definitelyscala.awssdk.DynamoDB

import scala.scalajs.js

@js.native
trait _DDBDC_Reader extends _DDBDC_Generic {
  var ConsistentRead: Boolean = js.native
  var ProjectionExpression: String = js.native
  var AttributesToGet: js.Array[String] = js.native
}