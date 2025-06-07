package ec.edu.espe.soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "GetTrackingStatusResponse")
public class GetTrackingStatusResponse {

    private String status;
    private String currentLocation;
    private String estimatedDeliveryDate;
    private List<TrackingEvent> history;

    public GetTrackingStatusResponse() { }

    @XmlElement(required = true)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(required = true)
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @XmlElement
    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    @XmlElementWrapper(name = "history")
    @XmlElement(name = "event")
    public List<TrackingEvent> getHistory() {
        return history;
    }

    public void setHistory(List<TrackingEvent> history) {
        this.history = history;
    }
}
