package demo.exceptions;

public class CEnquiryFormDetailsPageException extends AssertionError {

    public CEnquiryFormDetailsPageException(String message) {
        super(message);
    }

    public CEnquiryFormDetailsPageException(String message, Throwable cause) {
        super(message, cause);
    }
}

