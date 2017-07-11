/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.DataArray

import Energistics.Datatypes.{AnyArray, ArrayOfBoolean, ArrayOfInt, ArrayOfLong, ArrayOfFloat, ArrayOfDouble}

case class PutDataArraySlice(uri: String, data: AnyArray, dimensions: List[Long], start: List[Long], count: List[Long])