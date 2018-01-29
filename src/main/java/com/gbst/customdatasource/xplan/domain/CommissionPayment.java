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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommissionPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdviserId" type="{http://www.epistandards.com/4.3}Identifier"/>
 *         &lt;element name="AccountId" type="{http://www.epistandards.com/4.3}Identifier"/>
 *         &lt;element name="Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="U"/>
 *               &lt;enumeration value="O"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="V"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmountIncTax" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="Tax" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="Currency" type="{http://www.epistandards.com/4.3}CurrencyCode"/>
 *         &lt;element name="FXAccountCurrency" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice maxOccurs="2">
 *           &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;/choice>
 *         &lt;element name="InvoiceNumber" type="{http://www.epistandards.com/4.3}Identifier" minOccurs="0"/>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Note" type="{http://www.epistandards.com/4.3}Note"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "CommissionPayment", propOrder = {
    "adviserId",
    "accountId",
    "type",
    "amountIncTax",
    "tax",
    "currency",
    "fxAccountCurrency",
    "startDate",
    "paymentDateOrEndDate",
    "invoiceNumber",
    "notes",
    "delete",
    "epiExtension"
})
@XmlSeeAlso({
    com.gbst.customdatasource.xplan.domain.EPIDataResponse.CommissionPayments.CommissionPayment.class
})
public class CommissionPayment {

    @XmlElement(name = "AdviserId", required = true)
    protected String adviserId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "AmountIncTax", required = true)
    protected MonetaryAmount amountIncTax;
    @XmlElement(name = "Tax", required = true)
    protected MonetaryAmount tax;
    @XmlElement(name = "Currency", required = true)
    protected CurrencyCode currency;
    @XmlElement(name = "FXAccountCurrency")
    protected MonetaryAmount fxAccountCurrency;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElementRefs({
        @XmlElementRef(name = "PaymentDate", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EndDate", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<XMLGregorianCalendar>> paymentDateOrEndDate;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "Notes")
    protected CommissionPayment.Notes notes;
    @XmlElement(name = "Delete")
    protected boolean delete;
    @XmlElement(name = "EPIExtension")
    protected EPIExtension epiExtension;

    /**
     * Gets the value of the adviserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdviserId() {
        return adviserId;
    }

    /**
     * Sets the value of the adviserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdviserId(String value) {
        this.adviserId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the amountIncTax property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getAmountIncTax() {
        return amountIncTax;
    }

    /**
     * Sets the value of the amountIncTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setAmountIncTax(MonetaryAmount value) {
        this.amountIncTax = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrency(CurrencyCode value) {
        this.currency = value;
    }

    /**
     * Gets the value of the fxAccountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getFXAccountCurrency() {
        return fxAccountCurrency;
    }

    /**
     * Sets the value of the fxAccountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setFXAccountCurrency(MonetaryAmount value) {
        this.fxAccountCurrency = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the paymentDateOrEndDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDateOrEndDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDateOrEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<XMLGregorianCalendar>> getPaymentDateOrEndDate() {
        if (paymentDateOrEndDate == null) {
            paymentDateOrEndDate = new ArrayList<JAXBElement<XMLGregorianCalendar>>();
        }
        return this.paymentDateOrEndDate;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionPayment.Notes }
     *     
     */
    public CommissionPayment.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionPayment.Notes }
     *     
     */
    public void setNotes(CommissionPayment.Notes value) {
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Note" type="{http://www.epistandards.com/4.3}Note"/>
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