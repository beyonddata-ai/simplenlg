//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.04 at 09:14:07 AM EST 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for {@link simplenlg.framework.PhraseCategory}</p>
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>
 * &lt;simpleType name="phraseCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLAUSE"/&gt;
 *     &lt;enumeration value="ADJECTIVE_PHRASE"/&gt;
 *     &lt;enumeration value="ADVERB_PHRASE"/&gt;
 *     &lt;enumeration value="NOUN_PHRASE"/&gt;
 *     &lt;enumeration value="PREPOSITIONAL_PHRASE"/&gt;
 *     &lt;enumeration value="VERB_PHRASE"/&gt;
 *     &lt;enumeration value="CANNED_TEXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "phraseCategory")
@XmlEnum
public enum XmlPhraseCategory {

    CLAUSE,
    ADJECTIVE_PHRASE,
    ADVERB_PHRASE,
    NOUN_PHRASE,
    PREPOSITIONAL_PHRASE,
    VERB_PHRASE,
    CANNED_TEXT;

    public String value() {
        return name();
    }

    public static XmlPhraseCategory fromValue(String v) {
        return valueOf(v);
    }

}
