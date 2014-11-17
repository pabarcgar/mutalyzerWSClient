
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chromosomeNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chromosomeNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromosomeNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chromosomeNameResponse", propOrder = {
    "chromosomeNameResult"
})
public class ChromosomeNameResponse {

    @XmlElement(required = true)
    protected String chromosomeNameResult;

    /**
     * Gets the value of the chromosomeNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromosomeNameResult() {
        return chromosomeNameResult;
    }

    /**
     * Sets the value of the chromosomeNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromosomeNameResult(String value) {
        this.chromosomeNameResult = value;
    }

}
