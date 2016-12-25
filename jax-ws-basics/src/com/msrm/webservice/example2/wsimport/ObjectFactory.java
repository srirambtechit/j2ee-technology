
package com.msrm.webservice.example2.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.msrm.webservice.example2 package. 
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

    private final static QName _Delete_QNAME = new QName("http://example2.webservice.msrm.com/", "delete");
    private final static QName _UpdateResponse_QNAME = new QName("http://example2.webservice.msrm.com/", "updateResponse");
    private final static QName _Update_QNAME = new QName("http://example2.webservice.msrm.com/", "update");
    private final static QName _GetAllPersonResponse_QNAME = new QName("http://example2.webservice.msrm.com/", "getAllPersonResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://example2.webservice.msrm.com/", "deleteResponse");
    private final static QName _AddResponse_QNAME = new QName("http://example2.webservice.msrm.com/", "addResponse");
    private final static QName _Add_QNAME = new QName("http://example2.webservice.msrm.com/", "add");
    private final static QName _GetAllPerson_QNAME = new QName("http://example2.webservice.msrm.com/", "getAllPerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.msrm.webservice.example2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link GetAllPerson }
     * 
     */
    public GetAllPerson createGetAllPerson() {
        return new GetAllPerson();
    }

    /**
     * Create an instance of {@link GetAllPersonResponse }
     * 
     */
    public GetAllPersonResponse createGetAllPersonResponse() {
        return new GetAllPersonResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "getAllPersonResponse")
    public JAXBElement<GetAllPersonResponse> createGetAllPersonResponse(GetAllPersonResponse value) {
        return new JAXBElement<GetAllPersonResponse>(_GetAllPersonResponse_QNAME, GetAllPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example2.webservice.msrm.com/", name = "getAllPerson")
    public JAXBElement<GetAllPerson> createGetAllPerson(GetAllPerson value) {
        return new JAXBElement<GetAllPerson>(_GetAllPerson_QNAME, GetAllPerson.class, null, value);
    }

}
