package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait ReceiveMessageParams extends js.Object {
  var QueueUrl: String = js.native
  var MaxNumberOfMessages: Double = js.native
  var VisibilityTimeout: Double = js.native
  var AttributeNames: js.Array[String] = js.native
  var MessageAttributeNames: js.Array[String] = js.native
  var WaitTimeSeconds: Double = js.native
}