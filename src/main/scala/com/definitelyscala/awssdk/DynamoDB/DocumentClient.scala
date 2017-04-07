package com.definitelyscala.awssdk.DynamoDB

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("DynamoDB.DocumentClient")
class DocumentClient protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  def get(params: GetParam, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def put(params: PutParam, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def delete(params: DeleteParam, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def query(params: QueryParam, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def scan(params: ScanParam, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def update(params: UpdateParam, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def createSet(list: js.Array[js.Any], options: js.Any = js.native): js.Any = js.native
  def batchGet(params: js.Any, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def batchWrite(params: js.Any, next: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}