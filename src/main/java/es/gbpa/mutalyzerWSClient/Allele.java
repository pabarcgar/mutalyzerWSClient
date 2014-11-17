
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Allele complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Allele">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allele" type="{http://mutalyzer.nl/2.0/services}RawVarArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allele", propOrder = {
    "description",
    "allele"
})
public class Allele {

    @XmlElement(required = true)
    protected String description;
    @XmlElementRef(name = "allele", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<RawVarArray> allele;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the allele property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RawVarArray }{@code >}
     *     
     */
    public JAXBElement<RawVarArray> getAllele() {
        return allele;
    }

    /**
     * Sets the value of the allele property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RawVarArray }{@code >}
     *     
     */
    public void setAllele(JAXBElement<RawVarArray> value) {
        this.allele = value;
    }

}
