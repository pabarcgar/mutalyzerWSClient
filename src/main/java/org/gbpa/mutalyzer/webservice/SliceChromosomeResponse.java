
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sliceChromosomeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sliceChromosomeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sliceChromosomeResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sliceChromosomeResponse", propOrder = {
    "sliceChromosomeResult"
})
public class SliceChromosomeResponse {

    @XmlElement(required = true)
    protected String sliceChromosomeResult;

    /**
     * Gets the value of the sliceChromosomeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSliceChromosomeResult() {
        return sliceChromosomeResult;
    }

    /**
     * Sets the value of the sliceChromosomeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSliceChromosomeResult(String value) {
        this.sliceChromosomeResult = value;
    }

}
