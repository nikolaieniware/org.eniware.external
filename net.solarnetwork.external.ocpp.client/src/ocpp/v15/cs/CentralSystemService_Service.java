/*
 * ==================================================================
 *  Eniware Open Source:Nikolai Manchev
 *  Apache License 2.0
 * ==================================================================
 */

package ocpp.v15.cs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * The Central System Service for the Open Charge Point Protocol
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CentralSystemService", targetNamespace = "urn://Ocpp/Cs/2012/06/", wsdlLocation = "file:ocpp_centralsystemservice_1.5_final.wsdl")
public class CentralSystemService_Service
    extends Service
{

    private final static URL CENTRALSYSTEMSERVICE_WSDL_LOCATION;
    private final static WebServiceException CENTRALSYSTEMSERVICE_EXCEPTION;
    private final static QName CENTRALSYSTEMSERVICE_QNAME = new QName("urn://Ocpp/Cs/2012/06/", "CentralSystemService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:ocpp_centralsystemservice_1.5_final.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CENTRALSYSTEMSERVICE_WSDL_LOCATION = url;
        CENTRALSYSTEMSERVICE_EXCEPTION = e;
    }

    public CentralSystemService_Service() {
        super(__getWsdlLocation(), CENTRALSYSTEMSERVICE_QNAME);
    }

    public CentralSystemService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CentralSystemService
     */
    @WebEndpoint(name = "CentralSystemServiceSoap12")
    public CentralSystemService getCentralSystemServiceSoap12() {
        return super.getPort(new QName("urn://Ocpp/Cs/2012/06/", "CentralSystemServiceSoap12"), CentralSystemService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CentralSystemService
     */
    @WebEndpoint(name = "CentralSystemServiceSoap12")
    public CentralSystemService getCentralSystemServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("urn://Ocpp/Cs/2012/06/", "CentralSystemServiceSoap12"), CentralSystemService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CENTRALSYSTEMSERVICE_EXCEPTION!= null) {
            throw CENTRALSYSTEMSERVICE_EXCEPTION;
        }
        return CENTRALSYSTEMSERVICE_WSDL_LOCATION;
    }

}
