//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.12 at 10:41:15 PM BST 
//


package pl.baczkowicz.mqttspy.common.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for FormatterFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormatterFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Conversion" type="{http://baczkowicz.pl/mqtt-spy/common}ConversionFormatterDetails"/&gt;
 *         &lt;element name="SubstringConversion" type="{http://baczkowicz.pl/mqtt-spy/common}SubstringConversionFormatterDetails"/&gt;
 *         &lt;element name="SubstringReplace" type="{http://baczkowicz.pl/mqtt-spy/common}SubstringReplaceFormatterDetails"/&gt;
 *         &lt;element name="SubstringExtract" type="{http://baczkowicz.pl/mqtt-spy/common}SubstringExtractFormatterDetails"/&gt;
 *         &lt;element name="CharacterReplace" type="{http://baczkowicz.pl/mqtt-spy/common}CharacterReplaceFormatterDetails"/&gt;
 *         &lt;element name="ScriptExecution" type="{http://baczkowicz.pl/mqtt-spy/common}ScriptExecutionDetails"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormatterFunction", propOrder = {
    "conversion",
    "substringConversion",
    "substringReplace",
    "substringExtract",
    "characterReplace",
    "scriptExecution"
})
public class FormatterFunction implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Conversion")
    protected ConversionFormatterDetails conversion;
    @XmlElement(name = "SubstringConversion")
    protected SubstringConversionFormatterDetails substringConversion;
    @XmlElement(name = "SubstringReplace")
    protected SubstringReplaceFormatterDetails substringReplace;
    @XmlElement(name = "SubstringExtract")
    protected SubstringExtractFormatterDetails substringExtract;
    @XmlElement(name = "CharacterReplace")
    protected CharacterReplaceFormatterDetails characterReplace;
    @XmlElement(name = "ScriptExecution")
    protected ScriptExecutionDetails scriptExecution;

    /**
     * Default no-arg constructor
     * 
     */
    public FormatterFunction() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FormatterFunction(final ConversionFormatterDetails conversion, final SubstringConversionFormatterDetails substringConversion, final SubstringReplaceFormatterDetails substringReplace, final SubstringExtractFormatterDetails substringExtract, final CharacterReplaceFormatterDetails characterReplace, final ScriptExecutionDetails scriptExecution) {
        this.conversion = conversion;
        this.substringConversion = substringConversion;
        this.substringReplace = substringReplace;
        this.substringExtract = substringExtract;
        this.characterReplace = characterReplace;
        this.scriptExecution = scriptExecution;
    }

    /**
     * Gets the value of the conversion property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFormatterDetails }
     *     
     */
    public ConversionFormatterDetails getConversion() {
        return conversion;
    }

    /**
     * Sets the value of the conversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFormatterDetails }
     *     
     */
    public void setConversion(ConversionFormatterDetails value) {
        this.conversion = value;
    }

    /**
     * Gets the value of the substringConversion property.
     * 
     * @return
     *     possible object is
     *     {@link SubstringConversionFormatterDetails }
     *     
     */
    public SubstringConversionFormatterDetails getSubstringConversion() {
        return substringConversion;
    }

    /**
     * Sets the value of the substringConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstringConversionFormatterDetails }
     *     
     */
    public void setSubstringConversion(SubstringConversionFormatterDetails value) {
        this.substringConversion = value;
    }

    /**
     * Gets the value of the substringReplace property.
     * 
     * @return
     *     possible object is
     *     {@link SubstringReplaceFormatterDetails }
     *     
     */
    public SubstringReplaceFormatterDetails getSubstringReplace() {
        return substringReplace;
    }

    /**
     * Sets the value of the substringReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstringReplaceFormatterDetails }
     *     
     */
    public void setSubstringReplace(SubstringReplaceFormatterDetails value) {
        this.substringReplace = value;
    }

    /**
     * Gets the value of the substringExtract property.
     * 
     * @return
     *     possible object is
     *     {@link SubstringExtractFormatterDetails }
     *     
     */
    public SubstringExtractFormatterDetails getSubstringExtract() {
        return substringExtract;
    }

    /**
     * Sets the value of the substringExtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstringExtractFormatterDetails }
     *     
     */
    public void setSubstringExtract(SubstringExtractFormatterDetails value) {
        this.substringExtract = value;
    }

    /**
     * Gets the value of the characterReplace property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterReplaceFormatterDetails }
     *     
     */
    public CharacterReplaceFormatterDetails getCharacterReplace() {
        return characterReplace;
    }

    /**
     * Sets the value of the characterReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterReplaceFormatterDetails }
     *     
     */
    public void setCharacterReplace(CharacterReplaceFormatterDetails value) {
        this.characterReplace = value;
    }

    /**
     * Gets the value of the scriptExecution property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptExecutionDetails }
     *     
     */
    public ScriptExecutionDetails getScriptExecution() {
        return scriptExecution;
    }

    /**
     * Sets the value of the scriptExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptExecutionDetails }
     *     
     */
    public void setScriptExecution(ScriptExecutionDetails value) {
        this.scriptExecution = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            ConversionFormatterDetails theConversion;
            theConversion = this.getConversion();
            strategy.appendField(locator, this, "conversion", buffer, theConversion);
        }
        {
            SubstringConversionFormatterDetails theSubstringConversion;
            theSubstringConversion = this.getSubstringConversion();
            strategy.appendField(locator, this, "substringConversion", buffer, theSubstringConversion);
        }
        {
            SubstringReplaceFormatterDetails theSubstringReplace;
            theSubstringReplace = this.getSubstringReplace();
            strategy.appendField(locator, this, "substringReplace", buffer, theSubstringReplace);
        }
        {
            SubstringExtractFormatterDetails theSubstringExtract;
            theSubstringExtract = this.getSubstringExtract();
            strategy.appendField(locator, this, "substringExtract", buffer, theSubstringExtract);
        }
        {
            CharacterReplaceFormatterDetails theCharacterReplace;
            theCharacterReplace = this.getCharacterReplace();
            strategy.appendField(locator, this, "characterReplace", buffer, theCharacterReplace);
        }
        {
            ScriptExecutionDetails theScriptExecution;
            theScriptExecution = this.getScriptExecution();
            strategy.appendField(locator, this, "scriptExecution", buffer, theScriptExecution);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FormatterFunction)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FormatterFunction that = ((FormatterFunction) object);
        {
            ConversionFormatterDetails lhsConversion;
            lhsConversion = this.getConversion();
            ConversionFormatterDetails rhsConversion;
            rhsConversion = that.getConversion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conversion", lhsConversion), LocatorUtils.property(thatLocator, "conversion", rhsConversion), lhsConversion, rhsConversion)) {
                return false;
            }
        }
        {
            SubstringConversionFormatterDetails lhsSubstringConversion;
            lhsSubstringConversion = this.getSubstringConversion();
            SubstringConversionFormatterDetails rhsSubstringConversion;
            rhsSubstringConversion = that.getSubstringConversion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substringConversion", lhsSubstringConversion), LocatorUtils.property(thatLocator, "substringConversion", rhsSubstringConversion), lhsSubstringConversion, rhsSubstringConversion)) {
                return false;
            }
        }
        {
            SubstringReplaceFormatterDetails lhsSubstringReplace;
            lhsSubstringReplace = this.getSubstringReplace();
            SubstringReplaceFormatterDetails rhsSubstringReplace;
            rhsSubstringReplace = that.getSubstringReplace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substringReplace", lhsSubstringReplace), LocatorUtils.property(thatLocator, "substringReplace", rhsSubstringReplace), lhsSubstringReplace, rhsSubstringReplace)) {
                return false;
            }
        }
        {
            SubstringExtractFormatterDetails lhsSubstringExtract;
            lhsSubstringExtract = this.getSubstringExtract();
            SubstringExtractFormatterDetails rhsSubstringExtract;
            rhsSubstringExtract = that.getSubstringExtract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substringExtract", lhsSubstringExtract), LocatorUtils.property(thatLocator, "substringExtract", rhsSubstringExtract), lhsSubstringExtract, rhsSubstringExtract)) {
                return false;
            }
        }
        {
            CharacterReplaceFormatterDetails lhsCharacterReplace;
            lhsCharacterReplace = this.getCharacterReplace();
            CharacterReplaceFormatterDetails rhsCharacterReplace;
            rhsCharacterReplace = that.getCharacterReplace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characterReplace", lhsCharacterReplace), LocatorUtils.property(thatLocator, "characterReplace", rhsCharacterReplace), lhsCharacterReplace, rhsCharacterReplace)) {
                return false;
            }
        }
        {
            ScriptExecutionDetails lhsScriptExecution;
            lhsScriptExecution = this.getScriptExecution();
            ScriptExecutionDetails rhsScriptExecution;
            rhsScriptExecution = that.getScriptExecution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scriptExecution", lhsScriptExecution), LocatorUtils.property(thatLocator, "scriptExecution", rhsScriptExecution), lhsScriptExecution, rhsScriptExecution)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            ConversionFormatterDetails theConversion;
            theConversion = this.getConversion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conversion", theConversion), currentHashCode, theConversion);
        }
        {
            SubstringConversionFormatterDetails theSubstringConversion;
            theSubstringConversion = this.getSubstringConversion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substringConversion", theSubstringConversion), currentHashCode, theSubstringConversion);
        }
        {
            SubstringReplaceFormatterDetails theSubstringReplace;
            theSubstringReplace = this.getSubstringReplace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substringReplace", theSubstringReplace), currentHashCode, theSubstringReplace);
        }
        {
            SubstringExtractFormatterDetails theSubstringExtract;
            theSubstringExtract = this.getSubstringExtract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substringExtract", theSubstringExtract), currentHashCode, theSubstringExtract);
        }
        {
            CharacterReplaceFormatterDetails theCharacterReplace;
            theCharacterReplace = this.getCharacterReplace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "characterReplace", theCharacterReplace), currentHashCode, theCharacterReplace);
        }
        {
            ScriptExecutionDetails theScriptExecution;
            theScriptExecution = this.getScriptExecution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scriptExecution", theScriptExecution), currentHashCode, theScriptExecution);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof FormatterFunction) {
            final FormatterFunction copy = ((FormatterFunction) draftCopy);
            if (this.conversion!= null) {
                ConversionFormatterDetails sourceConversion;
                sourceConversion = this.getConversion();
                ConversionFormatterDetails copyConversion = ((ConversionFormatterDetails) strategy.copy(LocatorUtils.property(locator, "conversion", sourceConversion), sourceConversion));
                copy.setConversion(copyConversion);
            } else {
                copy.conversion = null;
            }
            if (this.substringConversion!= null) {
                SubstringConversionFormatterDetails sourceSubstringConversion;
                sourceSubstringConversion = this.getSubstringConversion();
                SubstringConversionFormatterDetails copySubstringConversion = ((SubstringConversionFormatterDetails) strategy.copy(LocatorUtils.property(locator, "substringConversion", sourceSubstringConversion), sourceSubstringConversion));
                copy.setSubstringConversion(copySubstringConversion);
            } else {
                copy.substringConversion = null;
            }
            if (this.substringReplace!= null) {
                SubstringReplaceFormatterDetails sourceSubstringReplace;
                sourceSubstringReplace = this.getSubstringReplace();
                SubstringReplaceFormatterDetails copySubstringReplace = ((SubstringReplaceFormatterDetails) strategy.copy(LocatorUtils.property(locator, "substringReplace", sourceSubstringReplace), sourceSubstringReplace));
                copy.setSubstringReplace(copySubstringReplace);
            } else {
                copy.substringReplace = null;
            }
            if (this.substringExtract!= null) {
                SubstringExtractFormatterDetails sourceSubstringExtract;
                sourceSubstringExtract = this.getSubstringExtract();
                SubstringExtractFormatterDetails copySubstringExtract = ((SubstringExtractFormatterDetails) strategy.copy(LocatorUtils.property(locator, "substringExtract", sourceSubstringExtract), sourceSubstringExtract));
                copy.setSubstringExtract(copySubstringExtract);
            } else {
                copy.substringExtract = null;
            }
            if (this.characterReplace!= null) {
                CharacterReplaceFormatterDetails sourceCharacterReplace;
                sourceCharacterReplace = this.getCharacterReplace();
                CharacterReplaceFormatterDetails copyCharacterReplace = ((CharacterReplaceFormatterDetails) strategy.copy(LocatorUtils.property(locator, "characterReplace", sourceCharacterReplace), sourceCharacterReplace));
                copy.setCharacterReplace(copyCharacterReplace);
            } else {
                copy.characterReplace = null;
            }
            if (this.scriptExecution!= null) {
                ScriptExecutionDetails sourceScriptExecution;
                sourceScriptExecution = this.getScriptExecution();
                ScriptExecutionDetails copyScriptExecution = ((ScriptExecutionDetails) strategy.copy(LocatorUtils.property(locator, "scriptExecution", sourceScriptExecution), sourceScriptExecution));
                copy.setScriptExecution(copyScriptExecution);
            } else {
                copy.scriptExecution = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FormatterFunction();
    }

}
