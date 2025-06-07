package ec.edu.espe.soap.webservice;

import ec.edu.espe.soap.model.GetTrackingStatusRequest;
import ec.edu.espe.soap.model.GetTrackingStatusResponse;
import ec.edu.espe.soap.service.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TrackingEndpoint {

    private static final String NAMESPACE_URI = "http://logistica.com/ws/tracking";

    @Autowired
    private TrackingService trackingService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTrackingStatus")
    @ResponsePayload
    public GetTrackingStatusResponse getTrackingStatus(@RequestPayload GetTrackingStatusRequest request) {
        return trackingService.getTrackingStatus(request);
    }
}
