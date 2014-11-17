
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for descriptionExtract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="descriptionExtract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descriptionExtract", propOrder = {
    "reference",
    "observed"
})
public class DescriptionExtract {

    @XmlElement(required = true)
    protected String reference;
    @XmlElement(required = true)
    protected String observed;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the observed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserved() {
        return observed;
    }

    /**
     * Sets the value of the observed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserved(String value) {
        this.observed = value;
    }

}
