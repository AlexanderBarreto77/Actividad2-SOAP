package ec.edu.espe.soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TrackingError")
public class TrackingError {

    private int errorCode;
    private String errorMessage;
    private String invalidField;

    public TrackingError() { }

    @XmlElement(required = true)
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @XmlElement(required = true)
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @XmlElement
    public String getInvalidField() {
        return invalidField;
    }

    public void setInvalidField(String invalidField) {
        this.invalidField = invalidField;
    }
}
