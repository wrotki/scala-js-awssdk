package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait CreateQueueParams extends js.Object {
  var QueueName: String = js.native
  var Attributes: QueueAttributes = js.native
}