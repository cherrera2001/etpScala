/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Core

import Energistics.Datatypes.{SupportedProtocol, Version, DataValue, ArrayOfDouble}

case class RequestSession(applicationName: String, applicationVersion: String, requestedProtocols: List[SupportedProtocol], supportedObjects: List[String])