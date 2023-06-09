
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.enset.ma/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param mantant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://ws.enset.ma/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://ws.enset.ma/", className = "proxy.ConvertResponse")
    @Action(input = "http://ws.enset.ma/BanqueService/ConvertRequest", output = "http://ws.enset.ma/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "mantant", targetNamespace = "")
        double mantant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.enset.ma/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.enset.ma/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws.enset.ma/BanqueService/getCompteRequest", output = "http://ws.enset.ma/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws.enset.ma/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws.enset.ma/", className = "proxy.ListComptesResponse")
    @Action(input = "http://ws.enset.ma/BanqueService/listComptesRequest", output = "http://ws.enset.ma/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

}
