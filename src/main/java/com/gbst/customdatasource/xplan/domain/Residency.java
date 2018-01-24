//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.24 at 02:11:13 PM AEST 
//


package com.gbst.customdatasource.xplan.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Residency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Residency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlaceOfBirth" type="{http://www.epistandards.com/4.3}Country"/>
 *         &lt;choice>
 *           &lt;element name="PermanentResident" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;sequence>
 *             &lt;element name="ResidencyPeriod">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="Years">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.epistandards.com/4.3}NumberOfYears">
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="Months" type="{http://www.epistandards.com/4.3}NumberOfMonths"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="Visa" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;minLength value="1"/>
 *                   &lt;maxLength value="200"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="ApplyingForPermenantesidency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *             &lt;element name="PreviousResidencies" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="PreviousResidency" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Country" type="{http://www.epistandards.com/4.3}Country"/>
 *                                 &lt;element name="Period">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                           &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="Details" minOccurs="0">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;minLength value="1"/>
 *                                       &lt;maxLength value="200"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Residency", propOrder = {
    "placeOfBirth",
    "permanentResident",
    "residencyPeriod",
    "visa",
    "applyingForPermenantesidency",
    "previousResidencies"
})
public class Residency {

    @XmlElement(name = "PlaceOfBirth", required = true)
    protected Country placeOfBirth;
    @XmlElement(name = "PermanentResident")
    protected Boolean permanentResident;
    @XmlElement(name = "ResidencyPeriod")
    protected Residency.ResidencyPeriod residencyPeriod;
    @XmlElement(name = "Visa")
    protected String visa;
    @XmlElement(name = "ApplyingForPermenantesidency")
    protected Boolean applyingForPermenantesidency;
    @XmlElement(name = "PreviousResidencies")
    protected Residency.PreviousResidencies previousResidencies;

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setPlaceOfBirth(Country value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the permanentResident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentResident() {
        return permanentResident;
    }

    /**
     * Sets the value of the permanentResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentResident(Boolean value) {
        this.permanentResident = value;
    }

    /**
     * Gets the value of the residencyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Residency.ResidencyPeriod }
     *     
     */
    public Residency.ResidencyPeriod getResidencyPeriod() {
        return residencyPeriod;
    }

    /**
     * Sets the value of the residencyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Residency.ResidencyPeriod }
     *     
     */
    public void setResidencyPeriod(Residency.ResidencyPeriod value) {
        this.residencyPeriod = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisa(String value) {
        this.visa = value;
    }

    /**
     * Gets the value of the applyingForPermenantesidency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyingForPermenantesidency() {
        return applyingForPermenantesidency;
    }

    /**
     * Sets the value of the applyingForPermenantesidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyingForPermenantesidency(Boolean value) {
        this.applyingForPermenantesidency = value;
    }

    /**
     * Gets the value of the previousResidencies property.
     * 
     * @return
     *     possible object is
     *     {@link Residency.PreviousResidencies }
     *     
     */
    public Residency.PreviousResidencies getPreviousResidencies() {
        return previousResidencies;
    }

    /**
     * Sets the value of the previousResidencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Residency.PreviousResidencies }
     *     
     */
    public void setPreviousResidencies(Residency.PreviousResidencies value) {
        this.previousResidencies = value;
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
     *         &lt;element name="PreviousResidency" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Country" type="{http://www.epistandards.com/4.3}Country"/>
     *                   &lt;element name="Period">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Details" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="200"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
        "previousResidency"
    })
    public static class PreviousResidencies {

        @XmlElement(name = "PreviousResidency", required = true)
        protected List<Residency.PreviousResidencies.PreviousResidency> previousResidency;

        /**
         * Gets the value of the previousResidency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousResidency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousResidency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Residency.PreviousResidencies.PreviousResidency }
         * 
         * 
         */
        public List<Residency.PreviousResidencies.PreviousResidency> getPreviousResidency() {
            if (previousResidency == null) {
                previousResidency = new ArrayList<Residency.PreviousResidencies.PreviousResidency>();
            }
            return this.previousResidency;
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
         *         &lt;element name="Country" type="{http://www.epistandards.com/4.3}Country"/>
         *         &lt;element name="Period">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Details" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="200"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "country",
            "period",
            "details"
        })
        public static class PreviousResidency {

            @XmlElement(name = "Country", required = true)
            protected Country country;
            @XmlElement(name = "Period", required = true)
            protected Residency.PreviousResidencies.PreviousResidency.Period period;
            @XmlElement(name = "Details")
            protected String details;

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link Country }
             *     
             */
            public Country getCountry() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link Country }
             *     
             */
            public void setCountry(Country value) {
                this.country = value;
            }

            /**
             * Gets the value of the period property.
             * 
             * @return
             *     possible object is
             *     {@link Residency.PreviousResidencies.PreviousResidency.Period }
             *     
             */
            public Residency.PreviousResidencies.PreviousResidency.Period getPeriod() {
                return period;
            }

            /**
             * Sets the value of the period property.
             * 
             * @param value
             *     allowed object is
             *     {@link Residency.PreviousResidencies.PreviousResidency.Period }
             *     
             */
            public void setPeriod(Residency.PreviousResidencies.PreviousResidency.Period value) {
                this.period = value;
            }

            /**
             * Gets the value of the details property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetails() {
                return details;
            }

            /**
             * Sets the value of the details property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetails(String value) {
                this.details = value;
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
             *         &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "dateFrom",
                "dateTo"
            })
            public static class Period {

                @XmlElement(name = "DateFrom", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dateFrom;
                @XmlElement(name = "DateTo")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dateTo;

                /**
                 * Gets the value of the dateFrom property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDateFrom() {
                    return dateFrom;
                }

                /**
                 * Sets the value of the dateFrom property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDateFrom(XMLGregorianCalendar value) {
                    this.dateFrom = value;
                }

                /**
                 * Gets the value of the dateTo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDateTo() {
                    return dateTo;
                }

                /**
                 * Sets the value of the dateTo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDateTo(XMLGregorianCalendar value) {
                    this.dateTo = value;
                }

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
     *         &lt;element name="Years">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.epistandards.com/4.3}NumberOfYears">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Months" type="{http://www.epistandards.com/4.3}NumberOfMonths"/>
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
        "years",
        "months"
    })
    public static class ResidencyPeriod {

        @XmlElement(name = "Years", required = true)
        protected BigInteger years;
        @XmlElement(name = "Months")
        protected int months;

        /**
         * Gets the value of the years property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getYears() {
            return years;
        }

        /**
         * Sets the value of the years property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setYears(BigInteger value) {
            this.years = value;
        }

        /**
         * Gets the value of the months property.
         * 
         */
        public int getMonths() {
            return months;
        }

        /**
         * Sets the value of the months property.
         * 
         */
        public void setMonths(int value) {
            this.months = value;
        }

    }

}
