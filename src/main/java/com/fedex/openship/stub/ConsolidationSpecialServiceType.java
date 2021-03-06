/**
 * ConsolidationSpecialServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConsolidationSpecialServiceType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConsolidationSpecialServiceType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BROKER_SELECT_OPTION = "BROKER_SELECT_OPTION";
    public static final String _PRIORITY_ALERT = "PRIORITY_ALERT";
    public static final String _SATURDAY_PICKUP = "SATURDAY_PICKUP";
    public static final ConsolidationSpecialServiceType BROKER_SELECT_OPTION = new ConsolidationSpecialServiceType(_BROKER_SELECT_OPTION);
    public static final ConsolidationSpecialServiceType PRIORITY_ALERT = new ConsolidationSpecialServiceType(_PRIORITY_ALERT);
    public static final ConsolidationSpecialServiceType SATURDAY_PICKUP = new ConsolidationSpecialServiceType(_SATURDAY_PICKUP);
    public String getValue() { return _value_;}
    public static ConsolidationSpecialServiceType fromValue(String value)
          throws IllegalArgumentException {
        ConsolidationSpecialServiceType enumeration = (ConsolidationSpecialServiceType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ConsolidationSpecialServiceType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidationSpecialServiceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationSpecialServiceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
