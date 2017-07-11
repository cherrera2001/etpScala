/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Core

import Energistics.Datatypes.{SupportedProtocol, Version, DataValue, ArrayOfDouble}

case class OpenSession(applicationName: String, applicationVersion: String, sessionId: String, supportedProtocols: List[SupportedProtocol], supportedObjects: List[String])