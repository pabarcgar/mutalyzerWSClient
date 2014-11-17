
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadGenBankLocalFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadGenBankLocalFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uploadGenBankLocalFileResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadGenBankLocalFileResponse", propOrder = {
    "uploadGenBankLocalFileResult"
})
public class UploadGenBankLocalFileResponse {

    @XmlElement(required = true)
    protected String uploadGenBankLocalFileResult;

    /**
     * Gets the value of the uploadGenBankLocalFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadGenBankLocalFileResult() {
        return uploadGenBankLocalFileResult;
    }

    /**
     * Sets the value of the uploadGenBankLocalFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadGenBankLocalFileResult(String value) {
        this.uploadGenBankLocalFileResult = value;
    }

}
