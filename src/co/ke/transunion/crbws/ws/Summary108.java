
package co.ke.transunion.crbws.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for summary108 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="summary108">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="closedAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="creditHistory" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="enquiries31to60Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="enquiries61to90Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="enquiries91Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="enquiriesLast30Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="lastNPAListingDate" type="{http://ws.crbws.transunion.ke.co/}dateSector" minOccurs="0"/>
 *         &lt;element name="lastPAListingDate" type="{http://ws.crbws.transunion.ke.co/}dateSector" minOccurs="0"/>
 *         &lt;element name="lastPAListingDateWithDh" type="{http://ws.crbws.transunion.ke.co/}dateSector" minOccurs="0"/>
 *         &lt;element name="npaAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaTotalValueList" type="{http://ws.crbws.transunion.ke.co/}moneySector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="openAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paTotalValueList" type="{http://ws.crbws.transunion.ke.co/}moneySector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paTotalValueListWithDh" type="{http://ws.crbws.transunion.ke.co/}moneySector" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summary108", propOrder = {
    "closedAccounts",
    "creditHistory",
    "enquiries31To60Days",
    "enquiries61To90Days",
    "enquiries91Days",
    "enquiriesLast30Days",
    "lastNPAListingDate",
    "lastPAListingDate",
    "lastPAListingDateWithDh",
    "npaAccounts",
    "npaTotalValueList",
    "openAccounts",
    "paAccounts",
    "paAccountsWithDh",
    "paClosedAccounts",
    "paClosedAccountsWithDh",
    "paOpenAccounts",
    "paOpenAccountsWithDh",
    "paTotalValueList",
    "paTotalValueListWithDh"
})
public class Summary108 {

    protected CountSector closedAccounts;
    protected CountSector creditHistory;
    @XmlElement(name = "enquiries31to60Days")
    protected CountSector enquiries31To60Days;
    @XmlElement(name = "enquiries61to90Days")
    protected CountSector enquiries61To90Days;
    protected CountSector enquiries91Days;
    protected CountSector enquiriesLast30Days;
    protected DateSector lastNPAListingDate;
    protected DateSector lastPAListingDate;
    protected DateSector lastPAListingDateWithDh;
    protected CountSector npaAccounts;
    @XmlElement(nillable = true)
    protected List<MoneySector> npaTotalValueList;
    protected CountSector openAccounts;
    protected CountSector paAccounts;
    protected CountSector paAccountsWithDh;
    protected CountSector paClosedAccounts;
    protected CountSector paClosedAccountsWithDh;
    protected CountSector paOpenAccounts;
    protected CountSector paOpenAccountsWithDh;
    @XmlElement(nillable = true)
    protected List<MoneySector> paTotalValueList;
    @XmlElement(nillable = true)
    protected List<MoneySector> paTotalValueListWithDh;

    /**
     * Gets the value of the closedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getClosedAccounts() {
        return closedAccounts;
    }

    /**
     * Sets the value of the closedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setClosedAccounts(CountSector value) {
        this.closedAccounts = value;
    }

    /**
     * Gets the value of the creditHistory property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getCreditHistory() {
        return creditHistory;
    }

    /**
     * Sets the value of the creditHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setCreditHistory(CountSector value) {
        this.creditHistory = value;
    }

    /**
     * Gets the value of the enquiries31To60Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getEnquiries31To60Days() {
        return enquiries31To60Days;
    }

    /**
     * Sets the value of the enquiries31To60Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setEnquiries31To60Days(CountSector value) {
        this.enquiries31To60Days = value;
    }

    /**
     * Gets the value of the enquiries61To90Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getEnquiries61To90Days() {
        return enquiries61To90Days;
    }

    /**
     * Sets the value of the enquiries61To90Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setEnquiries61To90Days(CountSector value) {
        this.enquiries61To90Days = value;
    }

    /**
     * Gets the value of the enquiries91Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getEnquiries91Days() {
        return enquiries91Days;
    }

    /**
     * Sets the value of the enquiries91Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setEnquiries91Days(CountSector value) {
        this.enquiries91Days = value;
    }

    /**
     * Gets the value of the enquiriesLast30Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getEnquiriesLast30Days() {
        return enquiriesLast30Days;
    }

    /**
     * Sets the value of the enquiriesLast30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setEnquiriesLast30Days(CountSector value) {
        this.enquiriesLast30Days = value;
    }

    /**
     * Gets the value of the lastNPAListingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateSector }
     *     
     */
    public DateSector getLastNPAListingDate() {
        return lastNPAListingDate;
    }

    /**
     * Sets the value of the lastNPAListingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSector }
     *     
     */
    public void setLastNPAListingDate(DateSector value) {
        this.lastNPAListingDate = value;
    }

    /**
     * Gets the value of the lastPAListingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateSector }
     *     
     */
    public DateSector getLastPAListingDate() {
        return lastPAListingDate;
    }

    /**
     * Sets the value of the lastPAListingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSector }
     *     
     */
    public void setLastPAListingDate(DateSector value) {
        this.lastPAListingDate = value;
    }

    /**
     * Gets the value of the lastPAListingDateWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link DateSector }
     *     
     */
    public DateSector getLastPAListingDateWithDh() {
        return lastPAListingDateWithDh;
    }

    /**
     * Sets the value of the lastPAListingDateWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSector }
     *     
     */
    public void setLastPAListingDateWithDh(DateSector value) {
        this.lastPAListingDateWithDh = value;
    }

    /**
     * Gets the value of the npaAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getNpaAccounts() {
        return npaAccounts;
    }

    /**
     * Sets the value of the npaAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setNpaAccounts(CountSector value) {
        this.npaAccounts = value;
    }

    /**
     * Gets the value of the npaTotalValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npaTotalValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNpaTotalValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneySector }
     * 
     * 
     */
    public List<MoneySector> getNpaTotalValueList() {
        if (npaTotalValueList == null) {
            npaTotalValueList = new ArrayList<MoneySector>();
        }
        return this.npaTotalValueList;
    }

    /**
     * Gets the value of the openAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getOpenAccounts() {
        return openAccounts;
    }

    /**
     * Sets the value of the openAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setOpenAccounts(CountSector value) {
        this.openAccounts = value;
    }

    /**
     * Gets the value of the paAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaAccounts() {
        return paAccounts;
    }

    /**
     * Sets the value of the paAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaAccounts(CountSector value) {
        this.paAccounts = value;
    }

    /**
     * Gets the value of the paAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaAccountsWithDh() {
        return paAccountsWithDh;
    }

    /**
     * Sets the value of the paAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaAccountsWithDh(CountSector value) {
        this.paAccountsWithDh = value;
    }

    /**
     * Gets the value of the paClosedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaClosedAccounts() {
        return paClosedAccounts;
    }

    /**
     * Sets the value of the paClosedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaClosedAccounts(CountSector value) {
        this.paClosedAccounts = value;
    }

    /**
     * Gets the value of the paClosedAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaClosedAccountsWithDh() {
        return paClosedAccountsWithDh;
    }

    /**
     * Sets the value of the paClosedAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaClosedAccountsWithDh(CountSector value) {
        this.paClosedAccountsWithDh = value;
    }

    /**
     * Gets the value of the paOpenAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaOpenAccounts() {
        return paOpenAccounts;
    }

    /**
     * Sets the value of the paOpenAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaOpenAccounts(CountSector value) {
        this.paOpenAccounts = value;
    }

    /**
     * Gets the value of the paOpenAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaOpenAccountsWithDh() {
        return paOpenAccountsWithDh;
    }

    /**
     * Sets the value of the paOpenAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaOpenAccountsWithDh(CountSector value) {
        this.paOpenAccountsWithDh = value;
    }

    /**
     * Gets the value of the paTotalValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paTotalValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaTotalValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneySector }
     * 
     * 
     */
    public List<MoneySector> getPaTotalValueList() {
        if (paTotalValueList == null) {
            paTotalValueList = new ArrayList<MoneySector>();
        }
        return this.paTotalValueList;
    }

    /**
     * Gets the value of the paTotalValueListWithDh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paTotalValueListWithDh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaTotalValueListWithDh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneySector }
     * 
     * 
     */
    public List<MoneySector> getPaTotalValueListWithDh() {
        if (paTotalValueListWithDh == null) {
            paTotalValueListWithDh = new ArrayList<MoneySector>();
        }
        return this.paTotalValueListWithDh;
    }

}
