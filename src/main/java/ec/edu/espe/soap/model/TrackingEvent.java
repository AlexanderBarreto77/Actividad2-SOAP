package ec.edu.espe.soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "event")
public class TrackingEvent {

    private String date;
    private String description;
    private String location;

    public TrackingEvent() { }

    @XmlElement(required = true)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement(required = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(required = true)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
