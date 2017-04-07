package com.definitelyscala.awssdk.DynamoDB

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait QueryParam extends _DDBDC_Reader {
  var ConditionalOperator: String | String = js.native
  var ExclusiveStartKey: DynamoDB._DDBDC_Keys = js.native
  var ExpressionAttributeValues: DynamoDB._DDBDC_Keys = js.native
  var FilterExpression: String = js.native
  var IndexName: String = js.native
  var KeyConditionExpression: String = js.native
  var KeyConditions: DynamoDB._DDBDC_KeyComparison = js.native
  var Limit: Double = js.native
  var QueryFilter: DynamoDB._DDBDC_KeyComparison = js.native
  var ScanIndexForward: Boolean = js.native
  var Select: String | String | String | String = js.native
}