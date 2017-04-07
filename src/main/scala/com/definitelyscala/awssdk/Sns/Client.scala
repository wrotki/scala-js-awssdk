package com.definitelyscala.awssdk.Sns

import scala.scalajs.js

@js.native
trait Client extends js.Object {
  var config: com.definitelyscala.awssdk.ClientConfig = js.native
  def publish(params: PublishRequest, callback: js.Function2[js.Any, PublishResult, Unit]): Unit = js.native
  def createTopic(params: CreateTopicRequest, callback: js.Function2[js.Any, CreateTopicResult, Unit]): Unit = js.native
  def deleteTopic(params: DeleteTopicRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}