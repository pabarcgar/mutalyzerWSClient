
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoResult" type="{http://mutalyzer.nl/2.0/services}InfoOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoResponse", propOrder = {
    "infoResult"
})
public class InfoResponse {

    @XmlElementRef(name = "infoResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<InfoOutput> infoResult;

    /**
     * Gets the value of the infoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfoOutput }{@code >}
     *     
     */
    public JAXBElement<InfoOutput> getInfoResult() {
        return infoResult;
    }

    /**
     * Sets the value of the infoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfoOutput }{@code >}
     *     
     */
    public void setInfoResult(JAXBElement<InfoOutput> value) {
        this.infoResult = value;
    }

}
