
package es.gbpa.mutalyzerWSClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RawVar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawVar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startAA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inserted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="start_offset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="hgvsLength" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="hgvs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="end_offset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="endAA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="shift" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawVar", propOrder = {
    "dna",
    "startAA",
    "deleted",
    "type",
    "inserted",
    "term",
    "startOffset",
    "start",
    "hgvsLength",
    "hgvs",
    "endOffset",
    "endAA",
    "end",
    "shift"
})
@XmlSeeAlso({
    DescribeRawVar.class
})
public class RawVar {

    @XmlElement(name = "DNA")
    protected boolean dna;
    @XmlElement(required = true)
    protected String startAA;
    @XmlElement(required = true)
    protected String deleted;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String inserted;
    @XmlElement(required = true)
    protected BigInteger term;
    @XmlElement(name = "start_offset", required = true)
    protected BigInteger startOffset;
    @XmlElement(required = true)
    protected BigInteger start;
    @XmlElement(required = true)
    protected BigInteger hgvsLength;
    @XmlElement(required = true)
    protected String hgvs;
    @XmlElement(name = "end_offset", required = true)
    protected BigInteger endOffset;
    @XmlElement(required = true)
    protected String endAA;
    @XmlElement(required = true)
    protected BigInteger end;
    @XmlElement(required = true)
    protected BigInteger shift;

    /**
     * Gets the value of the dna property.
     * 
     */
    public boolean isDNA() {
        return dna;
    }

    /**
     * Sets the value of the dna property.
     * 
     */
    public void setDNA(boolean value) {
        this.dna = value;
    }

    /**
     * Gets the value of the startAA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAA() {
        return startAA;
    }

    /**
     * Sets the value of the startAA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAA(String value) {
        this.startAA = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleted(String value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the inserted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInserted() {
        return inserted;
    }

    /**
     * Sets the value of the inserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInserted(String value) {
        this.inserted = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTerm(BigInteger value) {
        this.term = value;
    }

    /**
     * Gets the value of the startOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartOffset() {
        return startOffset;
    }

    /**
     * Sets the value of the startOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartOffset(BigInteger value) {
        this.startOffset = value;
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
     * Gets the value of the hgvsLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHgvsLength() {
        return hgvsLength;
    }

    /**
     * Sets the value of the hgvsLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHgvsLength(BigInteger value) {
        this.hgvsLength = value;
    }

    /**
     * Gets the value of the hgvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHgvs() {
        return hgvs;
    }

    /**
     * Sets the value of the hgvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHgvs(String value) {
        this.hgvs = value;
    }

    /**
     * Gets the value of the endOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndOffset() {
        return endOffset;
    }

    /**
     * Sets the value of the endOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndOffset(BigInteger value) {
        this.endOffset = value;
    }

    /**
     * Gets the value of the endAA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAA() {
        return endAA;
    }

    /**
     * Sets the value of the endAA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAA(String value) {
        this.endAA = value;
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
     * Gets the value of the shift property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShift() {
        return shift;
    }

    /**
     * Sets the value of the shift property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShift(BigInteger value) {
        this.shift = value;
    }

}
