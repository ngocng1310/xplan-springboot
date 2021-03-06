//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.24 at 02:11:13 PM AEST 
//


package com.gbst.customdatasource.xplan.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContributionAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContributionAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAmount" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="RolloverETPAmount" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *         &lt;element name="MemberContribution" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *         &lt;element name="EmployerContribution" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *         &lt;element name="SpouseContribution" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContributionAmount", propOrder = {
    "totalAmount",
    "rolloverETPAmount",
    "memberContribution",
    "employerContribution",
    "spouseContribution"
})
public class ContributionAmount {

    @XmlElement(name = "TotalAmount", required = true)
    protected MonetaryAmount totalAmount;
    @XmlElement(name = "RolloverETPAmount")
    protected MonetaryAmount rolloverETPAmount;
    @XmlElement(name = "MemberContribution")
    protected MonetaryAmount memberContribution;
    @XmlElement(name = "EmployerContribution")
    protected MonetaryAmount employerContribution;
    @XmlElement(name = "SpouseContribution")
    protected MonetaryAmount spouseContribution;

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setTotalAmount(MonetaryAmount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the rolloverETPAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getRolloverETPAmount() {
        return rolloverETPAmount;
    }

    /**
     * Sets the value of the rolloverETPAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setRolloverETPAmount(MonetaryAmount value) {
        this.rolloverETPAmount = value;
    }

    /**
     * Gets the value of the memberContribution property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getMemberContribution() {
        return memberContribution;
    }

    /**
     * Sets the value of the memberContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setMemberContribution(MonetaryAmount value) {
        this.memberContribution = value;
    }

    /**
     * Gets the value of the employerContribution property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getEmployerContribution() {
        return employerContribution;
    }

    /**
     * Sets the value of the employerContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setEmployerContribution(MonetaryAmount value) {
        this.employerContribution = value;
    }

    /**
     * Gets the value of the spouseContribution property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getSpouseContribution() {
        return spouseContribution;
    }

    /**
     * Sets the value of the spouseContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setSpouseContribution(MonetaryAmount value) {
        this.spouseContribution = value;
    }

}
