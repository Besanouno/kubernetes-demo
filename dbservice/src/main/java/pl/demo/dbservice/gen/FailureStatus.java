//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.16 at 09:58:06 AM CEST 
//


package pl.demo.dbservice.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailureStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENTRY_NOT_FOUND"/&gt;
 *     &lt;enumeration value="CONCURRENT_MODIFICATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureStatus")
@XmlEnum
public enum FailureStatus {

    ENTRY_NOT_FOUND,
    CONCURRENT_MODIFICATION;

    public String value() {
        return name();
    }

    public static FailureStatus fromValue(String v) {
        return valueOf(v);
    }

}
