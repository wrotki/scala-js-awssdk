package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait GetQueueAttributesParams extends js.Object {
  var QueueUrl: String = js.native
  var AttributeNames: js.Array[String] = js.native
}