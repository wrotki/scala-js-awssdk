package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("SQS")
class SQSObj protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def addPermission(params: SQS.AddPermissionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def changeMessageVisibility(params: SQS.ChangeMessageVisibilityParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def changeMessageVisibilityBatch(params: SQS.ChangeMessageVisibilityBatchParams, callback: js.Function2[AwsError, SQS.ChangeMessageVisibilityBatchResponse, Unit]): Unit = js.native
  def createQueue(params: SQS.CreateQueueParams, callback: js.Function2[AwsError, SQS.CreateQueueResult, Unit]): Unit = js.native
  def deleteMessage(params: SQS.DeleteMessageParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteMessageBatch(params: SQS.DeleteMessageBatchParams, callback: js.Function2[AwsError, SQS.DeleteMessageBatchResult, Unit]): Unit = js.native
  def deleteQueue(params: js.Any, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getQueueAttributes(params: SQS.GetQueueAttributesParams, callback: js.Function2[AwsError, SQS.GetQueueAttributesResult, Unit]): Unit = js.native
  def getQueueUrl(params: SQS.GetQueueUrlParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listDeadLetterSourceQueues(params: js.Any, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listQueues(params: js.Any, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def purgeQueue(params: js.Any, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def receiveMessage(params: SQS.ReceiveMessageParams, callback: js.Function2[AwsError, SQS.ReceiveMessageResult, Unit]): Unit = js.native
  def removePermission(params: js.Any, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def sendMessage(params: SQS.SendMessageParams, callback: js.Function2[AwsError, SQS.SendMessageResult, Unit]): Unit = js.native
  def sendMessageBatch(params: SQS.SendMessageBatchParams, callback: js.Function2[AwsError, SQS.SendMessageBatchResult, Unit]): Unit = js.native
  def setQueueAttributes(params: SQS.SetQueueAttributesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
}