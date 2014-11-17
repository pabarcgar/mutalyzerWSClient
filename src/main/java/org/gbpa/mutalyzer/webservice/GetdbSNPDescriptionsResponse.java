
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getdbSNPDescriptionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getdbSNPDescriptionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getdbSNPDescriptionsResult" type="{http://mutalyzer.nl/2.0/services}stringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getdbSNPDescriptionsResponse", propOrder = {
    "getdbSNPDescriptionsResult"
})
public class GetdbSNPDescriptionsResponse {

    @XmlElementRef(name = "getdbSNPDescriptionsResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> getdbSNPDescriptionsResult;

    /**
     * Gets the value of the getdbSNPDescriptionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getGetdbSNPDescriptionsResult() {
        return getdbSNPDescriptionsResult;
    }

    /**
     * Sets the value of the getdbSNPDescriptionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setGetdbSNPDescriptionsResult(JAXBElement<StringArray> value) {
        this.getdbSNPDescriptionsResult = value;
    }

}
