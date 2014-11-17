
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transcriptInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transcriptInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LOVD_ver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="build" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transcriptInfo", propOrder = {
    "lovdVer",
    "build",
    "accNo"
})
public class TranscriptInfoByNM {

    @XmlElement(name = "LOVD_ver", required = true)
    protected String lovdVer;
    @XmlElement(required = true)
    protected String build;
    @XmlElement(required = true)
    protected String accNo;

    /**
     * Gets the value of the lovdVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOVDVer() {
        return lovdVer;
    }

    /**
     * Sets the value of the lovdVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOVDVer(String value) {
        this.lovdVer = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the accNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccNo() {
        return accNo;
    }

    /**
     * Sets the value of the accNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccNo(String value) {
        this.accNo = value;
    }

}
