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
 * <p>Java class for Platform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Platform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EPIId" type="{http://www.epistandards.com/4.3}EPIProviderID"/>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ABN" type="{http://www.epistandards.com/4.3}ABN" minOccurs="0"/>
 *         &lt;element name="ACNorARBN" type="{http://www.epistandards.com/4.3}ACN" minOccurs="0"/>
 *         &lt;element name="APIRPRI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HeadOffice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactDetails" type="{http://www.epistandards.com/4.3}ContactDetails"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Support" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactDetails" type="{http://www.epistandards.com/4.3}ContactDetails"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "Platform", propOrder = {
    "epiId",
    "name",
    "abn",
    "acNorARBN",
    "apirpri",
    "headOffice",
    "support",
    "epiExtension"
})
public class Platform {

    @XmlElement(name = "EPIId", required = true)
    protected String epiId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ABN")
    protected String abn;
    @XmlElement(name = "ACNorARBN")
    protected String acNorARBN;
    @XmlElement(name = "APIRPRI")
    protected String apirpri;
    @XmlElement(name = "HeadOffice")
    protected Platform.HeadOffice headOffice;
    @XmlElement(name = "Support")
    protected Platform.Support support;
    @XmlElement(name = "EPIExtension")
    protected EPIExtension epiExtension;

    /**
     * Gets the value of the epiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPIId() {
        return epiId;
    }

    /**
     * Sets the value of the epiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPIId(String value) {
        this.epiId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the abn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABN() {
        return abn;
    }

    /**
     * Sets the value of the abn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABN(String value) {
        this.abn = value;
    }

    /**
     * Gets the value of the acNorARBN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACNorARBN() {
        return acNorARBN;
    }

    /**
     * Sets the value of the acNorARBN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACNorARBN(String value) {
        this.acNorARBN = value;
    }

    /**
     * Gets the value of the apirpri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIRPRI() {
        return apirpri;
    }

    /**
     * Sets the value of the apirpri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIRPRI(String value) {
        this.apirpri = value;
    }

    /**
     * Gets the value of the headOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Platform.HeadOffice }
     *     
     */
    public Platform.HeadOffice getHeadOffice() {
        return headOffice;
    }

    /**
     * Sets the value of the headOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platform.HeadOffice }
     *     
     */
    public void setHeadOffice(Platform.HeadOffice value) {
        this.headOffice = value;
    }

    /**
     * Gets the value of the support property.
     * 
     * @return
     *     possible object is
     *     {@link Platform.Support }
     *     
     */
    public Platform.Support getSupport() {
        return support;
    }

    /**
     * Sets the value of the support property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platform.Support }
     *     
     */
    public void setSupport(Platform.Support value) {
        this.support = value;
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
     *         &lt;element name="ContactDetails" type="{http://www.epistandards.com/4.3}ContactDetails"/>
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
        "contactDetails"
    })
    public static class HeadOffice {

        @XmlElement(name = "ContactDetails", required = true)
        protected ContactDetails contactDetails;

        /**
         * Gets the value of the contactDetails property.
         * 
         * @return
         *     possible object is
         *     {@link ContactDetails }
         *     
         */
        public ContactDetails getContactDetails() {
            return contactDetails;
        }

        /**
         * Sets the value of the contactDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactDetails }
         *     
         */
        public void setContactDetails(ContactDetails value) {
            this.contactDetails = value;
        }

    }


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
     *         &lt;element name="ContactDetails" type="{http://www.epistandards.com/4.3}ContactDetails"/>
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
        "contactDetails"
    })
    public static class Support {

        @XmlElement(name = "ContactDetails", required = true)
        protected ContactDetails contactDetails;

        /**
         * Gets the value of the contactDetails property.
         * 
         * @return
         *     possible object is
         *     {@link ContactDetails }
         *     
         */
        public ContactDetails getContactDetails() {
            return contactDetails;
        }

        /**
         * Sets the value of the contactDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactDetails }
         *     
         */
        public void setContactDetails(ContactDetails value) {
            this.contactDetails = value;
        }

    }

}
