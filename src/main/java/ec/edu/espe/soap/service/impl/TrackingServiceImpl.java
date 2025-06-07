package ec.edu.espe.soap.service;

import ec.edu.espe.soap.model.*;
        import ec.edu.espe.soap.repository.PackageRepository;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@WebService(
        endpointInterface = "ec.edu.espe.soap.service.TrackingService",
        targetNamespace = "http://logistica.com/ws/tracking",
        serviceName = "TrackingService"
)
public class TrackingServiceImpl implements TrackingService {

    @Autowired
    private PackageRepository packageRepository;

    @Override
    public GetTrackingStatusResponse getTrackingStatus(String trackingNumber) {
        Package pkg = packageRepository.findByTrackingNumber(trackingNumber);
        if (pkg == null) {
            throw new RuntimeException("Tracking number not found: " + trackingNumber);
        }

        GetTrackingStatusResponse response = new GetTrackingStatusResponse();
        response.setStatus(pkg.getStatus());
        response.setCurrentLocation(pkg.getCurrentLocation());
        response.setEstimatedDeliveryDate(pkg.getEstimatedDeliveryDate());
        response.setHistory(pkg.getHistory());

        return response;
    }
}
