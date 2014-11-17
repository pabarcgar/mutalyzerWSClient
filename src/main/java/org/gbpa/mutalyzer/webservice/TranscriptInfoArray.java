
package org.gbpa.mutalyzer.webservice;

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
 *         &lt;element name="TranscriptInfo" type="{http://mutalyzer.nl/2.0/services}TranscriptInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "transcriptInfo"
})
public class TranscriptInfoArray {

    @XmlElement(name = "TranscriptInfo", nillable = true)
    protected List<TranscriptInfo> transcriptInfo;

    /**
     * Gets the value of the transcriptInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranscriptInfo }
     * 
     * 
     */
    public List<TranscriptInfo> getTranscriptInfo() {
        if (transcriptInfo == null) {
            transcriptInfo = new ArrayList<TranscriptInfo>();
        }
        return this.transcriptInfo;
    }

}
