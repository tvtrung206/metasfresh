
package at.erpel.schemas._1p0.documents.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}SupplierExtension"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}ErpelSupplierExtension"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierExtensionType", propOrder = {
    "supplierExtension",
    "erpelSupplierExtension"
})
public class SupplierExtensionType {

    @XmlElement(name = "SupplierExtension", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
    protected at.erpel.schemas._1p0.documents.extensions.edifact.SupplierExtensionType supplierExtension;
    @XmlElement(name = "ErpelSupplierExtension")
    protected CustomType erpelSupplierExtension;

    /**
     * Gets the value of the supplierExtension property.
     * 
     * @return
     *     possible object is
     *     {@link at.erpel.schemas._1p0.documents.extensions.edifact.SupplierExtensionType }
     *     
     */
    public at.erpel.schemas._1p0.documents.extensions.edifact.SupplierExtensionType getSupplierExtension() {
        return supplierExtension;
    }

    /**
     * Sets the value of the supplierExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link at.erpel.schemas._1p0.documents.extensions.edifact.SupplierExtensionType }
     *     
     */
    public void setSupplierExtension(at.erpel.schemas._1p0.documents.extensions.edifact.SupplierExtensionType value) {
        this.supplierExtension = value;
    }

    /**
     * Gets the value of the erpelSupplierExtension property.
     * 
     * @return
     *     possible object is
     *     {@link CustomType }
     *     
     */
    public CustomType getErpelSupplierExtension() {
        return erpelSupplierExtension;
    }

    /**
     * Sets the value of the erpelSupplierExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomType }
     *     
     */
    public void setErpelSupplierExtension(CustomType value) {
        this.erpelSupplierExtension = value;
    }

}
