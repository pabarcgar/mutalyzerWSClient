
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runMutalyzerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runMutalyzerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runMutalyzerResult" type="{http://mutalyzer.nl/2.0/services}MutalyzerOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runMutalyzerResponse", propOrder = {
    "runMutalyzerResult"
})
public class RunMutalyzerResponse {

    @XmlElementRef(name = "runMutalyzerResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<MutalyzerOutput> runMutalyzerResult;

    /**
     * Gets the value of the runMutalyzerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MutalyzerOutput }{@code >}
     *     
     */
    public JAXBElement<MutalyzerOutput> getRunMutalyzerResult() {
        return runMutalyzerResult;
    }

    /**
     * Sets the value of the runMutalyzerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MutalyzerOutput }{@code >}
     *     
     */
    public void setRunMutalyzerResult(JAXBElement<MutalyzerOutput> value) {
        this.runMutalyzerResult = value;
    }

}
