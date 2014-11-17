
package org.gbpa.mutalyzer.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RawVariantArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawVariantArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawVariant" type="{http://mutalyzer.nl/2.0/services}RawVariant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawVariantArray", propOrder = {
    "rawVariant"
})
public class RawVariantArray {

    @XmlElement(name = "RawVariant", nillable = true)
    protected List<RawVariant> rawVariant;

    /**
     * Gets the value of the rawVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rawVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRawVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RawVariant }
     * 
     * 
     */
    public List<RawVariant> getRawVariant() {
        if (rawVariant == null) {
            rawVariant = new ArrayList<RawVariant>();
        }
        return this.rawVariant;
    }

}
