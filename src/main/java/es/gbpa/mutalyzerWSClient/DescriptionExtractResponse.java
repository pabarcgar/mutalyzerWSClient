
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for descriptionExtractResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="descriptionExtractResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptionExtractResult" type="{http://mutalyzer.nl/2.0/services}Allele" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descriptionExtractResponse", propOrder = {
    "descriptionExtractResult"
})
public class DescriptionExtractResponse {

    @XmlElementRef(name = "descriptionExtractResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Allele> descriptionExtractResult;

    /**
     * Gets the value of the descriptionExtractResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Allele }{@code >}
     *     
     */
    public JAXBElement<Allele> getDescriptionExtractResult() {
        return descriptionExtractResult;
    }

    /**
     * Sets the value of the descriptionExtractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Allele }{@code >}
     *     
     */
    public void setDescriptionExtractResult(JAXBElement<Allele> value) {
        this.descriptionExtractResult = value;
    }

}
