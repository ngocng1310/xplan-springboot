//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.24 at 02:11:13 PM AEST 
//


package com.gbst.customdatasource.xplan.domain;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvestmentHoldingBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentHoldingBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.epistandards.com/4.3}Identifier"/>
 *         &lt;element name="SMAId" type="{http://www.epistandards.com/4.3}Identifier" minOccurs="0"/>
 *         &lt;element name="InvestmentCode" type="{http://www.epistandards.com/4.3}InvestmentCode"/>
 *         &lt;element name="Exchange" type="{http://www.epistandards.com/4.3}InvestmentExchange"/>
 *         &lt;element name="HoldingId" type="{http://www.epistandards.com/4.3}Identifier" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="CashBalance">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Settled" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                     &lt;element name="Pending" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                     &lt;element name="AsAtDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="UnitBalance">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Settled">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;totalDigits value="18"/>
 *                           &lt;fractionDigits value="4"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="Pending">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;totalDigits value="18"/>
 *                           &lt;fractionDigits value="4"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="AsAtDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Income" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GrossIncome" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                   &lt;element name="NetIncome" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
 *                   &lt;element name="IncomeComponents" type="{http://www.epistandards.com/4.3}IncomeComponents" minOccurs="0"/>
 *                   &lt;element name="TaxCredits" type="{http://www.epistandards.com/4.3}IncomeTaxCredits" minOccurs="0"/>
 *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="AsAtDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@XmlType(name = "InvestmentHoldingBalance", propOrder = {
    "accountId",
    "smaId",
    "investmentCode",
    "exchange",
    "holdingId",
    "cashBalance",
    "unitBalance",
    "income",
    "epiExtension"
})
public class InvestmentHoldingBalance {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "SMAId")
    protected String smaId;
    @XmlElement(name = "InvestmentCode", required = true)
    protected String investmentCode;
    @XmlElement(name = "Exchange", required = true)
    protected String exchange;
    @XmlElement(name = "HoldingId")
    protected String holdingId;
    @XmlElement(name = "CashBalance")
    protected InvestmentHoldingBalance.CashBalance cashBalance;
    @XmlElement(name = "UnitBalance")
    protected InvestmentHoldingBalance.UnitBalance unitBalance;
    @XmlElement(name = "Income")
    protected InvestmentHoldingBalance.Income income;
    @XmlElement(name = "EPIExtension")
    protected EPIExtension epiExtension;

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
     * Gets the value of the smaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMAId() {
        return smaId;
    }

    /**
     * Sets the value of the smaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMAId(String value) {
        this.smaId = value;
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
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
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
     * Gets the value of the cashBalance property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentHoldingBalance.CashBalance }
     *     
     */
    public InvestmentHoldingBalance.CashBalance getCashBalance() {
        return cashBalance;
    }

    /**
     * Sets the value of the cashBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentHoldingBalance.CashBalance }
     *     
     */
    public void setCashBalance(InvestmentHoldingBalance.CashBalance value) {
        this.cashBalance = value;
    }

    /**
     * Gets the value of the unitBalance property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentHoldingBalance.UnitBalance }
     *     
     */
    public InvestmentHoldingBalance.UnitBalance getUnitBalance() {
        return unitBalance;
    }

    /**
     * Sets the value of the unitBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentHoldingBalance.UnitBalance }
     *     
     */
    public void setUnitBalance(InvestmentHoldingBalance.UnitBalance value) {
        this.unitBalance = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentHoldingBalance.Income }
     *     
     */
    public InvestmentHoldingBalance.Income getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentHoldingBalance.Income }
     *     
     */
    public void setIncome(InvestmentHoldingBalance.Income value) {
        this.income = value;
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
     *         &lt;element name="Settled" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *         &lt;element name="Pending" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *         &lt;element name="AsAtDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "settled",
        "pending",
        "asAtDate"
    })
    public static class CashBalance {

        @XmlElement(name = "Settled", required = true)
        protected MonetaryAmount settled;
        @XmlElement(name = "Pending", required = true)
        protected MonetaryAmount pending;
        @XmlElement(name = "AsAtDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar asAtDate;

        /**
         * Gets the value of the settled property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getSettled() {
            return settled;
        }

        /**
         * Sets the value of the settled property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setSettled(MonetaryAmount value) {
            this.settled = value;
        }

        /**
         * Gets the value of the pending property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getPending() {
            return pending;
        }

        /**
         * Sets the value of the pending property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setPending(MonetaryAmount value) {
            this.pending = value;
        }

        /**
         * Gets the value of the asAtDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAsAtDate() {
            return asAtDate;
        }

        /**
         * Sets the value of the asAtDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAsAtDate(XMLGregorianCalendar value) {
            this.asAtDate = value;
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
     *         &lt;element name="GrossIncome" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *         &lt;element name="NetIncome" type="{http://www.epistandards.com/4.3}MonetaryAmount"/>
     *         &lt;element name="IncomeComponents" type="{http://www.epistandards.com/4.3}IncomeComponents" minOccurs="0"/>
     *         &lt;element name="TaxCredits" type="{http://www.epistandards.com/4.3}IncomeTaxCredits" minOccurs="0"/>
     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="AsAtDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "grossIncome",
        "netIncome",
        "incomeComponents",
        "taxCredits",
        "startDate",
        "asAtDate"
    })
    public static class Income {

        @XmlElement(name = "GrossIncome", required = true)
        protected MonetaryAmount grossIncome;
        @XmlElement(name = "NetIncome", required = true)
        protected MonetaryAmount netIncome;
        @XmlElement(name = "IncomeComponents")
        protected IncomeComponents incomeComponents;
        @XmlElement(name = "TaxCredits")
        protected IncomeTaxCredits taxCredits;
        @XmlElement(name = "StartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(name = "AsAtDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar asAtDate;

        /**
         * Gets the value of the grossIncome property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getGrossIncome() {
            return grossIncome;
        }

        /**
         * Sets the value of the grossIncome property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setGrossIncome(MonetaryAmount value) {
            this.grossIncome = value;
        }

        /**
         * Gets the value of the netIncome property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAmount }
         *     
         */
        public MonetaryAmount getNetIncome() {
            return netIncome;
        }

        /**
         * Sets the value of the netIncome property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAmount }
         *     
         */
        public void setNetIncome(MonetaryAmount value) {
            this.netIncome = value;
        }

        /**
         * Gets the value of the incomeComponents property.
         * 
         * @return
         *     possible object is
         *     {@link IncomeComponents }
         *     
         */
        public IncomeComponents getIncomeComponents() {
            return incomeComponents;
        }

        /**
         * Sets the value of the incomeComponents property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncomeComponents }
         *     
         */
        public void setIncomeComponents(IncomeComponents value) {
            this.incomeComponents = value;
        }

        /**
         * Gets the value of the taxCredits property.
         * 
         * @return
         *     possible object is
         *     {@link IncomeTaxCredits }
         *     
         */
        public IncomeTaxCredits getTaxCredits() {
            return taxCredits;
        }

        /**
         * Sets the value of the taxCredits property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncomeTaxCredits }
         *     
         */
        public void setTaxCredits(IncomeTaxCredits value) {
            this.taxCredits = value;
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
         * Gets the value of the asAtDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAsAtDate() {
            return asAtDate;
        }

        /**
         * Sets the value of the asAtDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAsAtDate(XMLGregorianCalendar value) {
            this.asAtDate = value;
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
     *         &lt;element name="Settled">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="18"/>
     *               &lt;fractionDigits value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Pending">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="18"/>
     *               &lt;fractionDigits value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AsAtDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "settled",
        "pending",
        "asAtDate"
    })
    public static class UnitBalance {

        @XmlElement(name = "Settled", required = true)
        protected BigDecimal settled;
        @XmlElement(name = "Pending", required = true)
        protected BigDecimal pending;
        @XmlElement(name = "AsAtDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar asAtDate;

        /**
         * Gets the value of the settled property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSettled() {
            return settled;
        }

        /**
         * Sets the value of the settled property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSettled(BigDecimal value) {
            this.settled = value;
        }

        /**
         * Gets the value of the pending property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPending() {
            return pending;
        }

        /**
         * Sets the value of the pending property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPending(BigDecimal value) {
            this.pending = value;
        }

        /**
         * Gets the value of the asAtDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAsAtDate() {
            return asAtDate;
        }

        /**
         * Sets the value of the asAtDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAsAtDate(XMLGregorianCalendar value) {
            this.asAtDate = value;
        }

    }

}
