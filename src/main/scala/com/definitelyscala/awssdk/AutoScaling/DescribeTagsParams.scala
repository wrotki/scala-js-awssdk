package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait DescribeTagsParams extends js.Object {
  var Filters: js.Array[Filter] = js.native
  var NextToken: String = js.native
  var MaxRecords: Double = js.native
}