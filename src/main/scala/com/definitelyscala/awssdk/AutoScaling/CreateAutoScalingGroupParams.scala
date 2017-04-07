package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait CreateAutoScalingGroupParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var MinSize: Double = js.native
  var MaxSize: Double = js.native
  var LaunchConfigurationName: String = js.native
  var InstanceId: String = js.native
  var DesiredCapacity: Double = js.native
  var DefaultCooldown: Double = js.native
  var AvailabilityZones: js.Array[String] = js.native
  var LoadBalancerNames: js.Array[String] = js.native
  var TargetGroupARNs: js.Array[String] = js.native
  var HealthCheckType: String = js.native
  var HealthCheckGracePeriod: Double = js.native
  var PlacementGroup: String = js.native
  var VPCZoneIdentifier: String = js.native
  var TerminationPolicies: String = js.native
  var NewInstancesProtectedFromScaleIn: Boolean = js.native
  var Tags: Tags = js.native
}