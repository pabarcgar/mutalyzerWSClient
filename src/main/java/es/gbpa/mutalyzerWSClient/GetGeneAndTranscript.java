
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeneAndTranscript complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeneAndTranscript">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genomicReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transcriptReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeneAndTranscript", propOrder = {
    "genomicReference",
    "transcriptReference"
})
public class GetGeneAndTranscript {

    @XmlElement(required = true)
    protected String genomicReference;
    @XmlElement(required = true)
    protected String transcriptReference;

    /**
     * Gets the value of the genomicReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenomicReference() {
        return genomicReference;
    }

    /**
     * Sets the value of the genomicReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenomicReference(String value) {
        this.genomicReference = value;
    }

    /**
     * Gets the value of the transcriptReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscriptReference() {
        return transcriptReference;
    }

    /**
     * Sets the value of the transcriptReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscriptReference(String value) {
        this.transcriptReference = value;
    }

}
