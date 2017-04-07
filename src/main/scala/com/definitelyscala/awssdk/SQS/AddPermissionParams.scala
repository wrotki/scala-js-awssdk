package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait AddPermissionParams extends js.Object {
  var QueueUrl: String = js.native
  var Label: String = js.native
  var AWSAccountIds: js.Array[String] = js.native
  var Actions: js.Array[String] = js.native
}