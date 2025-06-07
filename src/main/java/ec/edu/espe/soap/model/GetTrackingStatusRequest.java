package ec.edu.espe.soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetTrackingStatus")
public class GetTrackingStatusRequest {

    private String trackingNumber;

    public GetTrackingStatusRequest() { }

    @XmlElement(required = true)
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
