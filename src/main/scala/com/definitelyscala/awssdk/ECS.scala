package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("ECS")
class ECS protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  /**
    * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in a service drops below desiredCount, Amazon ECS spawns another instantiation of the task in the specified cluster. To update an existing service, see UpdateService.
    */
  def createService(params: ecs.CreateServicesParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Describes one or more of your clusters.
     */
  def describeClusters(params: ecs.DescribeClustersParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Describes the specified services running in your cluster.
     */
  def describeServices(params: ecs.DescribeServicesParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Describes a specified task or tasks.
     */
  def describeTasks(params: ecs.DescribeTasksParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Describes a task definition. You can specify a family and revision to find information about a specific task definition, or you can simply specify the family to find the latest ACTIVE revision in that family.
     */
  def describeTaskDefinition(params: ecs.DescribeTaskDefinitionParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Registers a new task definition from the supplied family and containerDefinitions. Optionally, you can add data volumes to your containers with the volumes parameter. For more information about task definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon EC2 Container Service Developer Guide.
     */
  def registerTaskDefinition(params: ecs.RegisterTaskDefinitionParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  /**
     * Modifies the desired count, deployment configuration, or task definition used in a service.
     */
  def updateService(params: ecs.UpdateServiceParams, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}