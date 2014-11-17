
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numberConversionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numberConversionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberConversionResult" type="{http://mutalyzer.nl/2.0/services}stringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numberConversionResponse", propOrder = {
    "numberConversionResult"
})
public class NumberConversionResponse {

    @XmlElementRef(name = "numberConversionResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> numberConversionResult;

    /**
     * Gets the value of the numberConversionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getNumberConversionResult() {
        return numberConversionResult;
    }

    /**
     * Sets the value of the numberConversionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setNumberConversionResult(JAXBElement<StringArray> value) {
        this.numberConversionResult = value;
    }

}
