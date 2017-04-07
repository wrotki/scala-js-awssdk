package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait ChangeMessageVisibilityParams extends js.Object {
  var QueueUrl: String = js.native
  var ReceiptHandle: String = js.native
  var VisibilityTimeout: Double = js.native
}