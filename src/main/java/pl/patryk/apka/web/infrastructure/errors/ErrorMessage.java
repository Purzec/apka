package pl.patryk.apka.web.infrastructure.errors;

public class ErrorMessage {
    private final String errorMessage;

    public ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public  static  ErrorMessage create(String errorMessage) {
    return new ErrorMessage(errorMessage);
    }
    public static ErrorMessage create(RuntimeException exception){
        return new ErrorMessage(exception.getMessage());
    }

    public String getErrorMessage() {
        return errorMessage;
    }


}
