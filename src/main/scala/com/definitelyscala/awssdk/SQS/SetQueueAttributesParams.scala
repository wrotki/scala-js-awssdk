package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait SetQueueAttributesParams extends js.Object {
  var QueueUrl: String = js.native
  var Attributes: QueueAttributes = js.native
}