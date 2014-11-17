
package org.gbpa.mutalyzer.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCacheResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCacheResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCacheResult" type="{http://mutalyzer.nl/2.0/services}CacheEntryArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCacheResponse", propOrder = {
    "getCacheResult"
})
public class GetCacheResponse {

    @XmlElementRef(name = "getCacheResult", namespace = "http://mutalyzer.nl/2.0/services", type = JAXBElement.class, required = false)
    protected JAXBElement<CacheEntryArray> getCacheResult;

    /**
     * Gets the value of the getCacheResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CacheEntryArray }{@code >}
     *     
     */
    public JAXBElement<CacheEntryArray> getGetCacheResult() {
        return getCacheResult;
    }

    /**
     * Sets the value of the getCacheResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CacheEntryArray }{@code >}
     *     
     */
    public void setGetCacheResult(JAXBElement<CacheEntryArray> value) {
        this.getCacheResult = value;
    }

}
