
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getdbSNPDescriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getdbSNPDescriptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rs_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getdbSNPDescriptions", propOrder = {
    "rsId"
})
public class GetdbSNPDescriptions {

    @XmlElement(name = "rs_id", required = true)
    protected String rsId;

    /**
     * Gets the value of the rsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsId() {
        return rsId;
    }

    /**
     * Sets the value of the rsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsId(String value) {
        this.rsId = value;
    }

}
