package Energistics.Datatypes.ChannelData

import Energistics.Datatypes.DataValue
import Energistics.Datatypes.Object.DataObject

case class ChannelMetadataRecord(channelUri: String,
                                 channelId: Long,
                                 indexes: List[IndexMetadataRecord],
                                 channelName: String,
                                 dataType: String,
                                 uom: String,
                                 startIndex: Option[Long],
                                 endIndex: Option[Long],
                                 description: String,
                                 status: ChannelStatuses.Value,
                                 contentType: Option[String],
                                 source: String,
                                 measureClass: String,
                                 uuid: Option[String],
                                 customData: Map[String, DataValue],
                                 domainObject: Option[DataObject])