package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("Lambda")
class LambdaObj protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def addPermission(params: Lambda.AddPermissionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createAlias(params: Lambda.CreateAliasParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createEventSourceMapping(params: Lambda.CreateEventSourceMappingParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def createFunction(params: Lambda.CreateFunctionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteAlias(params: Lambda.DeleteAliasParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteEventSourceMapping(params: Lambda.DeleteEventSourceMappingParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def deleteFunction(params: Lambda.DeleteFunctionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getAlias(params: Lambda.GetAliasParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getEventSourceMapping(params: Lambda.GetEventSourceMappingParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getFunction(params: Lambda.GetFunctionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getFunctionConfiguration(params: Lambda.GetFunctionConfigurationParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def getPolicy(params: Lambda.GetPolicyParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def invoke(params: Lambda.InvokeParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listAliases(params: Lambda.ListAliasesParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listEventSourceMappings(params: Lambda.ListEventSourceMappingsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listFunctions(params: Lambda.ListFunctionsParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def listVersionsByFunction(params: Lambda.ListVersionsByFunctionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def publishVersion(params: Lambda.PublishVersionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def removePermission(params: Lambda.RemovePermissionParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def updateAlias(params: Lambda.UpdateAliasParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def updateEventSourceMapping(params: Lambda.UpdateEventSourceMappingParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def updateFunctionCode(params: Lambda.UpdateFunctionCodeParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
  def updateFunctionConfiguration(params: Lambda.UpdateFunctionConfigurationParams, callback: js.Function2[AwsError, js.Any, Unit]): Unit = js.native
}