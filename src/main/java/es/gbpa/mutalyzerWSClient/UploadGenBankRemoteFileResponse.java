
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadGenBankRemoteFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadGenBankRemoteFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uploadGenBankRemoteFileResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadGenBankRemoteFileResponse", propOrder = {
    "uploadGenBankRemoteFileResult"
})
public class UploadGenBankRemoteFileResponse {

    @XmlElement(required = true)
    protected String uploadGenBankRemoteFileResult;

    /**
     * Gets the value of the uploadGenBankRemoteFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadGenBankRemoteFileResult() {
        return uploadGenBankRemoteFileResult;
    }

    /**
     * Sets the value of the uploadGenBankRemoteFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadGenBankRemoteFileResult(String value) {
        this.uploadGenBankRemoteFileResult = value;
    }

}
