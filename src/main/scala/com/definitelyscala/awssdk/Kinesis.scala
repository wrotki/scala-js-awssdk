package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("Kinesis")
class Kinesis protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def putRecord(params: KINESIS.PutRecordParams, callback: js.Function2[Error, KINESIS.PutRecordResult, Unit]): Unit = js.native
  def putRecords(params: KINESIS.PutRecordsParams, callback: js.Function2[Error, KINESIS.PutRecordsResult, Unit]): Unit = js.native
  def increaseStreamRetentionPeriod(params: KINESIS.IncreaseStreamRetentionPeriodParams, callback: js.Function2[Error, js.Any, Unit]): Unit = js.native
}