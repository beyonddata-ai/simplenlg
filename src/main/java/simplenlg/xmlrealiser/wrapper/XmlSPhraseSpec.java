//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.04 at 09:14:07 AM EST 
//


package simplenlg.xmlrealiser.wrapper;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for {@link simplenlg.phrasespec.SPhraseSpec} complex type.</p>
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="SPhraseSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://github.com/simplenlg/simplenlg/tree/master/src/main/resources/xml}PhraseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuePhrase" type="{https://github.com/simplenlg/simplenlg/tree/master/src/main/resources/xml}NLGElement" minOccurs="0"/&gt;
 *         &lt;element name="subj" type="{https://github.com/simplenlg/simplenlg/tree/master/src/main/resources/xml}NLGElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vp" type="{https://github.com/simplenlg/simplenlg/tree/master/src/main/resources/xml}NLGElement"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://github.com/simplenlg/simplenlg/tree/master/src/main/resources/xml}sPhraseAtts"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPhraseSpec", propOrder = {
    "cuePhrase",
    "subj",
    "vp"
})
public class XmlSPhraseSpec
    extends XmlPhraseElement
{

    protected XmlNLGElement cuePhrase;
    protected List<XmlNLGElement> subj;
    @XmlElement(required = true)
    protected XmlNLGElement vp;
    @XmlAttribute(name = "AGGREGATE_AUXILIARY")
    protected Boolean aggregateauxiliary;
    @XmlAttribute(name = "CLAUSE_STATUS")
    protected XmlClauseStatus clausestatus;
    @XmlAttribute(name = "COMPLEMENTISER")
    protected String complementiser;
    @XmlAttribute(name = "FORM")
    protected XmlForm form;
    @XmlAttribute(name = "INTERROGATIVE_TYPE")
    protected XmlInterrogativeType interrogativetype;
    @XmlAttribute(name = "MODAL")
    protected String modal;
    @XmlAttribute(name = "NEGATED")
    protected Boolean negated;
    @XmlAttribute(name = "PASSIVE")
    protected Boolean passive;
    @XmlAttribute(name = "PERFECT")
    protected Boolean perfect;
    @XmlAttribute(name = "PERSON")
    protected XmlPerson person;
    @XmlAttribute(name = "PROGRESSIVE")
    protected Boolean progressive;
    @XmlAttribute(name = "SUPPRESS_GENITIVE_IN_GERUND")
    protected Boolean suppressgenitiveingerund;
    @XmlAttribute(name = "SUPRESSED_COMPLEMENTISER")
    protected Boolean supressedcomplementiser;
    @XmlAttribute(name = "TENSE")
    protected XmlTense tense;

    /**
     * Gets the value of the cuePhrase property.
     * 
     * @return
     *     possible object is
     *     {@link XmlNLGElement }
     *     
     */
    public XmlNLGElement getCuePhrase() {
        return cuePhrase;
    }

    /**
     * Sets the value of the cuePhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlNLGElement }
     *     
     */
    public void setCuePhrase(XmlNLGElement value) {
        this.cuePhrase = value;
    }

    /**
     * Gets the value of the subj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlNLGElement }
     *
     * @return a {@link List} of {@link XmlNLGElement} of subjects.
     */
    public List<XmlNLGElement> getSubj() {
        if (subj == null) {
            subj = new ArrayList<XmlNLGElement>();
        }
        return this.subj;
    }

    /**
     * Gets the value of the vp property.
     * 
     * @return
     *     possible object is
     *     {@link XmlNLGElement }
     *     
     */
    public XmlNLGElement getVp() {
        return vp;
    }

    /**
     * Sets the value of the vp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlNLGElement }
     *     
     */
    public void setVp(XmlNLGElement value) {
        this.vp = value;
    }

    /**
     * Gets the value of the aggregateauxiliary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAGGREGATEAUXILIARY() {
        return aggregateauxiliary;
    }

    /**
     * Sets the value of the aggregateauxiliary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAGGREGATEAUXILIARY(Boolean value) {
        this.aggregateauxiliary = value;
    }

    /**
     * Gets the value of the clausestatus property.
     * 
     * @return
     *     possible object is
     *     {@link XmlClauseStatus }
     *     
     */
    public XmlClauseStatus getCLAUSESTATUS() {
        return clausestatus;
    }

    /**
     * Sets the value of the clausestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlClauseStatus }
     *     
     */
    public void setCLAUSESTATUS(XmlClauseStatus value) {
        this.clausestatus = value;
    }

    /**
     * Gets the value of the complementiser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPLEMENTISER() {
        return complementiser;
    }

    /**
     * Sets the value of the complementiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPLEMENTISER(String value) {
        this.complementiser = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link XmlForm }
     *     
     */
    public XmlForm getFORM() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlForm }
     *     
     */
    public void setFORM(XmlForm value) {
        this.form = value;
    }

    /**
     * Gets the value of the interrogativetype property.
     * 
     * @return
     *     possible object is
     *     {@link XmlInterrogativeType }
     *     
     */
    public XmlInterrogativeType getINTERROGATIVETYPE() {
        return interrogativetype;
    }

    /**
     * Sets the value of the interrogativetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlInterrogativeType }
     *     
     */
    public void setINTERROGATIVETYPE(XmlInterrogativeType value) {
        this.interrogativetype = value;
    }

    /**
     * Gets the value of the modal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODAL() {
        return modal;
    }

    /**
     * Sets the value of the modal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODAL(String value) {
        this.modal = value;
    }

    /**
     * Gets the value of the negated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEGATED() {
        return negated;
    }

    /**
     * Sets the value of the negated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEGATED(Boolean value) {
        this.negated = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPASSIVE() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPASSIVE(Boolean value) {
        this.passive = value;
    }

    /**
     * Gets the value of the perfect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPERFECT() {
        return perfect;
    }

    /**
     * Sets the value of the perfect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPERFECT(Boolean value) {
        this.perfect = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPerson }
     *     
     */
    public XmlPerson getPERSON() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPerson }
     *     
     */
    public void setPERSON(XmlPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the progressive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPROGRESSIVE() {
        return progressive;
    }

    /**
     * Sets the value of the progressive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPROGRESSIVE(Boolean value) {
        this.progressive = value;
    }

    /**
     * Gets the value of the suppressgenitiveingerund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSUPPRESSGENITIVEINGERUND() {
        return suppressgenitiveingerund;
    }

    /**
     * Sets the value of the suppressgenitiveingerund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSUPPRESSGENITIVEINGERUND(Boolean value) {
        this.suppressgenitiveingerund = value;
    }

    /**
     * Gets the value of the supressedcomplementiser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSUPRESSEDCOMPLEMENTISER() {
        return supressedcomplementiser;
    }

    /**
     * Sets the value of the supressedcomplementiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSUPRESSEDCOMPLEMENTISER(Boolean value) {
        this.supressedcomplementiser = value;
    }

    /**
     * Gets the value of the tense property.
     * 
     * @return
     *     possible object is
     *     {@link XmlTense }
     *     
     */
    public XmlTense getTENSE() {
        return tense;
    }

    /**
     * Sets the value of the tense property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlTense }
     *     
     */
    public void setTENSE(XmlTense value) {
        this.tense = value;
    }

}
