
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for upLoadGenBankRemoteFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upLoadGenBankRemoteFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upLoadGenBankRemoteFileResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upLoadGenBankRemoteFileResponse", propOrder = {
    "upLoadGenBankRemoteFileResult"
})
public class UpLoadGenBankRemoteFileResponse {

    @XmlElement(required = true)
    protected String upLoadGenBankRemoteFileResult;

    /**
     * Gets the value of the upLoadGenBankRemoteFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpLoadGenBankRemoteFileResult() {
        return upLoadGenBankRemoteFileResult;
    }

    /**
     * Sets the value of the upLoadGenBankRemoteFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpLoadGenBankRemoteFileResult(String value) {
        this.upLoadGenBankRemoteFileResult = value;
    }

}
