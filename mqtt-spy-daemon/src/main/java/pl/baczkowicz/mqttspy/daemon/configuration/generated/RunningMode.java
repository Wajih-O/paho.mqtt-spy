//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.26 at 04:58:16 PM BST 
//


package pl.baczkowicz.mqttspy.daemon.configuration.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunningMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RunningMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTINUOUS"/&gt;
 *     &lt;enumeration value="SCRIPTS_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RunningMode")
@XmlEnum
public enum RunningMode {

    CONTINUOUS,
    SCRIPTS_ONLY;

    public String value() {
        return name();
    }

    public static RunningMode fromValue(String v) {
        return valueOf(v);
    }

}
