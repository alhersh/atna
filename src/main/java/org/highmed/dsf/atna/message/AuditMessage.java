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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.highmed.dsf.atna.message.ActiveParticipantContents;
import org.highmed.dsf.atna.message.AuditSourceIdentificationContents;
import org.highmed.dsf.atna.message.EventIdentificationContents;
import org.highmed.dsf.atna.message.ParticipantObjectIdentificationContents;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}EventIdentification"/&gt;
 *         &lt;element ref="{}ActiveParticipant" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}AuditSourceIdentification"/&gt;
 *         &lt;element ref="{}ParticipantObjectIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventIdentification",
    "activeParticipant",
    "auditSourceIdentification",
    "participantObjectIdentification"
})
@XmlRootElement(name = "AuditMessage")
public class AuditMessage {

    @XmlElement(name = "EventIdentification", required = true)
    protected EventIdentificationContents eventIdentification;
    @XmlElement(name = "ActiveParticipant", required = true)
    protected List<ActiveParticipantContents> activeParticipant;
    @XmlElement(name = "AuditSourceIdentification", required = true)
    protected AuditSourceIdentificationContents auditSourceIdentification;
    @XmlElement(name = "ParticipantObjectIdentification")
    protected List<ParticipantObjectIdentificationContents> participantObjectIdentification;

    /**
     * Gets the value of the eventIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EventIdentificationContents }
     *     
     */
    public EventIdentificationContents getEventIdentification() {
        return eventIdentification;
    }

    /**
     * Sets the value of the eventIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventIdentificationContents }
     *     
     */
    public void setEventIdentification(EventIdentificationContents value) {
        this.eventIdentification = value;
    }

    /**
     * Gets the value of the activeParticipant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeParticipant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveParticipantContents }
     * 
     * 
     */
    public List<ActiveParticipantContents> getActiveParticipant() {
        if (activeParticipant == null) {
            activeParticipant = new ArrayList<ActiveParticipantContents>();
        }
        return this.activeParticipant;
    }

    /**
     * Gets the value of the auditSourceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link AuditSourceIdentificationContents }
     *     
     */
    public AuditSourceIdentificationContents getAuditSourceIdentification() {
        return auditSourceIdentification;
    }

    /**
     * Sets the value of the auditSourceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditSourceIdentificationContents }
     *     
     */
    public void setAuditSourceIdentification(AuditSourceIdentificationContents value) {
        this.auditSourceIdentification = value;
    }

    /**
     * Gets the value of the participantObjectIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantObjectIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantObjectIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantObjectIdentificationContents }
     * 
     * 
     */
    public List<ParticipantObjectIdentificationContents> getParticipantObjectIdentification() {
        if (participantObjectIdentification == null) {
            participantObjectIdentification = new ArrayList<ParticipantObjectIdentificationContents>();
        }
        return this.participantObjectIdentification;
    }

}