package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("AutoScaling")
class AutoScalingObj protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def attachInstances(params: AutoScaling.AttachInstancesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def attachLoadBalancers(params: AutoScaling.AttachLoadBalancersParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def attachLoadBalancerTargetGroups(param: AutoScaling.AttachLoadBalancerTargetGroupsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def completeLifecycleAction(param: AutoScaling.CompleteLifecycleActionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createAutoScalingGroup(param: AutoScaling.CreateAutoScalingGroupParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createLaunchConfiguration(param: AutoScaling.CreateLaunchConfigurationParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createOrUpdateTags(param: AutoScaling.CreateOrUpdateTagsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteAutoScalingGroup(param: AutoScaling.DeleteAutoScalingGroupParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteLaunchConfiguration(param: AutoScaling.DeleteLaunchConfigurationParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteLifecycleHook(param: AutoScaling.DeleteLifecycleHookParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteNotificationConfiguration(param: AutoScaling.DeleteNotificationConfigurationParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deletePolicy(param: AutoScaling.DeletePolicyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteScheduledAction(param: AutoScaling.DeleteScheduledActionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteTags(param: AutoScaling.DeleteTagsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeAccountLimits(callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeAdjustmentTypes(callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeAutoScalingGroups(param: AutoScaling.DescribeAutoScalingGroupsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeAutoScalingInstances(param: AutoScaling.DescribeAutoScalingInstancesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeAutoScalingNotificationTypes(callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeLaunchConfigurations(param: AutoScaling.DescribeLaunchConfigurationsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeLifecycleHooks(param: AutoScaling.DescribeLifecycleHooksParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeLifecycleHookTypes(callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeLoadBalancers(param: AutoScaling.DescribeLoadBalancersParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeLoadBalancerTargetGroups(param: AutoScaling.DescribeLoadBalancerTargetGroupsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeMetricCollectionTypes(callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeNotificationConfigurations(param: AutoScaling.DescribeNotificationConfigurationsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describePolicies(param: AutoScaling.DescribePoliciesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeScalingActivities(param: AutoScaling.DescribeScalingActivitiesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeScalingProcessTypes(callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeScheduledActions(param: AutoScaling.DescribeScheduledActionsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeTags(param: AutoScaling.DescribeTagsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeTerminationPolicyTypes(callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def detachInstances(param: AutoScaling.DetachInstancesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def detachLoadBalancers(param: AutoScaling.DetachLoadBalancersParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def detachLoadBalancerTargetGroups(param: AutoScaling.DetachLoadBalancerTargetGroupsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def disableMetricsCollection(param: AutoScaling.DisableMetricsCollectionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def enableMetricsCollection(param: AutoScaling.EnableMetricsCollectionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def enterStandby(param: AutoScaling.EnterStandbyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def executePolicy(param: AutoScaling.ExecutePolicyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def exitStandby(param: AutoScaling.ExitStandbyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def putLifecycleHook(param: AutoScaling.PutLifecycleHookParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def putNotificationConfiguration(param: AutoScaling.PutNotificationConfigurationParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def putScalingPolicy(param: AutoScaling.PutScalingPolicyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def putScheduledUpdateGroupAction(param: AutoScaling.PutScheduledUpdateGroupActionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def recordLifecycleActionHeartbeat(params: AutoScaling.RecordLifecycleActionHeartbeatParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def resumeProcesses(params: AutoScaling.ResumeProcessesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def setDesiredCapacity(params: AutoScaling.SetDesiredCapacityParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def setInstanceHealth(params: AutoScaling.SetInstanceHealthParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def setInstanceProtection(params: AutoScaling.SetInstanceProtectionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def suspendProcesses(params: AutoScaling.SuspendProcessesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def terminateInstanceInAutoScalingGroup(params: AutoScaling.TerminateInstanceInAutoScalingGroupParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def updateAutoScalingGroup(params: AutoScaling.UpdateAutoScalingGroupParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
}