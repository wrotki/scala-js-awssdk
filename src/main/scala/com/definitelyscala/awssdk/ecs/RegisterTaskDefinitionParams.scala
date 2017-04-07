package com.definitelyscala.awssdk.ecs

import scala.scalajs.js

@js.native
trait RegisterTaskDefinitionParams extends js.Object {
  var containerDefinitions: js.Array[js.Any] = js.native
  var family: String = js.native
  var volumes: js.Array[js.Any] = js.native
}