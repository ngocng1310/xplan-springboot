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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidCredentials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Expiry" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EPIExtension" type="{http://www.epistandards.com/4.3}EPIExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validCredentials",
    "expiry",
    "epiExtension"
})
@XmlRootElement(name = "EPIValidateCredentialsResponse")
public class EPIValidateCredentialsResponse {

    @XmlElement(name = "ValidCredentials")
    protected boolean validCredentials;
    @XmlElement(name = "Expiry")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiry;
    @XmlElement(name = "EPIExtension")
    protected EPIExtension epiExtension;

    /**
     * Gets the value of the validCredentials property.
     * 
     */
    public boolean isValidCredentials() {
        return validCredentials;
    }

    /**
     * Sets the value of the validCredentials property.
     * 
     */
    public void setValidCredentials(boolean value) {
        this.validCredentials = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiry(XMLGregorianCalendar value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the epiExtension property.
     * 
     * @return
     *     possible object is
     *     {@link EPIExtension }
     *     
     */
    public EPIExtension getEPIExtension() {
        return epiExtension;
    }

    /**
     * Sets the value of the epiExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPIExtension }
     *     
     */
    public void setEPIExtension(EPIExtension value) {
        this.epiExtension = value;
    }

}
