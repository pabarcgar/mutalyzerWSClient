
package es.gbpa.mutalyzerWSClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptMappingInfoArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranscriptMappingInfoArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TranscriptMappingInfo" type="{http://mutalyzer.nl/2.0/services}TranscriptMappingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranscriptMappingInfoArray", propOrder = {
    "transcriptMappingInfo"
})
public class TranscriptMappingInfoArray {

    @XmlElement(name = "TranscriptMappingInfo", nillable = true)
    protected List<TranscriptMappingInfo> transcriptMappingInfo;

    /**
     * Gets the value of the transcriptMappingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptMappingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptMappingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranscriptMappingInfo }
     * 
     * 
     */
    public List<TranscriptMappingInfo> getTranscriptMappingInfo() {
        if (transcriptMappingInfo == null) {
            transcriptMappingInfo = new ArrayList<TranscriptMappingInfo>();
        }
        return this.transcriptMappingInfo;
    }

}
