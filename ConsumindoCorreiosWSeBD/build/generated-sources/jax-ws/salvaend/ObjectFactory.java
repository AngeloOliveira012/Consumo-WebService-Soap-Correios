
package salvaend;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the salvaend package. 
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

    private final static QName _SalvaEnd_QNAME = new QName("http://salvaend/", "salvaEnd");
    private final static QName _SalvaEndResponse_QNAME = new QName("http://salvaend/", "salvaEndResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: salvaend
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalvaEnd_Type }
     * 
     */
    public SalvaEnd_Type createSalvaEnd_Type() {
        return new SalvaEnd_Type();
    }

    /**
     * Create an instance of {@link SalvaEndResponse }
     * 
     */
    public SalvaEndResponse createSalvaEndResponse() {
        return new SalvaEndResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvaEnd_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://salvaend/", name = "salvaEnd")
    public JAXBElement<SalvaEnd_Type> createSalvaEnd(SalvaEnd_Type value) {
        return new JAXBElement<SalvaEnd_Type>(_SalvaEnd_QNAME, SalvaEnd_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvaEndResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://salvaend/", name = "salvaEndResponse")
    public JAXBElement<SalvaEndResponse> createSalvaEndResponse(SalvaEndResponse value) {
        return new JAXBElement<SalvaEndResponse>(_SalvaEndResponse_QNAME, SalvaEndResponse.class, null, value);
    }

}
