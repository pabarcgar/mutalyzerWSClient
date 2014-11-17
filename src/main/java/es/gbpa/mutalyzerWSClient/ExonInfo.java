
package es.gbpa.mutalyzerWSClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromStop" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="gStop" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gStart" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromStart" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExonInfo", propOrder = {
    "chromStop",
    "gStop",
    "cStart",
    "gStart",
    "cStop",
    "chromStart"
})
public class ExonInfo {

    @XmlElementRef(name = "chromStop", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> chromStop;
    @XmlElement(required = true)
    protected BigInteger gStop;
    @XmlElement(required = true)
    protected String cStart;
    @XmlElement(required = true)
    protected BigInteger gStart;
    @XmlElement(required = true)
    protected String cStop;
    @XmlElementRef(name = "chromStart", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> chromStart;

    /**
     * Gets the value of the chromStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getChromStop() {
        return chromStop;
    }

    /**
     * Sets the value of the chromStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setChromStop(JAXBElement<BigInteger> value) {
        this.chromStop = value;
    }

    /**
     * Gets the value of the gStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGStop() {
        return gStop;
    }

    /**
     * Sets the value of the gStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGStop(BigInteger value) {
        this.gStop = value;
    }

    /**
     * Gets the value of the cStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStart() {
        return cStart;
    }

    /**
     * Sets the value of the cStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStart(String value) {
        this.cStart = value;
    }

    /**
     * Gets the value of the gStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGStart() {
        return gStart;
    }

    /**
     * Sets the value of the gStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGStart(BigInteger value) {
        this.gStart = value;
    }

    /**
     * Gets the value of the cStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStop() {
        return cStop;
    }

    /**
     * Sets the value of the cStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStop(String value) {
        this.cStop = value;
    }

    /**
     * Gets the value of the chromStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getChromStart() {
        return chromStart;
    }

    /**
     * Sets the value of the chromStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setChromStart(JAXBElement<BigInteger> value) {
        this.chromStart = value;
    }

}
