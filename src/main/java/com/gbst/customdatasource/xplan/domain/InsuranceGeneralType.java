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
 * <p>Java class for InsuranceGeneralType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceGeneralType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automotive"/>
 *     &lt;enumeration value="Building"/>
 *     &lt;enumeration value="BuildingAndContents"/>
 *     &lt;enumeration value="Contents"/>
 *     &lt;enumeration value="Commercial"/>
 *     &lt;enumeration value="Landlords"/>
 *     &lt;enumeration value="Marine"/>
 *     &lt;enumeration value="MotorVehicle"/>
 *     &lt;enumeration value="PersonalProperty"/>
 *     &lt;enumeration value="PublicLiability"/>
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="ProfessionalIndemnity"/>
 *     &lt;enumeration value="Retail"/>
 *     &lt;enumeration value="Rural"/>
 *     &lt;enumeration value="Strata"/>
 *     &lt;enumeration value="NotSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsuranceGeneralType")
@XmlEnum
public enum InsuranceGeneralType {

    @XmlEnumValue("Automotive")
    AUTOMOTIVE("Automotive"),
    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("BuildingAndContents")
    BUILDING_AND_CONTENTS("BuildingAndContents"),
    @XmlEnumValue("Contents")
    CONTENTS("Contents"),
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),
    @XmlEnumValue("Landlords")
    LANDLORDS("Landlords"),
    @XmlEnumValue("Marine")
    MARINE("Marine"),
    @XmlEnumValue("MotorVehicle")
    MOTOR_VEHICLE("MotorVehicle"),
    @XmlEnumValue("PersonalProperty")
    PERSONAL_PROPERTY("PersonalProperty"),
    @XmlEnumValue("PublicLiability")
    PUBLIC_LIABILITY("PublicLiability"),
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),
    @XmlEnumValue("ProfessionalIndemnity")
    PROFESSIONAL_INDEMNITY("ProfessionalIndemnity"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    @XmlEnumValue("Rural")
    RURAL("Rural"),
    @XmlEnumValue("Strata")
    STRATA("Strata"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified");
    private final String value;

    InsuranceGeneralType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsuranceGeneralType fromValue(String v) {
        for (InsuranceGeneralType c: InsuranceGeneralType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}