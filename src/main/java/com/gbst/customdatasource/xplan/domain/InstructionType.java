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
 * <p>Java class for InstructionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="Redemption"/>
 *     &lt;enumeration value="SwitchIn"/>
 *     &lt;enumeration value="SwitchOut"/>
 *     &lt;enumeration value="Buy"/>
 *     &lt;enumeration value="Sell"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstructionType")
@XmlEnum
public enum InstructionType {

    @XmlEnumValue("Application")
    APPLICATION("Application"),
    @XmlEnumValue("Redemption")
    REDEMPTION("Redemption"),
    @XmlEnumValue("SwitchIn")
    SWITCH_IN("SwitchIn"),
    @XmlEnumValue("SwitchOut")
    SWITCH_OUT("SwitchOut"),
    @XmlEnumValue("Buy")
    BUY("Buy"),
    @XmlEnumValue("Sell")
    SELL("Sell");
    private final String value;

    InstructionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstructionType fromValue(String v) {
        for (InstructionType c: InstructionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
