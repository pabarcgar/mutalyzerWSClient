
package org.gbpa.mutalyzer.webservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sliceChromosome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sliceChromosome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromAccNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="orientation" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sliceChromosome", propOrder = {
    "chromAccNo",
    "start",
    "end",
    "orientation"
})
public class SliceChromosome {

    @XmlElement(required = true)
    protected String chromAccNo;
    @XmlElement(required = true)
    protected BigInteger start;
    @XmlElement(required = true)
    protected BigInteger end;
    @XmlElement(required = true)
    protected BigInteger orientation;

    /**
     * Gets the value of the chromAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromAccNo() {
        return chromAccNo;
    }

    /**
     * Sets the value of the chromAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromAccNo(String value) {
        this.chromAccNo = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnd(BigInteger value) {
        this.end = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrientation(BigInteger value) {
        this.orientation = value;
    }

}
