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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomeComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomeComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="19">
 *         &lt;element name="DomesticOtherIncome" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="ForeignOtherIncome" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="OtherIncomeTaxFree" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="DomesticInterest" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="ForeignInterest" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="ForeignFIF" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="Franked" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="Unfranked" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="ReturnOfCapital" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="DomesticWithholdingTax" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="ForeignWithholdingTax" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="TaxFree" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="TaxExempt" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="TaxDeferred" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="BuildingAllowance" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="ForeignPassiveIncome" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="CapitalGains">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DomesticTotal" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                   &lt;element name="DomesticIndexation" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                   &lt;element name="DomesticOther" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                   &lt;element name="DomesticDiscounted" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                   &lt;element name="DomesticConcession" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                   &lt;element name="ForeignTotal" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                   &lt;element name="ForeignIndexation" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                   &lt;element name="ForeignOther" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                   &lt;element name="ForeignDiscounted" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                   &lt;element name="ForeignConcession" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ForeignDividend" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *         &lt;element name="EPIExtension" type="{http://www.epistandards.com/4.3}EPIExtension" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeComponents", propOrder = {
    "domesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree"
})
public class IncomeComponents {

    @XmlElementRefs({
        @XmlElementRef(name = "ForeignPassiveIncome", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DomesticOtherIncome", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EPIExtension", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Unfranked", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DomesticInterest", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BuildingAllowance", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ForeignOtherIncome", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ForeignInterest", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxFree", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ForeignFIF", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Franked", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ReturnOfCapital", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CapitalGains", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ForeignWithholdingTax", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OtherIncomeTaxFree", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ForeignDividend", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxExempt", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxDeferred", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DomesticWithholdingTax", namespace = "http://www.epistandards.com/4.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> domesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree;

    /**
     * Gets the value of the domesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link EPIExtension }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link IncomeComponents.CapitalGains }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmount }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDomesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree() {
        if (domesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree == null) {
            domesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree = new ArrayList<JAXBElement<?>>();
        }
        return this.domesticOtherIncomeOrForeignOtherIncomeOrOtherIncomeTaxFree;
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
     *         &lt;element name="DomesticTotal" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *         &lt;element name="DomesticIndexation" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
     *         &lt;element name="DomesticOther" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
     *         &lt;element name="DomesticDiscounted" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
     *         &lt;element name="DomesticConcession" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
     *         &lt;element name="ForeignTotal" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *         &lt;element name="ForeignIndexation" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
     *         &lt;element name="ForeignOther" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
     *         &lt;element name="ForeignDiscounted" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
     *         &lt;element name="ForeignConcession" type="{http://www.epistandards.com/4.3}MonetaryAmount" minOccurs="0"/>
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
        "domesticTotal",
        "domesticIndexation",
        "domesticOther",
        "domesticDiscounted",
        "domesticConcession",
        "foreignTotal",
        "foreignIndexation",
        "foreignOther",
        "foreignDiscounted",
        "foreignConcession"
    })
    public static class CapitalGains {

        @XmlElement(name = "DomesticTotal", required = true)
        protected MonetaryAmount domesticTotal;
        @XmlElement(name = "DomesticIndexation")
        protected MonetaryAmount domesticIndexation;
        @XmlElement(name = "DomesticOther")
        protected MonetaryAmount domesticOther;
        @XmlElement(name = "DomesticDiscounted")
        protected MonetaryAmount domesticDiscounted;
        @XmlElement(name = "DomesticConcession")
        protected MonetaryAmount domesticConcession;
        @XmlElement(name = "ForeignTotal", required = true)
        protected MonetaryAmount foreignTotal;
        @XmlElement(name = "ForeignIndexation")
        protected MonetaryAmount foreignIndexation;
        @XmlElement(name = "ForeignOther")
        protected MonetaryAmount foreignOther;
        @XmlElement(name = "ForeignDiscounted")
        protected MonetaryAmount foreignDiscounted;
        @XmlElement(name = "ForeignConcession")
        protected MonetaryAmount foreignConcession;

        /**
         * Gets the value of the domesticTotal property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getDomesticTotal() {
            return domesticTotal;
        }

        /**
         * Sets the value of the domesticTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setDomesticTotal(MonetaryAmount value) {
            this.domesticTotal = value;
        }

        /**
         * Gets the value of the domesticIndexation property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getDomesticIndexation() {
            return domesticIndexation;
        }

        /**
         * Sets the value of the domesticIndexation property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setDomesticIndexation(MonetaryAmount value) {
            this.domesticIndexation = value;
        }

        /**
         * Gets the value of the domesticOther property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getDomesticOther() {
            return domesticOther;
        }

        /**
         * Sets the value of the domesticOther property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setDomesticOther(MonetaryAmount value) {
            this.domesticOther = value;
        }

        /**
         * Gets the value of the domesticDiscounted property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getDomesticDiscounted() {
            return domesticDiscounted;
        }

        /**
         * Sets the value of the domesticDiscounted property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setDomesticDiscounted(MonetaryAmount value) {
            this.domesticDiscounted = value;
        }

        /**
         * Gets the value of the domesticConcession property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getDomesticConcession() {
            return domesticConcession;
        }

        /**
         * Sets the value of the domesticConcession property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setDomesticConcession(MonetaryAmount value) {
            this.domesticConcession = value;
        }

        /**
         * Gets the value of the foreignTotal property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getForeignTotal() {
            return foreignTotal;
        }

        /**
         * Sets the value of the foreignTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setForeignTotal(MonetaryAmount value) {
            this.foreignTotal = value;
        }

        /**
         * Gets the value of the foreignIndexation property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getForeignIndexation() {
            return foreignIndexation;
        }

        /**
         * Sets the value of the foreignIndexation property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setForeignIndexation(MonetaryAmount value) {
            this.foreignIndexation = value;
        }

        /**
         * Gets the value of the foreignOther property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getForeignOther() {
            return foreignOther;
        }

        /**
         * Sets the value of the foreignOther property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setForeignOther(MonetaryAmount value) {
            this.foreignOther = value;
        }

        /**
         * Gets the value of the foreignDiscounted property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getForeignDiscounted() {
            return foreignDiscounted;
        }

        /**
         * Sets the value of the foreignDiscounted property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setForeignDiscounted(MonetaryAmount value) {
            this.foreignDiscounted = value;
        }

        /**
         * Gets the value of the foreignConcession property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getForeignConcession() {
            return foreignConcession;
        }

        /**
         * Sets the value of the foreignConcession property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setForeignConcession(MonetaryAmount value) {
            this.foreignConcession = value;
        }

    }

}
