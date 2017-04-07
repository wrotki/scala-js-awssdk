package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("DynamoDB")
class DynamoDBObj protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def createTable(params: js.Any, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def deleteTable(params: js.Any, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}