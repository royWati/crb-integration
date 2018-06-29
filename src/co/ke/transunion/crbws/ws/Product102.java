
package co.ke.transunion.crbws.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product102 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product102">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alsoKnownAsList" type="{http://ws.crbws.transunion.ke.co/}alsoKnownAsConsumer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://ws.crbws.transunion.ke.co/}header" minOccurs="0"/>
 *         &lt;element name="personalProfile" type="{http://ws.crbws.transunion.ke.co/}personalProfile" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product102", propOrder = {
    "alsoKnownAsList",
    "header",
    "personalProfile",
    "responseCode"
})
public class Product102 {

    @XmlElement(nillable = true)
    protected List<AlsoKnownAsConsumer> alsoKnownAsList;
    protected Header header;
    protected PersonalProfile personalProfile;
    protected Integer responseCode;

    /**
     * Gets the value of the alsoKnownAsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alsoKnownAsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlsoKnownAsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlsoKnownAsConsumer }
     * 
     * 
     */
    public List<AlsoKnownAsConsumer> getAlsoKnownAsList() {
        if (alsoKnownAsList == null) {
            alsoKnownAsList = new ArrayList<AlsoKnownAsConsumer>();
        }
        return this.alsoKnownAsList;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the personalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalProfile }
     *     
     */
    public PersonalProfile getPersonalProfile() {
        return personalProfile;
    }

    /**
     * Sets the value of the personalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalProfile }
     *     
     */
    public void setPersonalProfile(PersonalProfile value) {
        this.personalProfile = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

}
