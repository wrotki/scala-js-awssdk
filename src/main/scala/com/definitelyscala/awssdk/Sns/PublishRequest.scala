package com.definitelyscala.awssdk.Sns

import scala.scalajs.js

@js.native
trait PublishRequest extends js.Object {
  var TopicArn: String = js.native
  var TargetArn: String = js.native
  var MessageAttributes: js.Dictionary[MessageAttribute] = js.native
  var Message: String = js.native
  var MessageStructure: String = js.native
  var Subject: String = js.native
}