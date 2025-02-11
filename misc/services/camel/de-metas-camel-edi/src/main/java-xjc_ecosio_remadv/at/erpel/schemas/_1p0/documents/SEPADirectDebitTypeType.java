
package at.erpel.schemas._1p0.documents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEPADirectDebitTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SEPADirectDebitTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B2C"/&gt;
 *     &lt;enumeration value="B2B"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SEPADirectDebitTypeType")
@XmlEnum
public enum SEPADirectDebitTypeType {

    @XmlEnumValue("B2C")
    B_2_C("B2C"),
    @XmlEnumValue("B2B")
    B_2_B("B2B");
    private final String value;

    SEPADirectDebitTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SEPADirectDebitTypeType fromValue(String v) {
        for (SEPADirectDebitTypeType c: SEPADirectDebitTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
