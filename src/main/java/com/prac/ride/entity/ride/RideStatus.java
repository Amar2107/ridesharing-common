/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.prac.ride.entity.ride;
@org.apache.avro.specific.AvroGenerated
public enum RideStatus implements org.apache.avro.generic.GenericEnumSymbol<RideStatus> {
  REQUESTED, ASSIGNED, ACCEPTED, IN_PROGRESS, COMPLETED, CANCELED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"RideStatus\",\"namespace\":\"com.prac.ride.entity.ride\",\"symbols\":[\"REQUESTED\",\"ASSIGNED\",\"ACCEPTED\",\"IN_PROGRESS\",\"COMPLETED\",\"CANCELED\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
