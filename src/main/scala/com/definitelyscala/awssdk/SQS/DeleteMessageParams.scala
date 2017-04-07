package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait DeleteMessageParams extends js.Object {
  var QueueUrl: String = js.native
  var ReceiptHandle: String = js.native
}