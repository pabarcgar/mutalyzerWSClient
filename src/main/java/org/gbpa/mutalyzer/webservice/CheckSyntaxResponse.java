
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkSyntaxResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkSyntaxResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkSyntaxResult" type="{http://mutalyzer.nl/2.0/services}CheckSyntaxOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkSyntaxResponse", propOrder = {
    "checkSyntaxResult"
})
public class CheckSyntaxResponse {

    @XmlElementRef(name = "checkSyntaxResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<CheckSyntaxOutput> checkSyntaxResult;

    /**
     * Gets the value of the checkSyntaxResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CheckSyntaxOutput }{@code >}
     *     
     */
    public JAXBElement<CheckSyntaxOutput> getCheckSyntaxResult() {
        return checkSyntaxResult;
    }

    /**
     * Sets the value of the checkSyntaxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CheckSyntaxOutput }{@code >}
     *     
     */
    public void setCheckSyntaxResult(JAXBElement<CheckSyntaxOutput> value) {
        this.checkSyntaxResult = value;
    }

}
