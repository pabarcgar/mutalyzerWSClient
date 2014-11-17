
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sliceChromosomeByGeneResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sliceChromosomeByGeneResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sliceChromosomeByGeneResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sliceChromosomeByGeneResponse", propOrder = {
    "sliceChromosomeByGeneResult"
})
public class SliceChromosomeByGeneResponse {

    @XmlElement(required = true)
    protected String sliceChromosomeByGeneResult;

    /**
     * Gets the value of the sliceChromosomeByGeneResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSliceChromosomeByGeneResult() {
        return sliceChromosomeByGeneResult;
    }

    /**
     * Sets the value of the sliceChromosomeByGeneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSliceChromosomeByGeneResult(String value) {
        this.sliceChromosomeByGeneResult = value;
    }

}
