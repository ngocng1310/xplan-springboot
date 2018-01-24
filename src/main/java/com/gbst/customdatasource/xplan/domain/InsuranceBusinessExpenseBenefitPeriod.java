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
 * <p>Java class for InsuranceBusinessExpenseBenefitPeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceBusinessExpenseBenefitPeriod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M6"/>
 *     &lt;enumeration value="Y1"/>
 *     &lt;enumeration value="M18"/>
 *     &lt;enumeration value="Y2"/>
 *     &lt;enumeration value="Y5"/>
 *     &lt;enumeration value="Y6"/>
 *     &lt;enumeration value="Y10"/>
 *     &lt;enumeration value="A55"/>
 *     &lt;enumeration value="A60"/>
 *     &lt;enumeration value="A65"/>
 *     &lt;enumeration value="A70"/>
 *     &lt;enumeration value="A75"/>
 *     &lt;enumeration value="A80"/>
 *     &lt;enumeration value="LifeTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsuranceBusinessExpenseBenefitPeriod")
@XmlEnum
public enum InsuranceBusinessExpenseBenefitPeriod {

    @XmlEnumValue("M6")
    M_6("M6"),

    /**
     *  1 Year
     * 
     */
    @XmlEnumValue("Y1")
    Y_1("Y1"),
    @XmlEnumValue("M18")
    M_18("M18"),

    /**
     *  2 Years
     * 
     */
    @XmlEnumValue("Y2")
    Y_2("Y2"),

    /**
     *  5 Years
     * 
     */
    @XmlEnumValue("Y5")
    Y_5("Y5"),

    /**
     *  6 Years
     * 
     */
    @XmlEnumValue("Y6")
    Y_6("Y6"),
    @XmlEnumValue("Y10")
    Y_10("Y10"),
    @XmlEnumValue("A55")
    A_55("A55"),
    @XmlEnumValue("A60")
    A_60("A60"),
    @XmlEnumValue("A65")
    A_65("A65"),
    @XmlEnumValue("A70")
    A_70("A70"),
    @XmlEnumValue("A75")
    A_75("A75"),
    @XmlEnumValue("A80")
    A_80("A80"),
    @XmlEnumValue("LifeTime")
    LIFE_TIME("LifeTime");
    private final String value;

    InsuranceBusinessExpenseBenefitPeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsuranceBusinessExpenseBenefitPeriod fromValue(String v) {
        for (InsuranceBusinessExpenseBenefitPeriod c: InsuranceBusinessExpenseBenefitPeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
