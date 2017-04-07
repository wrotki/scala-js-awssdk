package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait UpdateAutoScalingGroupParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var LaunchConfigurationName: String = js.native
  var MinSize: Double = js.native
  var MaxSize: Double = js.native
  var DesiredCapacity: Double = js.native
  var DefaultCooldown: Double = js.native
  var AvailabilityZones: js.Array[String] = js.native
  var HealthCheckType: String = js.native
  var HealthCheckGracePeriod: Double = js.native
  var PlacementGroup: String = js.native
  var VPCZoneIdentifier: String = js.native
  var TerminationPolicies: js.Array[String] = js.native
  var NewInstancesProtectedFromScaleIn: Boolean = js.native
}