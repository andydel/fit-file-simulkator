/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.agd.fitfile.avro;

@org.apache.avro.specific.AvroGenerated
public interface FitSampleProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"FitSampleProtocol\",\"namespace\":\"org.agd.fitfile.avro\",\"types\":[{\"type\":\"record\",\"name\":\"FitSample\",\"fields\":[{\"name\":\"power\",\"type\":\"long\"},{\"name\":\"distance\",\"type\":\"double\"},{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"position_lat\",\"type\":\"double\"},{\"name\":\"position_long\",\"type\":\"double\"},{\"name\":\"altitude\",\"type\":\"double\"},{\"name\":\"cadence\",\"type\":\"long\"},{\"name\":\"grade\",\"type\":\"double\"},{\"name\":\"heartRate\",\"type\":\"long\"},{\"name\":\"timestamp\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends FitSampleProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = org.agd.fitfile.avro.FitSampleProtocol.PROTOCOL;
  }
}