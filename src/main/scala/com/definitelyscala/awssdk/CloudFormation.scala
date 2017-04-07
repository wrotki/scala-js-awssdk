package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("CloudFormation")
class CloudFormationObj protected () extends js.Object {
  def this(options: CloudFormation.Options = js.native) = this()
  var endpoint: Endpoint = js.native
  def cancelUpdateStack(params: CloudFormation.CancelUpdateStackParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def continueUpdateRollback(params: CloudFormation.ContinueUpdateRollbackParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createChangeSet(params: CloudFormation.CreateChangeSetParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createStack(params: CloudFormation.CreateStackParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteChangeSet(params: CloudFormation.DeleteChangeSetParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteStack(params: CloudFormation.DeleteStackParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeAccountLimits(params: CloudFormation.DescribeAccountLimitsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeChangeSet(params: CloudFormation.DescribeChangeSetParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeStackEvents(params: CloudFormation.DescribeStackEventsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeStackResource(params: CloudFormation.DescribeStackResourceParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeStackResources(params: CloudFormation.DescribeStackResourcesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def describeStacks(params: CloudFormation.DescribeStacksParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def estimateTemplateCost(params: CloudFormation.EstimateTemplateCostParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def executeChangeSet(params: CloudFormation.ExecuteChangeSetParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getStackPolicy(params: CloudFormation.GetStackPolicyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getTemplate(params: CloudFormation.GetTemplateParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getTemplateSummary(params: CloudFormation.GetTemplateSummaryParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listChangeSets(params: CloudFormation.ListChangeSetsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listStackResources(params: CloudFormation.ListStackResourcesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listStacks(params: CloudFormation.ListStacksParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def setStackPolicy(params: CloudFormation.SetStackPolicyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def signalResource(params: CloudFormation.SignalResourceParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def updateStack(params: CloudFormation.UpdateStackParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def validateTemplate(params: CloudFormation.ValidateTemplateParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def waitFor(state: String, params: CloudFormation.WaitForParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
}