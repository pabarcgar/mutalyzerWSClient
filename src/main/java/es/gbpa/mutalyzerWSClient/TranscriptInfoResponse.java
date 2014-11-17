
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transcriptInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transcriptInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transcriptInfoResult" type="{http://mutalyzer.nl/2.0/services}Transcript" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transcriptInfoResponse", propOrder = {
    "transcriptInfoResult"
})
public class TranscriptInfoResponse {

    @XmlElementRef(name = "transcriptInfoResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Transcript> transcriptInfoResult;

    /**
     * Gets the value of the transcriptInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Transcript }{@code >}
     *     
     */
    public JAXBElement<Transcript> getTranscriptInfoResult() {
        return transcriptInfoResult;
    }

    /**
     * Sets the value of the transcriptInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Transcript }{@code >}
     *     
     */
    public void setTranscriptInfoResult(JAXBElement<Transcript> value) {
        this.transcriptInfoResult = value;
    }

}
