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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="4">
 *           &lt;element name="Addresses">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Address" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.epistandards.com/4.3}Address">
 *                             &lt;sequence>
 *                               &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;/sequence>
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PhoneNumbers">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="PhoneNumber" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.epistandards.com/4.3}PhoneNumber">
 *                             &lt;sequence>
 *                               &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;/sequence>
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="EmailAddresses">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="EmailAddress" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.epistandards.com/4.3}EmailAddress">
 *                             &lt;sequence>
 *                               &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;/sequence>
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="WebAddresses">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="WebAddress" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.epistandards.com/4.3}WebAddress">
 *                             &lt;sequence>
 *                               &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;/sequence>
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="PreferredContactMethod" type="{http://www.epistandards.com/4.3}ContactMethod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetails", propOrder = {
    "addressesOrPhoneNumbersOrEmailAddresses",
    "preferredContactMethod"
})
public class ContactDetails {

    @XmlElements({
        @XmlElement(name = "Addresses", type = ContactDetails.Addresses.class),
        @XmlElement(name = "PhoneNumbers", type = ContactDetails.PhoneNumbers.class),
        @XmlElement(name = "EmailAddresses", type = ContactDetails.EmailAddresses.class),
        @XmlElement(name = "WebAddresses", type = ContactDetails.WebAddresses.class)
    })
    protected List<Object> addressesOrPhoneNumbersOrEmailAddresses;
    @XmlElement(name = "PreferredContactMethod", required = true)
    protected ContactMethod preferredContactMethod;

    /**
     * Gets the value of the addressesOrPhoneNumbersOrEmailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressesOrPhoneNumbersOrEmailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressesOrPhoneNumbersOrEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetails.Addresses }
     * {@link ContactDetails.PhoneNumbers }
     * {@link ContactDetails.EmailAddresses }
     * {@link ContactDetails.WebAddresses }
     * 
     * 
     */
    public List<Object> getAddressesOrPhoneNumbersOrEmailAddresses() {
        if (addressesOrPhoneNumbersOrEmailAddresses == null) {
            addressesOrPhoneNumbersOrEmailAddresses = new ArrayList<Object>();
        }
        return this.addressesOrPhoneNumbersOrEmailAddresses;
    }

    /**
     * Gets the value of the preferredContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setPreferredContactMethod(ContactMethod value) {
        this.preferredContactMethod = value;
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
     *         &lt;element name="Address" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.epistandards.com/4.3}Address">
     *                 &lt;sequence>
     *                   &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address", required = true)
        protected List<ContactDetails.Addresses.Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactDetails.Addresses.Address }
         * 
         * 
         */
        public List<ContactDetails.Addresses.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<ContactDetails.Addresses.Address>();
            }
            return this.address;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.epistandards.com/4.3}Address">
         *       &lt;sequence>
         *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "preferred"
        })
        public static class Address
            extends com.gbst.customdatasource.xplan.domain.Address
        {

            @XmlElement(name = "Preferred")
            protected boolean preferred;

            /**
             * Gets the value of the preferred property.
             * 
             */
            public boolean isPreferred() {
                return preferred;
            }

            /**
             * Sets the value of the preferred property.
             * 
             */
            public void setPreferred(boolean value) {
                this.preferred = value;
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
     *         &lt;element name="EmailAddress" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.epistandards.com/4.3}EmailAddress">
     *                 &lt;sequence>
     *                   &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "emailAddress"
    })
    public static class EmailAddresses {

        @XmlElement(name = "EmailAddress", required = true)
        protected List<ContactDetails.EmailAddresses.EmailAddress> emailAddress;

        /**
         * Gets the value of the emailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactDetails.EmailAddresses.EmailAddress }
         * 
         * 
         */
        public List<ContactDetails.EmailAddresses.EmailAddress> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<ContactDetails.EmailAddresses.EmailAddress>();
            }
            return this.emailAddress;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.epistandards.com/4.3}EmailAddress">
         *       &lt;sequence>
         *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "preferred"
        })
        public static class EmailAddress
            extends com.gbst.customdatasource.xplan.domain.EmailAddress
        {

            @XmlElement(name = "Preferred")
            protected boolean preferred;

            /**
             * Gets the value of the preferred property.
             * 
             */
            public boolean isPreferred() {
                return preferred;
            }

            /**
             * Sets the value of the preferred property.
             * 
             */
            public void setPreferred(boolean value) {
                this.preferred = value;
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
     *         &lt;element name="PhoneNumber" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.epistandards.com/4.3}PhoneNumber">
     *                 &lt;sequence>
     *                   &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "phoneNumber"
    })
    public static class PhoneNumbers {

        @XmlElement(name = "PhoneNumber", required = true)
        protected List<ContactDetails.PhoneNumbers.PhoneNumber> phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactDetails.PhoneNumbers.PhoneNumber }
         * 
         * 
         */
        public List<ContactDetails.PhoneNumbers.PhoneNumber> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<ContactDetails.PhoneNumbers.PhoneNumber>();
            }
            return this.phoneNumber;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.epistandards.com/4.3}PhoneNumber">
         *       &lt;sequence>
         *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "preferred"
        })
        public static class PhoneNumber
            extends com.gbst.customdatasource.xplan.domain.PhoneNumber
        {

            @XmlElement(name = "Preferred")
            protected boolean preferred;

            /**
             * Gets the value of the preferred property.
             * 
             */
            public boolean isPreferred() {
                return preferred;
            }

            /**
             * Sets the value of the preferred property.
             * 
             */
            public void setPreferred(boolean value) {
                this.preferred = value;
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
     *         &lt;element name="WebAddress" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.epistandards.com/4.3}WebAddress">
     *                 &lt;sequence>
     *                   &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "webAddress"
    })
    public static class WebAddresses {

        @XmlElement(name = "WebAddress", required = true)
        protected List<ContactDetails.WebAddresses.WebAddress> webAddress;

        /**
         * Gets the value of the webAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the webAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWebAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactDetails.WebAddresses.WebAddress }
         * 
         * 
         */
        public List<ContactDetails.WebAddresses.WebAddress> getWebAddress() {
            if (webAddress == null) {
                webAddress = new ArrayList<ContactDetails.WebAddresses.WebAddress>();
            }
            return this.webAddress;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.epistandards.com/4.3}WebAddress">
         *       &lt;sequence>
         *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "preferred"
        })
        public static class WebAddress
            extends com.gbst.customdatasource.xplan.domain.WebAddress
        {

            @XmlElement(name = "Preferred")
            protected boolean preferred;

            /**
             * Gets the value of the preferred property.
             * 
             */
            public boolean isPreferred() {
                return preferred;
            }

            /**
             * Sets the value of the preferred property.
             * 
             */
            public void setPreferred(boolean value) {
                this.preferred = value;
            }

        }

    }

}
