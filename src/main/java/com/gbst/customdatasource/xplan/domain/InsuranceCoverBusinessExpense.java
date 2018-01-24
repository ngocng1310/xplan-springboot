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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * BusinessExpense
 * 
 * <p>Java class for InsuranceCoverBusinessExpense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceCoverBusinessExpense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Basic"/>
 *               &lt;enumeration value="Comprehensive"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Benefit" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="CoverDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice maxOccurs="2" minOccurs="0">
 *           &lt;element name="AccidentBenefitPeriod" type="{http://www.epistandards.com/4.3}InsuranceBusinessExpenseBenefitPeriod"/>
 *           &lt;element name="SicknessBenefitPeriod" type="{http://www.epistandards.com/4.3}InsuranceBusinessExpenseBenefitPeriod"/>
 *         &lt;/choice>
 *         &lt;element name="WaitingPeriod" type="{http://www.epistandards.com/4.3}InsuranceBusinessExpenseWaitingPeriod" minOccurs="0"/>
 *         &lt;element name="BenefitFrequency" type="{http://www.epistandards.com/4.3}PaymentFrequency" minOccurs="0"/>
 *         &lt;element name="CommencementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="RenewalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PremiumDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PremiumAmount" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                   &lt;element name="Indexation" type="{http://www.epistandards.com/4.3}Indexation" minOccurs="0"/>
 *                   &lt;element name="PremiumStructure" type="{http://www.epistandards.com/4.3}InsurancePremiumStructure" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BenefitStatus" type="{http://www.epistandards.com/4.3}InsuranceBenefitStatus" minOccurs="0"/>
 *         &lt;element name="IssueStatus" type="{http://www.epistandards.com/4.3}InsuranceIssueStatus" minOccurs="0"/>
 *         &lt;element name="Loading" type="{http://www.epistandards.com/4.3}InsuranceLoading" minOccurs="0"/>
 *         &lt;element name="Exclusions" type="{http://www.epistandards.com/4.3}InsuranceExclusions" minOccurs="0"/>
 *         &lt;element name="Options" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="4">
 *                   &lt;element name="Term">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="3Months"/>
 *                         &lt;enumeration value="6Months"/>
 *                         &lt;enumeration value="12Months"/>
 *                         &lt;enumeration value="24Months"/>
 *                         &lt;enumeration value="ToAge55"/>
 *                         &lt;enumeration value="ToAge60"/>
 *                         &lt;enumeration value="ToAge65"/>
 *                         &lt;enumeration value="ToAge66"/>
 *                         &lt;enumeration value="ToAge70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AIDSExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="DayXAccidentBenefit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="5">
 *                             &lt;element name="Premium" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                             &lt;element name="ExpiryAge">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;maxInclusive value="115"/>
 *                                   &lt;minInclusive value="0"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DayX">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="31"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="QualifyingPeriod">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="365"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BenefitPeriod">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="365"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EPIExtension" type="{http://www.epistandards.com/4.3}EPIExtension"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "InsuranceCoverBusinessExpense", propOrder = {
    "type",
    "benefit",
    "coverDescription",
    "accidentBenefitPeriodOrSicknessBenefitPeriod",
    "waitingPeriod",
    "benefitFrequency",
    "commencementDate",
    "renewalDate",
    "expiryDate",
    "premiumDetails",
    "benefitStatus",
    "issueStatus",
    "loading",
    "exclusions",
    "options",
    "notes",
    "delete",
    "epiExtension"
})
public class InsuranceCoverBusinessExpense {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Benefit", required = true)
    protected MonetaryAmount benefit;
    @XmlElement(name = "CoverDescription")
    protected String coverDescription;
    @XmlElementRefs({
        @XmlElementRef(name = "SicknessBenefitPeriod", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AccidentBenefitPeriod", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<InsuranceBusinessExpenseBenefitPeriod>> accidentBenefitPeriodOrSicknessBenefitPeriod;
    @XmlElement(name = "WaitingPeriod")
    protected InsuranceBusinessExpenseWaitingPeriod waitingPeriod;
    @XmlElement(name = "BenefitFrequency")
    protected PaymentFrequency benefitFrequency;
    @XmlElement(name = "CommencementDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commencementDate;
    @XmlElement(name = "RenewalDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar renewalDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "PremiumDetails")
    protected InsuranceCoverBusinessExpense.PremiumDetails premiumDetails;
    @XmlElement(name = "BenefitStatus")
    protected InsuranceBenefitStatus benefitStatus;
    @XmlElement(name = "IssueStatus")
    protected InsuranceIssueStatus issueStatus;
    @XmlElement(name = "Loading")
    protected InsuranceLoading loading;
    @XmlElement(name = "Exclusions")
    protected InsuranceExclusions exclusions;
    @XmlElement(name = "Options")
    protected InsuranceCoverBusinessExpense.Options options;
    @XmlElement(name = "Notes")
    protected InsuranceCoverBusinessExpense.Notes notes;
    @XmlElement(name = "Delete")
    protected boolean delete;
    @XmlElement(name = "EPIExtension")
    protected EPIExtension epiExtension;

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
     * Gets the value of the benefit property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getBenefit() {
        return benefit;
    }

    /**
     * Sets the value of the benefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setBenefit(MonetaryAmount value) {
        this.benefit = value;
    }

    /**
     * Gets the value of the coverDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverDescription() {
        return coverDescription;
    }

    /**
     * Sets the value of the coverDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverDescription(String value) {
        this.coverDescription = value;
    }

    /**
     * Gets the value of the accidentBenefitPeriodOrSicknessBenefitPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accidentBenefitPeriodOrSicknessBenefitPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccidentBenefitPeriodOrSicknessBenefitPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link InsuranceBusinessExpenseBenefitPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link InsuranceBusinessExpenseBenefitPeriod }{@code >}
     * 
     * 
     */
    public List<JAXBElement<InsuranceBusinessExpenseBenefitPeriod>> getAccidentBenefitPeriodOrSicknessBenefitPeriod() {
        if (accidentBenefitPeriodOrSicknessBenefitPeriod == null) {
            accidentBenefitPeriodOrSicknessBenefitPeriod = new ArrayList<JAXBElement<InsuranceBusinessExpenseBenefitPeriod>>();
        }
        return this.accidentBenefitPeriodOrSicknessBenefitPeriod;
    }

    /**
     * Gets the value of the waitingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessExpenseWaitingPeriod }
     *     
     */
    public InsuranceBusinessExpenseWaitingPeriod getWaitingPeriod() {
        return waitingPeriod;
    }

    /**
     * Sets the value of the waitingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessExpenseWaitingPeriod }
     *     
     */
    public void setWaitingPeriod(InsuranceBusinessExpenseWaitingPeriod value) {
        this.waitingPeriod = value;
    }

    /**
     * Gets the value of the benefitFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFrequency }
     *     
     */
    public PaymentFrequency getBenefitFrequency() {
        return benefitFrequency;
    }

    /**
     * Sets the value of the benefitFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFrequency }
     *     
     */
    public void setBenefitFrequency(PaymentFrequency value) {
        this.benefitFrequency = value;
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
     * Gets the value of the renewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRenewalDate() {
        return renewalDate;
    }

    /**
     * Sets the value of the renewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRenewalDate(XMLGregorianCalendar value) {
        this.renewalDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the premiumDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverBusinessExpense.PremiumDetails }
     *     
     */
    public InsuranceCoverBusinessExpense.PremiumDetails getPremiumDetails() {
        return premiumDetails;
    }

    /**
     * Sets the value of the premiumDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverBusinessExpense.PremiumDetails }
     *     
     */
    public void setPremiumDetails(InsuranceCoverBusinessExpense.PremiumDetails value) {
        this.premiumDetails = value;
    }

    /**
     * Gets the value of the benefitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBenefitStatus }
     *     
     */
    public InsuranceBenefitStatus getBenefitStatus() {
        return benefitStatus;
    }

    /**
     * Sets the value of the benefitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBenefitStatus }
     *     
     */
    public void setBenefitStatus(InsuranceBenefitStatus value) {
        this.benefitStatus = value;
    }

    /**
     * Gets the value of the issueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceIssueStatus }
     *     
     */
    public InsuranceIssueStatus getIssueStatus() {
        return issueStatus;
    }

    /**
     * Sets the value of the issueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceIssueStatus }
     *     
     */
    public void setIssueStatus(InsuranceIssueStatus value) {
        this.issueStatus = value;
    }

    /**
     * Gets the value of the loading property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceLoading }
     *     
     */
    public InsuranceLoading getLoading() {
        return loading;
    }

    /**
     * Sets the value of the loading property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceLoading }
     *     
     */
    public void setLoading(InsuranceLoading value) {
        this.loading = value;
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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverBusinessExpense.Options }
     *     
     */
    public InsuranceCoverBusinessExpense.Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverBusinessExpense.Options }
     *     
     */
    public void setOptions(InsuranceCoverBusinessExpense.Options value) {
        this.options = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverBusinessExpense.Notes }
     *     
     */
    public InsuranceCoverBusinessExpense.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverBusinessExpense.Notes }
     *     
     */
    public void setNotes(InsuranceCoverBusinessExpense.Notes value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="4">
     *         &lt;element name="Term">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="3Months"/>
     *               &lt;enumeration value="6Months"/>
     *               &lt;enumeration value="12Months"/>
     *               &lt;enumeration value="24Months"/>
     *               &lt;enumeration value="ToAge55"/>
     *               &lt;enumeration value="ToAge60"/>
     *               &lt;enumeration value="ToAge65"/>
     *               &lt;enumeration value="ToAge66"/>
     *               &lt;enumeration value="ToAge70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AIDSExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="DayXAccidentBenefit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice maxOccurs="5">
     *                   &lt;element name="Premium" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *                   &lt;element name="ExpiryAge">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;maxInclusive value="115"/>
     *                         &lt;minInclusive value="0"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DayX">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="31"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="QualifyingPeriod">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="1"/>
     *                         &lt;maxInclusive value="365"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BenefitPeriod">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="1"/>
     *                         &lt;maxInclusive value="365"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EPIExtension" type="{http://www.epistandards.com/4.3}EPIExtension"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "termOrAIDSExclusionOrDayXAccidentBenefit"
    })
    public static class Options {

        @XmlElements({
            @XmlElement(name = "Term", type = String.class),
            @XmlElement(name = "AIDSExclusion", type = Boolean.class),
            @XmlElement(name = "DayXAccidentBenefit", type = InsuranceCoverBusinessExpense.Options.DayXAccidentBenefit.class),
            @XmlElement(name = "EPIExtension", type = EPIExtension.class)
        })
        protected List<Object> termOrAIDSExclusionOrDayXAccidentBenefit;

        /**
         * Gets the value of the termOrAIDSExclusionOrDayXAccidentBenefit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the termOrAIDSExclusionOrDayXAccidentBenefit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTermOrAIDSExclusionOrDayXAccidentBenefit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link Boolean }
         * {@link InsuranceCoverBusinessExpense.Options.DayXAccidentBenefit }
         * {@link EPIExtension }
         * 
         * 
         */
        public List<Object> getTermOrAIDSExclusionOrDayXAccidentBenefit() {
            if (termOrAIDSExclusionOrDayXAccidentBenefit == null) {
                termOrAIDSExclusionOrDayXAccidentBenefit = new ArrayList<Object>();
            }
            return this.termOrAIDSExclusionOrDayXAccidentBenefit;
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
         *       &lt;choice maxOccurs="5">
         *         &lt;element name="Premium" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
         *         &lt;element name="ExpiryAge">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;maxInclusive value="115"/>
         *               &lt;minInclusive value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DayX">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="31"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="QualifyingPeriod">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="1"/>
         *               &lt;maxInclusive value="365"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BenefitPeriod">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="1"/>
         *               &lt;maxInclusive value="365"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "premiumOrExpiryAgeOrDayX"
        })
        public static class DayXAccidentBenefit {

            @XmlElementRefs({
                @XmlElementRef(name = "DayX", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "ExpiryAge", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "BenefitPeriod", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "QualifyingPeriod", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Premium", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<?>> premiumOrExpiryAgeOrDayX;

            /**
             * Gets the value of the premiumOrExpiryAgeOrDayX property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiumOrExpiryAgeOrDayX property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiumOrExpiryAgeOrDayX().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link Integer }{@code >}
             * {@link JAXBElement }{@code <}{@link Integer }{@code >}
             * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
             * {@link JAXBElement }{@code <}{@link Integer }{@code >}
             * {@link JAXBElement }{@code <}{@link Integer }{@code >}
             * 
             * 
             */
            public List<JAXBElement<?>> getPremiumOrExpiryAgeOrDayX() {
                if (premiumOrExpiryAgeOrDayX == null) {
                    premiumOrExpiryAgeOrDayX = new ArrayList<JAXBElement<?>>();
                }
                return this.premiumOrExpiryAgeOrDayX;
            }

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
     *         &lt;element name="PremiumAmount" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *         &lt;element name="Indexation" type="{http://www.epistandards.com/4.3}Indexation" minOccurs="0"/>
     *         &lt;element name="PremiumStructure" type="{http://www.epistandards.com/4.3}InsurancePremiumStructure" minOccurs="0"/>
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
        "premiumAmount",
        "indexation",
        "premiumStructure"
    })
    public static class PremiumDetails {

        @XmlElement(name = "PremiumAmount", required = true)
        protected MonetaryAmount premiumAmount;
        @XmlElement(name = "Indexation")
        protected Indexation indexation;
        @XmlElement(name = "PremiumStructure")
        protected InsurancePremiumStructure premiumStructure;

        /**
         * Gets the value of the premiumAmount property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getPremiumAmount() {
            return premiumAmount;
        }

        /**
         * Sets the value of the premiumAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setPremiumAmount(MonetaryAmount value) {
            this.premiumAmount = value;
        }

        /**
         * Gets the value of the indexation property.
         * 
         * @return
         *     possible object is
         *     {@link Indexation }
         *     
         */
        public Indexation getIndexation() {
            return indexation;
        }

        /**
         * Sets the value of the indexation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Indexation }
         *     
         */
        public void setIndexation(Indexation value) {
            this.indexation = value;
        }

        /**
         * Gets the value of the premiumStructure property.
         * 
         * @return
         *     possible object is
         *     {@link InsurancePremiumStructure }
         *     
         */
        public InsurancePremiumStructure getPremiumStructure() {
            return premiumStructure;
        }

        /**
         * Sets the value of the premiumStructure property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsurancePremiumStructure }
         *     
         */
        public void setPremiumStructure(InsurancePremiumStructure value) {
            this.premiumStructure = value;
        }

    }

}
