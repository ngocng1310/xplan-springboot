//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.24 at 02:11:13 PM AEST 
//


package com.gbst.customdatasource.xplan.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ContractValue
 * 
 * <p>Java class for InsuranceCoverContractValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceCoverContractValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="6">
 *           &lt;element name="DeathValue" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *           &lt;element name="FundValue" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *           &lt;element name="SurrenderValue" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *           &lt;element name="InitialLoanValue" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *           &lt;element name="LoanValue" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *           &lt;element name="MaturityValue" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;/choice>
 *         &lt;element name="CommencementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Exclusions" type="{http://www.epistandards.com/4.3}InsuranceExclusions" minOccurs="0"/>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Note" type="{http://www.epistandards.com/4.3}Note" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LinkedAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.epistandards.com/4.3}Identifier"/>
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
@XmlType(name = "InsuranceCoverContractValues", propOrder = {
    "deathValueOrFundValueOrSurrenderValue",
    "commencementDate",
    "maturityDate",
    "exclusions",
    "notes",
    "delete",
    "linkedAccount",
    "epiExtension"
})
public class InsuranceCoverContractValues {

    @XmlElementRefs({
        @XmlElementRef(name = "MaturityValue", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InitialLoanValue", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SurrenderValue", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FundValue", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeathValue", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LoanValue", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<MonetaryAmount>> deathValueOrFundValueOrSurrenderValue;
    @XmlElement(name = "CommencementDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commencementDate;
    @XmlElement(name = "MaturityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturityDate;
    @XmlElement(name = "Exclusions")
    protected InsuranceExclusions exclusions;
    @XmlElement(name = "Notes")
    protected InsuranceCoverContractValues.Notes notes;
    @XmlElement(name = "Delete")
    protected boolean delete;
    @XmlElement(name = "LinkedAccount")
    protected InsuranceCoverContractValues.LinkedAccount linkedAccount;
    @XmlElement(name = "EPIExtension")
    protected EPIExtension epiExtension;

    /**
     * Gets the value of the deathValueOrFundValueOrSurrenderValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deathValueOrFundValueOrSurrenderValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeathValueOrFundValueOrSurrenderValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * 
     * 
     */
    public List<JAXBElement<MonetaryAmount>> getDeathValueOrFundValueOrSurrenderValue() {
        if (deathValueOrFundValueOrSurrenderValue == null) {
            deathValueOrFundValueOrSurrenderValue = new ArrayList<JAXBElement<MonetaryAmount>>();
        }
        return this.deathValueOrFundValueOrSurrenderValue;
    }

    /**
     * Gets the value of the commencementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommencementDate() {
        return commencementDate;
    }

    /**
     * Sets the value of the commencementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommencementDate(XMLGregorianCalendar value) {
        this.commencementDate = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturityDate(XMLGregorianCalendar value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the exclusions property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceExclusions }
     *     
     */
    public InsuranceExclusions getExclusions() {
        return exclusions;
    }

    /**
     * Sets the value of the exclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceExclusions }
     *     
     */
    public void setExclusions(InsuranceExclusions value) {
        this.exclusions = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverContractValues.Notes }
     *     
     */
    public InsuranceCoverContractValues.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverContractValues.Notes }
     *     
     */
    public void setNotes(InsuranceCoverContractValues.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     */
    public void setDelete(boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the linkedAccount property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverContractValues.LinkedAccount }
     *     
     */
    public InsuranceCoverContractValues.LinkedAccount getLinkedAccount() {
        return linkedAccount;
    }

    /**
     * Sets the value of the linkedAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverContractValues.LinkedAccount }
     *     
     */
    public void setLinkedAccount(InsuranceCoverContractValues.LinkedAccount value) {
        this.linkedAccount = value;
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
     *         &lt;element name="Id" type="{http://www.epistandards.com/4.3}Identifier"/>
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
        "id"
    })
    public static class LinkedAccount {

        @XmlElement(name = "Id", required = true)
        protected String id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
     *         &lt;element name="Note" type="{http://www.epistandards.com/4.3}Note" maxOccurs="unbounded"/>
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
        "note"
    })
    public static class Notes {

        @XmlElement(name = "Note", required = true)
        protected List<Note> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Note }
         * 
         * 
         */
        public List<Note> getNote() {
            if (note == null) {
                note = new ArrayList<Note>();
            }
            return this.note;
        }

    }

}