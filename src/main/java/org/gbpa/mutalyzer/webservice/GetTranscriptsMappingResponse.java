
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTranscriptsMappingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTranscriptsMappingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTranscriptsMappingResult" type="{http://mutalyzer.nl/2.0/services}TranscriptMappingInfoArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTranscriptsMappingResponse", propOrder = {
    "getTranscriptsMappingResult"
})
public class GetTranscriptsMappingResponse {

    @XmlElementRef(name = "getTranscriptsMappingResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<TranscriptMappingInfoArray> getTranscriptsMappingResult;

    /**
     * Gets the value of the getTranscriptsMappingResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TranscriptMappingInfoArray }{@code >}
     *     
     */
    public JAXBElement<TranscriptMappingInfoArray> getGetTranscriptsMappingResult() {
        return getTranscriptsMappingResult;
    }

    /**
     * Sets the value of the getTranscriptsMappingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TranscriptMappingInfoArray }{@code >}
     *     
     */
    public void setGetTranscriptsMappingResult(JAXBElement<TranscriptMappingInfoArray> value) {
        this.getTranscriptsMappingResult = value;
    }

}
