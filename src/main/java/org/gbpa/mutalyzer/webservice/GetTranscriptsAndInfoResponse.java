
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTranscriptsAndInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTranscriptsAndInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTranscriptsAndInfoResult" type="{http://mutalyzer.nl/2.0/services}TranscriptInfoArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTranscriptsAndInfoResponse", propOrder = {
    "getTranscriptsAndInfoResult"
})
public class GetTranscriptsAndInfoResponse {

    @XmlElementRef(name = "getTranscriptsAndInfoResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<TranscriptInfoArray> getTranscriptsAndInfoResult;

    /**
     * Gets the value of the getTranscriptsAndInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TranscriptInfoArray }{@code >}
     *     
     */
    public JAXBElement<TranscriptInfoArray> getGetTranscriptsAndInfoResult() {
        return getTranscriptsAndInfoResult;
    }

    /**
     * Sets the value of the getTranscriptsAndInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TranscriptInfoArray }{@code >}
     *     
     */
    public void setGetTranscriptsAndInfoResult(JAXBElement<TranscriptInfoArray> value) {
        this.getTranscriptsAndInfoResult = value;
    }

}
