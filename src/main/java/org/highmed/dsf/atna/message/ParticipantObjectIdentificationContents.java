//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.07 at 11:42:22 AM CET 
//


package org.highmed.dsf.atna.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.highmed.dsf.atna.message.Accession;
import org.highmed.dsf.atna.message.MPPS;
import org.highmed.dsf.atna.message.ParticipantObjectContainsStudy;
import org.highmed.dsf.atna.message.ParticipantObjectDetail;
import org.highmed.dsf.atna.message.ParticipantObjectIDTypeCode;
import org.highmed.dsf.atna.message.SOPClass;


/**
 * <p>Java class for ParticipantObjectIdentificationContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantObjectIdentificationContents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ParticipantObjectIDTypeCode"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}ParticipantObjectName"/&gt;
 *           &lt;element ref="{}ParticipantObjectQuery"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}ParticipantObjectDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ParticipantObjectDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}DICOMObjectDescriptionContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ParticipantObjectID" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="ParticipantObjectTypeCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="1"/&gt;
 *             &lt;enumeration value="2"/&gt;
 *             &lt;enumeration value="3"/&gt;
 *             &lt;enumeration value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ParticipantObjectTypeCodeRole"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="1"/&gt;
 *             &lt;enumeration value="2"/&gt;
 *             &lt;enumeration value="3"/&gt;
 *             &lt;enumeration value="4"/&gt;
 *             &lt;enumeration value="5"/&gt;
 *             &lt;enumeration value="6"/&gt;
 *             &lt;enumeration value="7"/&gt;
 *             &lt;enumeration value="8"/&gt;
 *             &lt;enumeration value="9"/&gt;
 *             &lt;enumeration value="10"/&gt;
 *             &lt;enumeration value="11"/&gt;
 *             &lt;enumeration value="12"/&gt;
 *             &lt;enumeration value="13"/&gt;
 *             &lt;enumeration value="14"/&gt;
 *             &lt;enumeration value="15"/&gt;
 *             &lt;enumeration value="16"/&gt;
 *             &lt;enumeration value="17"/&gt;
 *             &lt;enumeration value="18"/&gt;
 *             &lt;enumeration value="19"/&gt;
 *             &lt;enumeration value="20"/&gt;
 *             &lt;enumeration value="21"/&gt;
 *             &lt;enumeration value="22"/&gt;
 *             &lt;enumeration value="23"/&gt;
 *             &lt;enumeration value="24"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ParticipantObjectDataLifeCycle"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="1"/&gt;
 *             &lt;enumeration value="2"/&gt;
 *             &lt;enumeration value="3"/&gt;
 *             &lt;enumeration value="4"/&gt;
 *             &lt;enumeration value="5"/&gt;
 *             &lt;enumeration value="6"/&gt;
 *             &lt;enumeration value="7"/&gt;
 *             &lt;enumeration value="8"/&gt;
 *             &lt;enumeration value="9"/&gt;
 *             &lt;enumeration value="10"/&gt;
 *             &lt;enumeration value="11"/&gt;
 *             &lt;enumeration value="12"/&gt;
 *             &lt;enumeration value="13"/&gt;
 *             &lt;enumeration value="14"/&gt;
 *             &lt;enumeration value="15"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ParticipantObjectSensistity" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantObjectIdentificationContents", propOrder = {
    "participantObjectIDTypeCode",
    "participantObjectName",
    "participantObjectQuery",
    "participantObjectDetail",
    "participantObjectDescription",
    "mpps",
    "accession",
    "sopClass",
    "participantObjectContainsStudy",
    "encrypted",
    "anonymized"
})
public class ParticipantObjectIdentificationContents {

    @XmlElement(name = "ParticipantObjectIDTypeCode", required = true)
    protected ParticipantObjectIDTypeCode participantObjectIDTypeCode;
    @XmlElement(name = "ParticipantObjectName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String participantObjectName;
    @XmlElement(name = "ParticipantObjectQuery")
    protected byte[] participantObjectQuery;
    @XmlElement(name = "ParticipantObjectDetail")
    protected List<ParticipantObjectDetail> participantObjectDetail;
    @XmlElement(name = "ParticipantObjectDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> participantObjectDescription;
    @XmlElement(name = "MPPS")
    protected List<MPPS> mpps;
    @XmlElement(name = "Accession")
    protected List<Accession> accession;
    @XmlElement(name = "SOPClass")
    protected SOPClass sopClass;
    @XmlElement(name = "ParticipantObjectContainsStudy")
    protected ParticipantObjectContainsStudy participantObjectContainsStudy;
    @XmlElement(name = "Encrypted")
    protected Boolean encrypted;
    @XmlElement(name = "Anonymized")
    protected Boolean anonymized;
    @XmlAttribute(name = "ParticipantObjectID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String participantObjectID;
    @XmlAttribute(name = "ParticipantObjectTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String participantObjectTypeCode;
    @XmlAttribute(name = "ParticipantObjectTypeCodeRole")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String participantObjectTypeCodeRole;
    @XmlAttribute(name = "ParticipantObjectDataLifeCycle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String participantObjectDataLifeCycle;
    @XmlAttribute(name = "ParticipantObjectSensistity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String participantObjectSensistity;

    /**
     * Gets the value of the participantObjectIDTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantObjectIDTypeCode }
     *     
     */
    public ParticipantObjectIDTypeCode getParticipantObjectIDTypeCode() {
        return participantObjectIDTypeCode;
    }

    /**
     * Sets the value of the participantObjectIDTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantObjectIDTypeCode }
     *     
     */
    public void setParticipantObjectIDTypeCode(ParticipantObjectIDTypeCode value) {
        this.participantObjectIDTypeCode = value;
    }

    /**
     * Gets the value of the participantObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectName() {
        return participantObjectName;
    }

    /**
     * Sets the value of the participantObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectName(String value) {
        this.participantObjectName = value;
    }

    /**
     * Gets the value of the participantObjectQuery property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParticipantObjectQuery() {
        return participantObjectQuery;
    }

    /**
     * Sets the value of the participantObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setParticipantObjectQuery(byte[] value) {
        this.participantObjectQuery = value;
    }

    /**
     * Gets the value of the participantObjectDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantObjectDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantObjectDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantObjectDetail }
     * 
     * 
     */
    public List<ParticipantObjectDetail> getParticipantObjectDetail() {
        if (participantObjectDetail == null) {
            participantObjectDetail = new ArrayList<ParticipantObjectDetail>();
        }
        return this.participantObjectDetail;
    }

    /**
     * Gets the value of the participantObjectDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantObjectDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantObjectDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParticipantObjectDescription() {
        if (participantObjectDescription == null) {
            participantObjectDescription = new ArrayList<String>();
        }
        return this.participantObjectDescription;
    }

    /**
     * Gets the value of the mpps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPPS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPPS }
     * 
     * 
     */
    public List<MPPS> getMPPS() {
        if (mpps == null) {
            mpps = new ArrayList<MPPS>();
        }
        return this.mpps;
    }

    /**
     * Gets the value of the accession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accession }
     * 
     * 
     */
    public List<Accession> getAccession() {
        if (accession == null) {
            accession = new ArrayList<Accession>();
        }
        return this.accession;
    }

    /**
     * Gets the value of the sopClass property.
     * 
     * @return
     *     possible object is
     *     {@link SOPClass }
     *     
     */
    public SOPClass getSOPClass() {
        return sopClass;
    }

    /**
     * Sets the value of the sopClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOPClass }
     *     
     */
    public void setSOPClass(SOPClass value) {
        this.sopClass = value;
    }

    /**
     * Gets the value of the participantObjectContainsStudy property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantObjectContainsStudy }
     *     
     */
    public ParticipantObjectContainsStudy getParticipantObjectContainsStudy() {
        return participantObjectContainsStudy;
    }

    /**
     * Sets the value of the participantObjectContainsStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantObjectContainsStudy }
     *     
     */
    public void setParticipantObjectContainsStudy(ParticipantObjectContainsStudy value) {
        this.participantObjectContainsStudy = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the anonymized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnonymized() {
        return anonymized;
    }

    /**
     * Sets the value of the anonymized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonymized(Boolean value) {
        this.anonymized = value;
    }

    /**
     * Gets the value of the participantObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectID() {
        return participantObjectID;
    }

    /**
     * Sets the value of the participantObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectID(String value) {
        this.participantObjectID = value;
    }

    /**
     * Gets the value of the participantObjectTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectTypeCode() {
        return participantObjectTypeCode;
    }

    /**
     * Sets the value of the participantObjectTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectTypeCode(String value) {
        this.participantObjectTypeCode = value;
    }

    /**
     * Gets the value of the participantObjectTypeCodeRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectTypeCodeRole() {
        return participantObjectTypeCodeRole;
    }

    /**
     * Sets the value of the participantObjectTypeCodeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectTypeCodeRole(String value) {
        this.participantObjectTypeCodeRole = value;
    }

    /**
     * Gets the value of the participantObjectDataLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectDataLifeCycle() {
        return participantObjectDataLifeCycle;
    }

    /**
     * Sets the value of the participantObjectDataLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectDataLifeCycle(String value) {
        this.participantObjectDataLifeCycle = value;
    }

    /**
     * Gets the value of the participantObjectSensistity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectSensistity() {
        return participantObjectSensistity;
    }

    /**
     * Sets the value of the participantObjectSensistity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectSensistity(String value) {
        this.participantObjectSensistity = value;
    }

}
