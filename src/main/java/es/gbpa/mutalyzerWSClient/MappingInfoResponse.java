
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mappingInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mappingInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mappingInfoResult" type="{http://mutalyzer.nl/2.0/services}Mapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mappingInfoResponse", propOrder = {
    "mappingInfoResult"
})
public class MappingInfoResponse {

    @XmlElementRef(name = "mappingInfoResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Mapping> mappingInfoResult;

    /**
     * Gets the value of the mappingInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Mapping }{@code >}
     *     
     */
    public JAXBElement<Mapping> getMappingInfoResult() {
        return mappingInfoResult;
    }

    /**
     * Sets the value of the mappingInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Mapping }{@code >}
     *     
     */
    public void setMappingInfoResult(JAXBElement<Mapping> value) {
        this.mappingInfoResult = value;
    }

}
