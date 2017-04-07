package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait CreateLaunchConfigurationParams extends js.Object {
  var LaunchConfigurationName: String = js.native
  var AssociatePublicIpAddress: Boolean = js.native
  var ImageId: String = js.native
  var KeyName: String = js.native
  var SecurityGroups: js.Array[String] = js.native
  var ClassicLinkVPCId: String = js.native
  var ClassicLinkVPCSecurityGroups: js.Array[String] = js.native
  var UserData: String = js.native
  var InstanceId: String = js.native
  var InstanceType: String = js.native
  var KernelId: String = js.native
  var RamdiskId: String = js.native
  var BlockDeviceMappings: js.Array[BlockDeviceMapping] = js.native
  var InstanceMonitoring: InstanceMonitoring = js.native
  var SpotPrice: String = js.native
  var IamInstanceProfile: String = js.native
  var EbsOptimized: Boolean = js.native
  var PlacementTenancy: String = js.native
}