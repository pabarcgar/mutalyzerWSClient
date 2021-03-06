
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitBatchJobResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitBatchJobResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="submitBatchJobResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitBatchJobResponse", propOrder = {
    "submitBatchJobResult"
})
public class SubmitBatchJobResponse {

    @XmlElementRef(name = "submitBatchJobResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> submitBatchJobResult;

    /**
     * Gets the value of the submitBatchJobResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubmitBatchJobResult() {
        return submitBatchJobResult;
    }

    /**
     * Sets the value of the submitBatchJobResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubmitBatchJobResult(JAXBElement<String> value) {
        this.submitBatchJobResult = value;
    }

}
