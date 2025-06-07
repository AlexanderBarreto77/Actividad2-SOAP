package ec.edu.espe.soap.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import ec.edu.espe.soap.model.GetTrackingStatusResponse;

@WebService(
        targetNamespace = "http://logistica.com/ws/tracking",
        name = "TrackingService"
)
public interface TrackingService {

    @WebMethod
    @WebResult(name = "GetTrackingStatusResponse")
    GetTrackingStatusResponse getTrackingStatus(
            @WebParam(name = "trackingNumber") String trackingNumber
    );
}

