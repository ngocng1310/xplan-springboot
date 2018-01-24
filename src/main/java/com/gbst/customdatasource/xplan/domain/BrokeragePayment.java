//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.24 at 02:11:13 PM AEST 
//


package com.gbst.customdatasource.xplan.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BrokeragePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokeragePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.epistandards.com/4.3}Identifier"/>
 *         &lt;sequence>
 *           &lt;element name="InvestmentCode" type="{http://www.epistandards.com/4.3}InvestmentCode"/>
 *           &lt;element name="HoldingId" type="{http://www.epistandards.com/4.3}Identifier" minOccurs="0"/>
 *           &lt;element name="PaymentType">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="UF"/>
 *                 &lt;enumeration value="TP"/>
 *                 &lt;enumeration value="RV"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="DatePaid" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="NetAmount" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *           &lt;element name="Tax" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *           &lt;element name="PaymentMethod">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="Cheque"/>
 *                 &lt;enumeration value="DirectCredit"/>
 *                 &lt;enumeration value="Other"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Reference" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="12"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Sequence" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="12"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Notes" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Note" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Detail">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="200"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="LinkedTransactionId" type="{http://www.epistandards.com/4.3}Identifier" minOccurs="0"/>
 *           &lt;element name="ReversedTransactionId" type="{http://www.epistandards.com/4.3}Identifier" minOccurs="0"/>
 *           &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokeragePayment", propOrder = {
    "id",
    "investmentCode",
    "holdingId",
    "paymentType",
    "datePaid",
    "netAmount",
    "tax",
    "paymentMethod",
    "reference",
    "sequence",
    "notes",
    "linkedTransactionId",
    "reversedTransactionId",
    "delete"
})
public class BrokeragePayment {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "InvestmentCode", required = true)
    protected String investmentCode;
    @XmlElement(name = "HoldingId")
    protected String holdingId;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "DatePaid", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePaid;
    @XmlElement(name = "NetAmount", required = true)
    protected MonetaryAmount netAmount;
    @XmlElement(name = "Tax", required = true)
    protected MonetaryAmount tax;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "Notes")
    protected BrokeragePayment.Notes notes;
    @XmlElement(name = "LinkedTransactionId")
    protected String linkedTransactionId;
    @XmlElement(name = "ReversedTransactionId")
    protected String reversedTransactionId;
    @XmlElement(name = "Delete")
    protected boolean delete;

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

    /**
     * Gets the value of the investmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestmentCode() {
        return investmentCode;
    }

    /**
     * Sets the value of the investmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestmentCode(String value) {
        this.investmentCode = value;
    }

    /**
     * Gets the value of the holdingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldingId() {
        return holdingId;
    }

    /**
     * Sets the value of the holdingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldingId(String value) {
        this.holdingId = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the datePaid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePaid() {
        return datePaid;
    }

    /**
     * Sets the value of the datePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePaid(XMLGregorianCalendar value) {
        this.datePaid = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setNetAmount(MonetaryAmount value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setTax(MonetaryAmount value) {
        this.tax = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link BrokeragePayment.Notes }
     *     
     */
    public BrokeragePayment.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokeragePayment.Notes }
     *     
     */
    public void setNotes(BrokeragePayment.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the linkedTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedTransactionId() {
        return linkedTransactionId;
    }

    /**
     * Sets the value of the linkedTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedTransactionId(String value) {
        this.linkedTransactionId = value;
    }

    /**
     * Gets the value of the reversedTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversedTransactionId() {
        return reversedTransactionId;
    }

    /**
     * Sets the value of the reversedTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversedTransactionId(String value) {
        this.reversedTransactionId = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Note" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Detail">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="200"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        protected List<BrokeragePayment.Notes.Note> note;

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
         * {@link BrokeragePayment.Notes.Note }
         * 
         * 
         */
        public List<BrokeragePayment.Notes.Note> getNote() {
            if (note == null) {
                note = new ArrayList<BrokeragePayment.Notes.Note>();
            }
            return this.note;
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
         *         &lt;element name="Detail">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="200"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "detail",
            "dateTime"
        })
        public static class Note {

            @XmlElement(name = "Detail", required = true)
            protected String detail;
            @XmlElement(name = "DateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTime;

            /**
             * Gets the value of the detail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetail() {
                return detail;
            }

            /**
             * Sets the value of the detail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetail(String value) {
                this.detail = value;
            }

            /**
             * Gets the value of the dateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateTime() {
                return dateTime;
            }

            /**
             * Sets the value of the dateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateTime(XMLGregorianCalendar value) {
                this.dateTime = value;
            }

        }

    }

}
