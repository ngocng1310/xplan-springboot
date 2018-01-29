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
 * <p>Java class for BeneficiaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Binding"/>
 *     &lt;enumeration value="NonBinding"/>
 *     &lt;enumeration value="Lapsing"/>
 *     &lt;enumeration value="NonLapsing"/>
 *     &lt;enumeration value="NotSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BeneficiaryType")
@XmlEnum
public enum BeneficiaryType {

    @XmlEnumValue("Binding")
    BINDING("Binding"),
    @XmlEnumValue("NonBinding")
    NON_BINDING("NonBinding"),
    @XmlEnumValue("Lapsing")
    LAPSING("Lapsing"),
    @XmlEnumValue("NonLapsing")
    NON_LAPSING("NonLapsing"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified");
    private final String value;

    BeneficiaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeneficiaryType fromValue(String v) {
        for (BeneficiaryType c: BeneficiaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}