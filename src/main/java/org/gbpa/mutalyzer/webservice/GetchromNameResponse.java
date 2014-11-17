
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getchromNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getchromNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getchromNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getchromNameResponse", propOrder = {
    "getchromNameResult"
})
public class GetchromNameResponse {

    @XmlElement(required = true)
    protected String getchromNameResult;

    /**
     * Gets the value of the getchromNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetchromNameResult() {
        return getchromNameResult;
    }

    /**
     * Sets the value of the getchromNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetchromNameResult(String value) {
        this.getchromNameResult = value;
    }

}
