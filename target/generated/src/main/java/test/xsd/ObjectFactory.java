//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.07 at 11:42:22 AM CET 
//


package test.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import org.highmed.dsf.atna.message.Accession;
import org.highmed.dsf.atna.message.ActiveParticipantContents;
import org.highmed.dsf.atna.message.AuditMessage;
import org.highmed.dsf.atna.message.AuditSourceIdentificationContents;
import org.highmed.dsf.atna.message.EventID;
import org.highmed.dsf.atna.message.EventIdentificationContents;
import org.highmed.dsf.atna.message.EventTypeCode;
import org.highmed.dsf.atna.message.Instance;
import org.highmed.dsf.atna.message.MPPS;
import org.highmed.dsf.atna.message.MediaIdentifier;
import org.highmed.dsf.atna.message.MediaType;
import org.highmed.dsf.atna.message.ParticipantObjectContainsStudy;
import org.highmed.dsf.atna.message.ParticipantObjectDetail;
import org.highmed.dsf.atna.message.ParticipantObjectIDTypeCode;
import org.highmed.dsf.atna.message.ParticipantObjectIdentificationContents;
import org.highmed.dsf.atna.message.RoleIDCode;
import org.highmed.dsf.atna.message.SOPClass;
import org.highmed.dsf.atna.message.StudyIDs;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EventOutcomeDescription_QNAME = new QName("", "EventOutcomeDescription");
    private final static QName _AuditSourceTypeCode_QNAME = new QName("", "AuditSourceTypeCode");
    private final static QName _Encrypted_QNAME = new QName("", "Encrypted");
    private final static QName _Anonymized_QNAME = new QName("", "Anonymized");
    private final static QName _ParticipantObjectName_QNAME = new QName("", "ParticipantObjectName");
    private final static QName _ParticipantObjectQuery_QNAME = new QName("", "ParticipantObjectQuery");
    private final static QName _ParticipantObjectDescription_QNAME = new QName("", "ParticipantObjectDescription");
    private final static QName _EventIdentification_QNAME = new QName("", "EventIdentification");
    private final static QName _ActiveParticipant_QNAME = new QName("", "ActiveParticipant");
    private final static QName _AuditSourceIdentification_QNAME = new QName("", "AuditSourceIdentification");
    private final static QName _ParticipantObjectIdentification_QNAME = new QName("", "ParticipantObjectIdentification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventIdentificationContents }
     * 
     */
    public EventIdentificationContents createEventIdentificationContents() {
        return new EventIdentificationContents();
    }

    /**
     * Create an instance of {@link EventID }
     * 
     */
    public EventID createEventID() {
        return new EventID();
    }

    /**
     * Create an instance of {@link EventTypeCode }
     * 
     */
    public EventTypeCode createEventTypeCode() {
        return new EventTypeCode();
    }

    /**
     * Create an instance of {@link RoleIDCode }
     * 
     */
    public RoleIDCode createRoleIDCode() {
        return new RoleIDCode();
    }

    /**
     * Create an instance of {@link MediaIdentifier }
     * 
     */
    public MediaIdentifier createMediaIdentifier() {
        return new MediaIdentifier();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link MPPS }
     * 
     */
    public MPPS createMPPS() {
        return new MPPS();
    }

    /**
     * Create an instance of {@link Accession }
     * 
     */
    public Accession createAccession() {
        return new Accession();
    }

    /**
     * Create an instance of {@link SOPClass }
     * 
     */
    public SOPClass createSOPClass() {
        return new SOPClass();
    }

    /**
     * Create an instance of {@link Instance }
     * 
     */
    public Instance createInstance() {
        return new Instance();
    }

    /**
     * Create an instance of {@link ParticipantObjectContainsStudy }
     * 
     */
    public ParticipantObjectContainsStudy createParticipantObjectContainsStudy() {
        return new ParticipantObjectContainsStudy();
    }

    /**
     * Create an instance of {@link StudyIDs }
     * 
     */
    public StudyIDs createStudyIDs() {
        return new StudyIDs();
    }

    /**
     * Create an instance of {@link ParticipantObjectIDTypeCode }
     * 
     */
    public ParticipantObjectIDTypeCode createParticipantObjectIDTypeCode() {
        return new ParticipantObjectIDTypeCode();
    }

    /**
     * Create an instance of {@link ParticipantObjectDetail }
     * 
     */
    public ParticipantObjectDetail createParticipantObjectDetail() {
        return new ParticipantObjectDetail();
    }

    /**
     * Create an instance of {@link AuditMessage }
     * 
     */
    public AuditMessage createAuditMessage() {
        return new AuditMessage();
    }

    /**
     * Create an instance of {@link ActiveParticipantContents }
     * 
     */
    public ActiveParticipantContents createActiveParticipantContents() {
        return new ActiveParticipantContents();
    }

    /**
     * Create an instance of {@link AuditSourceIdentificationContents }
     * 
     */
    public AuditSourceIdentificationContents createAuditSourceIdentificationContents() {
        return new AuditSourceIdentificationContents();
    }

    /**
     * Create an instance of {@link ParticipantObjectIdentificationContents }
     * 
     */
    public ParticipantObjectIdentificationContents createParticipantObjectIdentificationContents() {
        return new ParticipantObjectIdentificationContents();
    }

    /**
     * Create an instance of {@link EventIdentificationContents.PurposeOfUse }
     * 
     */
    public EventIdentificationContents.PurposeOfUse createEventIdentificationContentsPurposeOfUse() {
        return new EventIdentificationContents.PurposeOfUse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "EventOutcomeDescription")
    public JAXBElement<String> createEventOutcomeDescription(String value) {
        return new JAXBElement<String>(_EventOutcomeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AuditSourceTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuditSourceTypeCode(String value) {
        return new JAXBElement<String>(_AuditSourceTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Encrypted")
    public JAXBElement<Boolean> createEncrypted(Boolean value) {
        return new JAXBElement<Boolean>(_Encrypted_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Anonymized")
    public JAXBElement<Boolean> createAnonymized(Boolean value) {
        return new JAXBElement<Boolean>(_Anonymized_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ParticipantObjectName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createParticipantObjectName(String value) {
        return new JAXBElement<String>(_ParticipantObjectName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ParticipantObjectQuery")
    public JAXBElement<byte[]> createParticipantObjectQuery(byte[] value) {
        return new JAXBElement<byte[]>(_ParticipantObjectQuery_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ParticipantObjectDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createParticipantObjectDescription(String value) {
        return new JAXBElement<String>(_ParticipantObjectDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventIdentificationContents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventIdentificationContents }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "EventIdentification")
    public JAXBElement<EventIdentificationContents> createEventIdentification(EventIdentificationContents value) {
        return new JAXBElement<EventIdentificationContents>(_EventIdentification_QNAME, EventIdentificationContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveParticipantContents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActiveParticipantContents }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ActiveParticipant")
    public JAXBElement<ActiveParticipantContents> createActiveParticipant(ActiveParticipantContents value) {
        return new JAXBElement<ActiveParticipantContents>(_ActiveParticipant_QNAME, ActiveParticipantContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditSourceIdentificationContents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuditSourceIdentificationContents }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AuditSourceIdentification")
    public JAXBElement<AuditSourceIdentificationContents> createAuditSourceIdentification(AuditSourceIdentificationContents value) {
        return new JAXBElement<AuditSourceIdentificationContents>(_AuditSourceIdentification_QNAME, AuditSourceIdentificationContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantObjectIdentificationContents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParticipantObjectIdentificationContents }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ParticipantObjectIdentification")
    public JAXBElement<ParticipantObjectIdentificationContents> createParticipantObjectIdentification(ParticipantObjectIdentificationContents value) {
        return new JAXBElement<ParticipantObjectIdentificationContents>(_ParticipantObjectIdentification_QNAME, ParticipantObjectIdentificationContents.class, null, value);
    }

}