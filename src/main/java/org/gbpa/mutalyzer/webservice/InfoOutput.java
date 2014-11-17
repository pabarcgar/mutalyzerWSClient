
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomenclatureVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionParts" type="{http://mutalyzer.nl/2.0/services}stringArray" minOccurs="0"/>
 *         &lt;element name="nomenclatureVersionParts" type="{http://mutalyzer.nl/2.0/services}stringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoOutput", propOrder = {
    "contactEmail",
    "serverName",
    "nomenclatureVersion",
    "releaseDate",
    "version",
    "versionParts",
    "nomenclatureVersionParts"
})
public class InfoOutput {

    @XmlElementRef(name = "contactEmail", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactEmail;
    @XmlElementRef(name = "serverName", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverName;
    @XmlElementRef(name = "nomenclatureVersion", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomenclatureVersion;
    @XmlElementRef(name = "releaseDate", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> releaseDate;
    @XmlElementRef(name = "version", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;
    @XmlElementRef(name = "versionParts", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> versionParts;
    @XmlElementRef(name = "nomenclatureVersionParts", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> nomenclatureVersionParts;

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactEmail(JAXBElement<String> value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerName(JAXBElement<String> value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the nomenclatureVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomenclatureVersion() {
        return nomenclatureVersion;
    }

    /**
     * Sets the value of the nomenclatureVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomenclatureVersion(JAXBElement<String> value) {
        this.nomenclatureVersion = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReleaseDate(JAXBElement<String> value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionParts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getVersionParts() {
        return versionParts;
    }

    /**
     * Sets the value of the versionParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setVersionParts(JAXBElement<StringArray> value) {
        this.versionParts = value;
    }

    /**
     * Gets the value of the nomenclatureVersionParts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getNomenclatureVersionParts() {
        return nomenclatureVersionParts;
    }

    /**
     * Sets the value of the nomenclatureVersionParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setNomenclatureVersionParts(JAXBElement<StringArray> value) {
        this.nomenclatureVersionParts = value;
    }

}
