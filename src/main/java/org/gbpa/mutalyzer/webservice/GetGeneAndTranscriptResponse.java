
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeneAndTranscriptResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeneAndTranscriptResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getGeneAndTranscriptResult" type="{http://mutalyzer.nl/2.0/services}TranscriptNameInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeneAndTranscriptResponse", propOrder = {
    "getGeneAndTranscriptResult"
})
public class GetGeneAndTranscriptResponse {

    @XmlElementRef(name = "getGeneAndTranscriptResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<TranscriptNameInfo> getGeneAndTranscriptResult;

    /**
     * Gets the value of the getGeneAndTranscriptResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TranscriptNameInfo }{@code >}
     *     
     */
    public JAXBElement<TranscriptNameInfo> getGetGeneAndTranscriptResult() {
        return getGeneAndTranscriptResult;
    }

    /**
     * Sets the value of the getGeneAndTranscriptResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TranscriptNameInfo }{@code >}
     *     
     */
    public void setGetGeneAndTranscriptResult(JAXBElement<TranscriptNameInfo> value) {
        this.getGeneAndTranscriptResult = value;
    }

}
