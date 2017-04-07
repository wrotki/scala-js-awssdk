package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait QueueAttributes extends js.Object {
  @js.annotation.JSBracketAccess
  def apply(name: String): js.Any = js.native
  @js.annotation.JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native
  var DelaySeconds: Double = js.native
  var MaximumMessageSize: Double = js.native
  var MessageRetentionPeriod: Double = js.native
  var Policy: js.Any = js.native
  var ReceiveMessageWaitTimeSeconds: Double = js.native
  var VisibilityTimeout: Double = js.native
  var RedrivePolicy: js.Any = js.native
}