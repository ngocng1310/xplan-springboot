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
 * <p>Java class for TaxStructure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxStructure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Superannuation"/>
 *     &lt;enumeration value="AllocatedPension"/>
 *     &lt;enumeration value="TermAllocatedPension"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxStructure")
@XmlEnum
public enum TaxStructure {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Superannuation")
    SUPERANNUATION("Superannuation"),
    @XmlEnumValue("AllocatedPension")
    ALLOCATED_PENSION("AllocatedPension"),
    @XmlEnumValue("TermAllocatedPension")
    TERM_ALLOCATED_PENSION("TermAllocatedPension"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TaxStructure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxStructure fromValue(String v) {
        for (TaxStructure c: TaxStructure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
