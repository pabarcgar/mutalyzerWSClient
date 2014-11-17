
package org.gbpa.mutalyzer.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RawVarArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawVarArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawVar" type="{http://mutalyzer.nl/2.0/services}RawVar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawVarArray", propOrder = {
    "rawVar"
})
public class RawVarArray {

    @XmlElement(name = "RawVar", nillable = true)
    protected List<RawVar> rawVar;

    /**
     * Gets the value of the rawVar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rawVar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRawVar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RawVar }
     * 
     * 
     */
    public List<RawVar> getRawVar() {
        if (rawVar == null) {
            rawVar = new ArrayList<RawVar>();
        }
        return this.rawVar;
    }

}
