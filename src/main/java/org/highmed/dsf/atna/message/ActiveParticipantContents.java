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

import org.highmed.dsf.atna.message.MediaIdentifier;
import org.highmed.dsf.atna.message.RoleIDCode;


/**
 * <p>Java class for ActiveParticipantContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveParticipantContents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}RoleIDCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}MediaIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UserID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="AlternativeUserID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="UserIsRequestor" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NetworkAccessPointID" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="NetworkAccessPointTypeCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="1"/&gt;
 *             &lt;enumeration value="2"/&gt;
 *             &lt;enumeration value="3"/&gt;
 *             &lt;enumeration value="4"/&gt;
 *             &lt;enumeration value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveParticipantContents", propOrder = {
    "roleIDCode",
    "mediaIdentifier"
})
public class ActiveParticipantContents {

    @XmlElement(name = "RoleIDCode")
    protected List<RoleIDCode> roleIDCode;
    @XmlElement(name = "MediaIdentifier")
    protected MediaIdentifier mediaIdentifier;
    @XmlAttribute(name = "UserID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String userID;
    @XmlAttribute(name = "AlternativeUserID")
    @XmlSchemaType(name = "anySimpleType")
    protected String alternativeUserID;
    @XmlAttribute(name = "UserName")
    @XmlSchemaType(name = "anySimpleType")
    protected String userName;
    @XmlAttribute(name = "UserIsRequestor", required = true)
    protected boolean userIsRequestor;
    @XmlAttribute(name = "NetworkAccessPointID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String networkAccessPointID;
    @XmlAttribute(name = "NetworkAccessPointTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String networkAccessPointTypeCode;

    /**
     * Gets the value of the roleIDCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleIDCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleIDCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleIDCode }
     * 
     * 
     */
    public List<RoleIDCode> getRoleIDCode() {
        if (roleIDCode == null) {
            roleIDCode = new ArrayList<RoleIDCode>();
        }
        return this.roleIDCode;
    }

    /**
     * Gets the value of the mediaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MediaIdentifier }
     *     
     */
    public MediaIdentifier getMediaIdentifier() {
        return mediaIdentifier;
    }

    /**
     * Sets the value of the mediaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaIdentifier }
     *     
     */
    public void setMediaIdentifier(MediaIdentifier value) {
        this.mediaIdentifier = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the alternativeUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeUserID() {
        return alternativeUserID;
    }

    /**
     * Sets the value of the alternativeUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeUserID(String value) {
        this.alternativeUserID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userIsRequestor property.
     * 
     */
    public boolean isUserIsRequestor() {
        return userIsRequestor;
    }

    /**
     * Sets the value of the userIsRequestor property.
     * 
     */
    public void setUserIsRequestor(boolean value) {
        this.userIsRequestor = value;
    }

    /**
     * Gets the value of the networkAccessPointID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAccessPointID() {
        return networkAccessPointID;
    }

    /**
     * Sets the value of the networkAccessPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAccessPointID(String value) {
        this.networkAccessPointID = value;
    }

    /**
     * Gets the value of the networkAccessPointTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAccessPointTypeCode() {
        return networkAccessPointTypeCode;
    }

    /**
     * Sets the value of the networkAccessPointTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAccessPointTypeCode(String value) {
        this.networkAccessPointTypeCode = value;
    }

}
