/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import Energistics.Datatypes.{DataValue, ArrayOfDouble, DataAttribute}

import Energistics.Datatypes.ChannelData.DataItem

case class ChannelDataChange(channelId: Long, startIndex: Long, endIndex: Long, data: List[DataItem])