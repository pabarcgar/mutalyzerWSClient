
package org.gbpa.mutalyzer.webservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptMappingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranscriptMappingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cds_start" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cds_stop" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stop" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="protein" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gene" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orientation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranscriptMappingInfo", propOrder = {
    "cdsStart",
    "cdsStop",
    "name",
    "stop",
    "start",
    "version",
    "protein",
    "gene",
    "orientation"
})
public class TranscriptMappingInfo {

    @XmlElement(name = "cds_start", required = true)
    protected BigInteger cdsStart;
    @XmlElement(name = "cds_stop", required = true)
    protected BigInteger cdsStop;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigInteger stop;
    @XmlElement(required = true)
    protected BigInteger start;
    @XmlElement(required = true)
    protected BigInteger version;
    @XmlElement(required = true)
    protected String protein;
    @XmlElement(required = true)
    protected String gene;
    @XmlElement(required = true)
    protected String orientation;

    /**
     * Gets the value of the cdsStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCdsStart() {
        return cdsStart;
    }

    /**
     * Sets the value of the cdsStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCdsStart(BigInteger value) {
        this.cdsStart = value;
    }

    /**
     * Gets the value of the cdsStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCdsStop() {
        return cdsStop;
    }

    /**
     * Sets the value of the cdsStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCdsStop(BigInteger value) {
        this.cdsStop = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStop(BigInteger value) {
        this.stop = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the protein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtein(String value) {
        this.protein = value;
    }

    /**
     * Gets the value of the gene property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGene() {
        return gene;
    }

    /**
     * Sets the value of the gene property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGene(String value) {
        this.gene = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

}
