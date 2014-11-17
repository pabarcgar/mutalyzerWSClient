
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chromAccessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chromAccessionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromAccessionResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chromAccessionResponse", propOrder = {
    "chromAccessionResult"
})
public class ChromAccessionResponse {

    @XmlElement(required = true)
    protected String chromAccessionResult;

    /**
     * Gets the value of the chromAccessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromAccessionResult() {
        return chromAccessionResult;
    }

    /**
     * Sets the value of the chromAccessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromAccessionResult(String value) {
        this.chromAccessionResult = value;
    }

}
