
package es.gbpa.mutalyzerWSClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptInfoArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranscriptInfoArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TranscriptInformation" type="{http://mutalyzer.nl/2.0/services}TranscriptInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranscriptInfoArray", propOrder = {
    "transcriptInformation"
})
public class TranscriptInfoArray {

    @XmlElement(name = "TranscriptInformation", nillable = true)
    protected List<TranscriptInformation> transcriptInformation;

    /**
     * Gets the value of the transcriptInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranscriptInformation }
     * 
     * 
     */
    public List<TranscriptInformation> getTranscriptInformation() {
        if (transcriptInformation == null) {
            transcriptInformation = new ArrayList<TranscriptInformation>();
        }
        return this.transcriptInformation;
    }

}
