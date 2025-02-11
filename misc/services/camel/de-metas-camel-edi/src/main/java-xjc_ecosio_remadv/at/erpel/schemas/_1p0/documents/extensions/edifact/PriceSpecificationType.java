
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PriceSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}UnitPriceExtType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriceValidFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PriceValidTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Parties" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}BusinessEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSpecificationType", propOrder = {
    "price",
    "priceValidFrom",
    "priceValidTo",
    "parties"
})
public class PriceSpecificationType {

    @XmlElement(name = "Price")
    protected List<UnitPriceExtType> price;
    @XmlElement(name = "PriceValidFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priceValidFrom;
    @XmlElement(name = "PriceValidTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priceValidTo;
    @XmlElement(name = "Parties")
    protected List<BusinessEntityType> parties;

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPriceExtType }
     * 
     * 
     */
    public List<UnitPriceExtType> getPrice() {
        if (price == null) {
            price = new ArrayList<UnitPriceExtType>();
        }
        return this.price;
    }

    /**
     * Gets the value of the priceValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceValidFrom() {
        return priceValidFrom;
    }

    /**
     * Sets the value of the priceValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceValidFrom(XMLGregorianCalendar value) {
        this.priceValidFrom = value;
    }

    /**
     * Gets the value of the priceValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceValidTo() {
        return priceValidTo;
    }

    /**
     * Sets the value of the priceValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceValidTo(XMLGregorianCalendar value) {
        this.priceValidTo = value;
    }

    /**
     * Gets the value of the parties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEntityType }
     * 
     * 
     */
    public List<BusinessEntityType> getParties() {
        if (parties == null) {
            parties = new ArrayList<BusinessEntityType>();
        }
        return this.parties;
    }

}
