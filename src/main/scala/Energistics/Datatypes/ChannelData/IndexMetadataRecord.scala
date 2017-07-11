/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.ChannelData

import Energistics.Datatypes.{DataValue, ArrayOfDouble}

case class IndexMetadataRecord(indexType: ChannelIndexTypes.Value, uom: String, depthDatum: Option[String], direction: IndexDirections.Value, mnemonic: Option[String], description: Option[String], uri: Option[String], customData: Map[String, DataValue], scale: Int, timeDatum: Option[String])