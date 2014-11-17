
package org.gbpa.mutalyzer.webservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sliceChromosomeByGene complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sliceChromosomeByGene">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geneSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organism" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="upStream" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="downStream" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sliceChromosomeByGene", propOrder = {
    "geneSymbol",
    "organism",
    "upStream",
    "downStream"
})
public class SliceChromosomeByGene {

    @XmlElement(required = true)
    protected String geneSymbol;
    @XmlElement(required = true)
    protected String organism;
    @XmlElement(required = true)
    protected BigInteger upStream;
    @XmlElement(required = true)
    protected BigInteger downStream;

    /**
     * Gets the value of the geneSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneSymbol() {
        return geneSymbol;
    }

    /**
     * Sets the value of the geneSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneSymbol(String value) {
        this.geneSymbol = value;
    }

    /**
     * Gets the value of the organism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganism() {
        return organism;
    }

    /**
     * Sets the value of the organism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganism(String value) {
        this.organism = value;
    }

    /**
     * Gets the value of the upStream property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpStream() {
        return upStream;
    }

    /**
     * Sets the value of the upStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpStream(BigInteger value) {
        this.upStream = value;
    }

    /**
     * Gets the value of the downStream property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDownStream() {
        return downStream;
    }

    /**
     * Sets the value of the downStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDownStream(BigInteger value) {
        this.downStream = value;
    }

}
