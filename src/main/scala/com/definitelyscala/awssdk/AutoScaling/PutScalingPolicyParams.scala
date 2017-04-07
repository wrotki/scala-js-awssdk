package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait PutScalingPolicyParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var AdjustmentType: String = js.native
  var PolicyName: String = js.native
  var PolicyType: String = js.native
  var MinAdjustmentStep: Double = js.native
  var MinAdjustmentMagnitude: Double = js.native
  var ScalingAdjustment: Double = js.native
  var Cooldown: Double = js.native
  var MetricAggregationType: String = js.native
  var StepAdjustments: js.Array[StepAdjustment] = js.native
  var EstimatedInstanceWarmup: Double = js.native
}