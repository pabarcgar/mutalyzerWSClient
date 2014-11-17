
package es.gbpa.mutalyzerWSClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MutalyzerOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutalyzerOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genomicDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceGi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rawVariants" type="{http://mutalyzer.nl/2.0/services}RawVariantArray" minOccurs="0"/>
 *         &lt;element name="origMRNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altProtein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="exons" type="{http://mutalyzer.nl/2.0/services}ExonInfoArray" minOccurs="0"/>
 *         &lt;element name="sourceAccession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mutated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mutatedMRNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origCDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warnings" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="molecule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newCDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chromDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newProtein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="proteinDescriptions" type="{http://mutalyzer.nl/2.0/services}stringArray" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://mutalyzer.nl/2.0/services}SoapMessageArray" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transcriptDescriptions" type="{http://mutalyzer.nl/2.0/services}stringArray" minOccurs="0"/>
 *         &lt;element name="origProtein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="original" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutalyzerOutput", propOrder = {
    "referenceId",
    "genomicDescription",
    "sourceGi",
    "rawVariants",
    "origMRNA",
    "altProtein",
    "errors",
    "exons",
    "sourceAccession",
    "sourceVersion",
    "mutated",
    "mutatedMRNA",
    "origCDS",
    "warnings",
    "molecule",
    "newCDS",
    "chromDescription",
    "newProtein",
    "sourceId",
    "proteinDescriptions",
    "messages",
    "summary",
    "transcriptDescriptions",
    "origProtein",
    "original"
})
public class MutalyzerOutput {

    @XmlElement(required = true)
    protected String referenceId;
    @XmlElementRef(name = "genomicDescription", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> genomicDescription;
    @XmlElementRef(name = "sourceGi", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceGi;
    @XmlElementRef(name = "rawVariants", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<RawVariantArray> rawVariants;
    @XmlElementRef(name = "origMRNA", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origMRNA;
    @XmlElementRef(name = "altProtein", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> altProtein;
    @XmlElementRef(name = "errors", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> errors;
    @XmlElementRef(name = "exons", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ExonInfoArray> exons;
    @XmlElementRef(name = "sourceAccession", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceAccession;
    @XmlElementRef(name = "sourceVersion", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceVersion;
    @XmlElementRef(name = "mutated", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mutated;
    @XmlElementRef(name = "mutatedMRNA", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mutatedMRNA;
    @XmlElementRef(name = "origCDS", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origCDS;
    @XmlElementRef(name = "warnings", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> warnings;
    @XmlElement(required = true)
    protected String molecule;
    @XmlElementRef(name = "newCDS", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newCDS;
    @XmlElementRef(name = "chromDescription", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chromDescription;
    @XmlElementRef(name = "newProtein", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newProtein;
    @XmlElement(required = true)
    protected String sourceId;
    @XmlElementRef(name = "proteinDescriptions", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> proteinDescriptions;
    @XmlElementRef(name = "messages", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<SoapMessageArray> messages;
    @XmlElementRef(name = "summary", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summary;
    @XmlElementRef(name = "transcriptDescriptions", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> transcriptDescriptions;
    @XmlElementRef(name = "origProtein", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origProtein;
    @XmlElementRef(name = "original", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> original;

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the genomicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGenomicDescription() {
        return genomicDescription;
    }

    /**
     * Sets the value of the genomicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGenomicDescription(JAXBElement<String> value) {
        this.genomicDescription = value;
    }

    /**
     * Gets the value of the sourceGi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceGi() {
        return sourceGi;
    }

    /**
     * Sets the value of the sourceGi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceGi(JAXBElement<String> value) {
        this.sourceGi = value;
    }

    /**
     * Gets the value of the rawVariants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RawVariantArray }{@code >}
     *     
     */
    public JAXBElement<RawVariantArray> getRawVariants() {
        return rawVariants;
    }

    /**
     * Sets the value of the rawVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RawVariantArray }{@code >}
     *     
     */
    public void setRawVariants(JAXBElement<RawVariantArray> value) {
        this.rawVariants = value;
    }

    /**
     * Gets the value of the origMRNA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigMRNA() {
        return origMRNA;
    }

    /**
     * Sets the value of the origMRNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigMRNA(JAXBElement<String> value) {
        this.origMRNA = value;
    }

    /**
     * Gets the value of the altProtein property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltProtein() {
        return altProtein;
    }

    /**
     * Sets the value of the altProtein property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltProtein(JAXBElement<String> value) {
        this.altProtein = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setErrors(JAXBElement<BigInteger> value) {
        this.errors = value;
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
     * Gets the value of the sourceAccession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceAccession() {
        return sourceAccession;
    }

    /**
     * Sets the value of the sourceAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceAccession(JAXBElement<String> value) {
        this.sourceAccession = value;
    }

    /**
     * Gets the value of the sourceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceVersion() {
        return sourceVersion;
    }

    /**
     * Sets the value of the sourceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceVersion(JAXBElement<String> value) {
        this.sourceVersion = value;
    }

    /**
     * Gets the value of the mutated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMutated() {
        return mutated;
    }

    /**
     * Sets the value of the mutated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMutated(JAXBElement<String> value) {
        this.mutated = value;
    }

    /**
     * Gets the value of the mutatedMRNA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMutatedMRNA() {
        return mutatedMRNA;
    }

    /**
     * Sets the value of the mutatedMRNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMutatedMRNA(JAXBElement<String> value) {
        this.mutatedMRNA = value;
    }

    /**
     * Gets the value of the origCDS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigCDS() {
        return origCDS;
    }

    /**
     * Sets the value of the origCDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigCDS(JAXBElement<String> value) {
        this.origCDS = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setWarnings(JAXBElement<BigInteger> value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the molecule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMolecule() {
        return molecule;
    }

    /**
     * Sets the value of the molecule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMolecule(String value) {
        this.molecule = value;
    }

    /**
     * Gets the value of the newCDS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewCDS() {
        return newCDS;
    }

    /**
     * Sets the value of the newCDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewCDS(JAXBElement<String> value) {
        this.newCDS = value;
    }

    /**
     * Gets the value of the chromDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChromDescription() {
        return chromDescription;
    }

    /**
     * Sets the value of the chromDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChromDescription(JAXBElement<String> value) {
        this.chromDescription = value;
    }

    /**
     * Gets the value of the newProtein property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewProtein() {
        return newProtein;
    }

    /**
     * Sets the value of the newProtein property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewProtein(JAXBElement<String> value) {
        this.newProtein = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the proteinDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getProteinDescriptions() {
        return proteinDescriptions;
    }

    /**
     * Sets the value of the proteinDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setProteinDescriptions(JAXBElement<StringArray> value) {
        this.proteinDescriptions = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SoapMessageArray }{@code >}
     *     
     */
    public JAXBElement<SoapMessageArray> getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SoapMessageArray }{@code >}
     *     
     */
    public void setMessages(JAXBElement<SoapMessageArray> value) {
        this.messages = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = value;
    }

    /**
     * Gets the value of the transcriptDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getTranscriptDescriptions() {
        return transcriptDescriptions;
    }

    /**
     * Sets the value of the transcriptDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setTranscriptDescriptions(JAXBElement<StringArray> value) {
        this.transcriptDescriptions = value;
    }

    /**
     * Gets the value of the origProtein property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigProtein() {
        return origProtein;
    }

    /**
     * Sets the value of the origProtein property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigProtein(JAXBElement<String> value) {
        this.origProtein = value;
    }

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginal(JAXBElement<String> value) {
        this.original = value;
    }

}
