package com.definitelyscala.awssdk.DynamoDB

import scala.scalajs.js

@js.native
trait ScanParam extends QueryParam {
  var Segment: Double = js.native
  var ScanFilter: DynamoDB._DDBDC_KeyComparison = js.native
  var TotalSegments: Double = js.native
}