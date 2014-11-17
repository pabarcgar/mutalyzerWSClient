
package es.gbpa.mutalyzerWSClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranscriptInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exons" type="{http://mutalyzer.nl/2.0/services}ExonInfoArray" minOccurs="0"/>
 *         &lt;element name="cCDSStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromTransStart" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="locusTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromCDSStart" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="gTransStart" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cTransEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cCDSStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromTransEnd" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="gTransEnd" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="proteinTranscript" type="{http://mutalyzer.nl/2.0/services}ProteinTranscript" minOccurs="0"/>
 *         &lt;element name="sortableTransEnd" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromCDSStop" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="gCDSStop" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="gCDSStart" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cTransStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranscriptInformation", propOrder = {
    "linkMethod",
    "exons",
    "ccdsStop",
    "chromTransStart",
    "locusTag",
    "chromCDSStart",
    "gTransStart",
    "id",
    "cTransEnd",
    "ccdsStart",
    "chromTransEnd",
    "gTransEnd",
    "product",
    "proteinTranscript",
    "sortableTransEnd",
    "name",
    "chromCDSStop",
    "gcdsStop",
    "gcdsStart",
    "cTransStart"
})
public class TranscriptInformation {

    @XmlElement(required = true)
    protected String linkMethod;
    @XmlElementRef(name = "exons", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ExonInfoArray> exons;
    @XmlElement(name = "cCDSStop", required = true)
    protected String ccdsStop;
    @XmlElementRef(name = "chromTransStart", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> chromTransStart;
    @XmlElement(required = true)
    protected String locusTag;
    @XmlElementRef(name = "chromCDSStart", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> chromCDSStart;
    @XmlElement(required = true)
    protected BigInteger gTransStart;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String cTransEnd;
    @XmlElement(name = "cCDSStart", required = true)
    protected String ccdsStart;
    @XmlElementRef(name = "chromTransEnd", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> chromTransEnd;
    @XmlElement(required = true)
    protected BigInteger gTransEnd;
    @XmlElement(required = true)
    protected String product;
    @XmlElementRef(name = "proteinTranscript", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ProteinTranscript> proteinTranscript;
    @XmlElement(required = true)
    protected BigInteger sortableTransEnd;
    @XmlElement(required = true)
    protected String name;
    @XmlElementRef(name = "chromCDSStop", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> chromCDSStop;
    @XmlElement(name = "gCDSStop", required = true)
    protected BigInteger gcdsStop;
    @XmlElement(name = "gCDSStart", required = true)
    protected BigInteger gcdsStart;
    @XmlElement(required = true)
    protected String cTransStart;

    /**
     * Gets the value of the linkMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMethod() {
        return linkMethod;
    }

    /**
     * Sets the value of the linkMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMethod(String value) {
        this.linkMethod = value;
    }

    /**
     * Gets the value of the exons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExonInfoArray }{@code >}
     *     
     */
    public JAXBElement<ExonInfoArray> getExons() {
        return exons;
    }

    /**
     * Sets the value of the exons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExonInfoArray }{@code >}
     *     
     */
    public void setExons(JAXBElement<ExonInfoArray> value) {
        this.exons = value;
    }

    /**
     * Gets the value of the ccdsStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDSStop() {
        return ccdsStop;
    }

    /**
     * Sets the value of the ccdsStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDSStop(String value) {
        this.ccdsStop = value;
    }

    /**
     * Gets the value of the chromTransStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getChromTransStart() {
        return chromTransStart;
    }

    /**
     * Sets the value of the chromTransStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setChromTransStart(JAXBElement<BigInteger> value) {
        this.chromTransStart = value;
    }

    /**
     * Gets the value of the locusTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocusTag() {
        return locusTag;
    }

    /**
     * Sets the value of the locusTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocusTag(String value) {
        this.locusTag = value;
    }

    /**
     * Gets the value of the chromCDSStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getChromCDSStart() {
        return chromCDSStart;
    }

    /**
     * Sets the value of the chromCDSStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setChromCDSStart(JAXBElement<BigInteger> value) {
        this.chromCDSStart = value;
    }

    /**
     * Gets the value of the gTransStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGTransStart() {
        return gTransStart;
    }

    /**
     * Sets the value of the gTransStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGTransStart(BigInteger value) {
        this.gTransStart = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the cTransEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTransEnd() {
        return cTransEnd;
    }

    /**
     * Sets the value of the cTransEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTransEnd(String value) {
        this.cTransEnd = value;
    }

    /**
     * Gets the value of the ccdsStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDSStart() {
        return ccdsStart;
    }

    /**
     * Sets the value of the ccdsStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDSStart(String value) {
        this.ccdsStart = value;
    }

    /**
     * Gets the value of the chromTransEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getChromTransEnd() {
        return chromTransEnd;
    }

    /**
     * Sets the value of the chromTransEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setChromTransEnd(JAXBElement<BigInteger> value) {
        this.chromTransEnd = value;
    }

    /**
     * Gets the value of the gTransEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGTransEnd() {
        return gTransEnd;
    }

    /**
     * Sets the value of the gTransEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGTransEnd(BigInteger value) {
        this.gTransEnd = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the proteinTranscript property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProteinTranscript }{@code >}
     *     
     */
    public JAXBElement<ProteinTranscript> getProteinTranscript() {
        return proteinTranscript;
    }

    /**
     * Sets the value of the proteinTranscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProteinTranscript }{@code >}
     *     
     */
    public void setProteinTranscript(JAXBElement<ProteinTranscript> value) {
        this.proteinTranscript = value;
    }

    /**
     * Gets the value of the sortableTransEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSortableTransEnd() {
        return sortableTransEnd;
    }

    /**
     * Sets the value of the sortableTransEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSortableTransEnd(BigInteger value) {
        this.sortableTransEnd = value;
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
     * Gets the value of the chromCDSStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getChromCDSStop() {
        return chromCDSStop;
    }

    /**
     * Sets the value of the chromCDSStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setChromCDSStop(JAXBElement<BigInteger> value) {
        this.chromCDSStop = value;
    }

    /**
     * Gets the value of the gcdsStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGCDSStop() {
        return gcdsStop;
    }

    /**
     * Sets the value of the gcdsStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGCDSStop(BigInteger value) {
        this.gcdsStop = value;
    }

    /**
     * Gets the value of the gcdsStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGCDSStart() {
        return gcdsStart;
    }

    /**
     * Sets the value of the gcdsStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGCDSStart(BigInteger value) {
        this.gcdsStart = value;
    }

    /**
     * Gets the value of the cTransStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTransStart() {
        return cTransStart;
    }

    /**
     * Sets the value of the cTransStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTransStart(String value) {
        this.cTransStart = value;
    }

}
