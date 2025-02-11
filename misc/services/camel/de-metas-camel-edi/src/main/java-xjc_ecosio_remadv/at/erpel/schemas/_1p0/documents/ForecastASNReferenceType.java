
package at.erpel.schemas._1p0.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ForecastASNReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastASNReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastASNNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastASNDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastASNDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastReceivedQuantity" type="{http://erpel.at/schemas/1p0/documents}ConditionalUnitType" minOccurs="0"/&gt;
 *         &lt;element name="LastASNDispatchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastDispatchedQuantity" type="{http://erpel.at/schemas/1p0/documents}ConditionalUnitType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastASNReferenceType", propOrder = {
    "lastASNNumber",
    "lastASNDate",
    "lastASNDeliveryDate",
    "lastReceivedQuantity",
    "lastASNDispatchDate",
    "lastDispatchedQuantity"
})
public class ForecastASNReferenceType {

    @XmlElement(name = "LastASNNumber", required = true)
    protected String lastASNNumber;
    @XmlElement(name = "LastASNDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastASNDate;
    @XmlElement(name = "LastASNDeliveryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastASNDeliveryDate;
    @XmlElement(name = "LastReceivedQuantity")
    protected ConditionalUnitType lastReceivedQuantity;
    @XmlElement(name = "LastASNDispatchDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastASNDispatchDate;
    @XmlElement(name = "LastDispatchedQuantity")
    protected ConditionalUnitType lastDispatchedQuantity;

    /**
     * Gets the value of the lastASNNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastASNNumber() {
        return lastASNNumber;
    }

    /**
     * Sets the value of the lastASNNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastASNNumber(String value) {
        this.lastASNNumber = value;
    }

    /**
     * Gets the value of the lastASNDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastASNDate() {
        return lastASNDate;
    }

    /**
     * Sets the value of the lastASNDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastASNDate(XMLGregorianCalendar value) {
        this.lastASNDate = value;
    }

    /**
     * Gets the value of the lastASNDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastASNDeliveryDate() {
        return lastASNDeliveryDate;
    }

    /**
     * Sets the value of the lastASNDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastASNDeliveryDate(XMLGregorianCalendar value) {
        this.lastASNDeliveryDate = value;
    }

    /**
     * Gets the value of the lastReceivedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalUnitType }
     *     
     */
    public ConditionalUnitType getLastReceivedQuantity() {
        return lastReceivedQuantity;
    }

    /**
     * Sets the value of the lastReceivedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalUnitType }
     *     
     */
    public void setLastReceivedQuantity(ConditionalUnitType value) {
        this.lastReceivedQuantity = value;
    }

    /**
     * Gets the value of the lastASNDispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastASNDispatchDate() {
        return lastASNDispatchDate;
    }

    /**
     * Sets the value of the lastASNDispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastASNDispatchDate(XMLGregorianCalendar value) {
        this.lastASNDispatchDate = value;
    }

    /**
     * Gets the value of the lastDispatchedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalUnitType }
     *     
     */
    public ConditionalUnitType getLastDispatchedQuantity() {
        return lastDispatchedQuantity;
    }

    /**
     * Sets the value of the lastDispatchedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalUnitType }
     *     
     */
    public void setLastDispatchedQuantity(ConditionalUnitType value) {
        this.lastDispatchedQuantity = value;
    }

}
