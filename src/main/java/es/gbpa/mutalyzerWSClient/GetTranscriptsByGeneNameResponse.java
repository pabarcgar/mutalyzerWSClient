
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTranscriptsByGeneNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTranscriptsByGeneNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTranscriptsByGeneNameResult" type="{http://mutalyzer.nl/2.0/services}stringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTranscriptsByGeneNameResponse", propOrder = {
    "getTranscriptsByGeneNameResult"
})
public class GetTranscriptsByGeneNameResponse {

    @XmlElementRef(name = "getTranscriptsByGeneNameResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> getTranscriptsByGeneNameResult;

    /**
     * Gets the value of the getTranscriptsByGeneNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getGetTranscriptsByGeneNameResult() {
        return getTranscriptsByGeneNameResult;
    }

    /**
     * Sets the value of the getTranscriptsByGeneNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setGetTranscriptsByGeneNameResult(JAXBElement<StringArray> value) {
        this.getTranscriptsByGeneNameResult = value;
    }

}
