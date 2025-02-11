
package de.metas.edi.esb.jaxb.stepcom.desadv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PACKIN_Xlief complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PACKIN_Xlief"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PACKAGINGTOTAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PACKAGINGLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PACKAGINGCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PACKAGINGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEASUREATTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEASUREUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEASUREVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PPACK1" type="{}PPACK1" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="DETAIL" type="{}DETAIL_Xlief" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PACKIN_Xlief", propOrder = {
    "documentid",
    "packagingtotal",
    "packaginglevel",
    "packagingcode",
    "packagingtype",
    "measureattr",
    "measureunit",
    "measurevalue",
    "ppack1",
    "detail"
})
public class PACKINXlief {

    @XmlElement(name = "DOCUMENTID", required = true)
    protected String documentid;
    @XmlElement(name = "PACKAGINGTOTAL", required = true)
    protected String packagingtotal;
    @XmlElement(name = "PACKAGINGLEVEL")
    protected String packaginglevel;
    @XmlElement(name = "PACKAGINGCODE")
    protected String packagingcode;
    @XmlElement(name = "PACKAGINGTYPE")
    protected String packagingtype;
    @XmlElement(name = "MEASUREATTR")
    protected String measureattr;
    @XmlElement(name = "MEASUREUNIT")
    protected String measureunit;
    @XmlElement(name = "MEASUREVALUE")
    protected String measurevalue;
    @XmlElement(name = "PPACK1")
    protected List<PPACK1> ppack1;
    @XmlElement(name = "DETAIL")
    protected List<DETAILXlief> detail;

    /**
     * Gets the value of the documentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTID() {
        return documentid;
    }

    /**
     * Sets the value of the documentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTID(String value) {
        this.documentid = value;
    }

    /**
     * Gets the value of the packagingtotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGINGTOTAL() {
        return packagingtotal;
    }

    /**
     * Sets the value of the packagingtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGINGTOTAL(String value) {
        this.packagingtotal = value;
    }

    /**
     * Gets the value of the packaginglevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGINGLEVEL() {
        return packaginglevel;
    }

    /**
     * Sets the value of the packaginglevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGINGLEVEL(String value) {
        this.packaginglevel = value;
    }

    /**
     * Gets the value of the packagingcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGINGCODE() {
        return packagingcode;
    }

    /**
     * Sets the value of the packagingcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGINGCODE(String value) {
        this.packagingcode = value;
    }

    /**
     * Gets the value of the packagingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGINGTYPE() {
        return packagingtype;
    }

    /**
     * Sets the value of the packagingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGINGTYPE(String value) {
        this.packagingtype = value;
    }

    /**
     * Gets the value of the measureattr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASUREATTR() {
        return measureattr;
    }

    /**
     * Sets the value of the measureattr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASUREATTR(String value) {
        this.measureattr = value;
    }

    /**
     * Gets the value of the measureunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASUREUNIT() {
        return measureunit;
    }

    /**
     * Sets the value of the measureunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASUREUNIT(String value) {
        this.measureunit = value;
    }

    /**
     * Gets the value of the measurevalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASUREVALUE() {
        return measurevalue;
    }

    /**
     * Sets the value of the measurevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASUREVALUE(String value) {
        this.measurevalue = value;
    }

    /**
     * Gets the value of the ppack1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppack1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPPACK1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PPACK1 }
     * 
     * 
     */
    public List<PPACK1> getPPACK1() {
        if (ppack1 == null) {
            ppack1 = new ArrayList<PPACK1>();
        }
        return this.ppack1;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDETAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DETAILXlief }
     * 
     * 
     */
    public List<DETAILXlief> getDETAIL() {
        if (detail == null) {
            detail = new ArrayList<DETAILXlief>();
        }
        return this.detail;
    }

}
