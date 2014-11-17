
package es.gbpa.mutalyzerWSClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTranscriptsMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTranscriptsMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="build" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pos1" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="pos2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTranscriptsMapping", propOrder = {
    "build",
    "chrom",
    "pos1",
    "pos2",
    "method"
})
public class GetTranscriptsMapping {

    @XmlElement(required = true)
    protected String build;
    @XmlElement(required = true)
    protected String chrom;
    @XmlElement(required = true)
    protected BigInteger pos1;
    @XmlElement(required = true)
    protected BigInteger pos2;
    @XmlElement(required = true)
    protected BigInteger method;

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the chrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrom() {
        return chrom;
    }

    /**
     * Sets the value of the chrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrom(String value) {
        this.chrom = value;
    }

    /**
     * Gets the value of the pos1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPos1() {
        return pos1;
    }

    /**
     * Sets the value of the pos1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPos1(BigInteger value) {
        this.pos1 = value;
    }

    /**
     * Gets the value of the pos2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPos2() {
        return pos2;
    }

    /**
     * Sets the value of the pos2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPos2(BigInteger value) {
        this.pos2 = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMethod(BigInteger value) {
        this.method = value;
    }

}
