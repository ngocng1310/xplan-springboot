//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.24 at 02:11:13 PM AEST 
//


package com.gbst.customdatasource.xplan.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RebalancingFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RebalancingFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Never"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="BiMonthly"/>
 *     &lt;enumeration value="Quarterly"/>
 *     &lt;enumeration value="HalfYearly"/>
 *     &lt;enumeration value="Yearly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RebalancingFrequency")
@XmlEnum
public enum RebalancingFrequency {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("BiMonthly")
    BI_MONTHLY("BiMonthly"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("HalfYearly")
    HALF_YEARLY("HalfYearly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly");
    private final String value;

    RebalancingFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RebalancingFrequency fromValue(String v) {
        for (RebalancingFrequency c: RebalancingFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
