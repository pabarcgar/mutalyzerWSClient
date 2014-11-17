
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeneNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeneNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getGeneNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeneNameResponse", propOrder = {
    "getGeneNameResult"
})
public class GetGeneNameResponse {

    @XmlElement(required = true)
    protected String getGeneNameResult;

    /**
     * Gets the value of the getGeneNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetGeneNameResult() {
        return getGeneNameResult;
    }

    /**
     * Sets the value of the getGeneNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetGeneNameResult(String value) {
        this.getGeneNameResult = value;
    }

}
