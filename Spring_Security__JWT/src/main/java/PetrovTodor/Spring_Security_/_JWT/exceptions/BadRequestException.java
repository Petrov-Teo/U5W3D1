package PetrovTodor.Spring_Security_._JWT.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String st) {
        super("Verifica i campi inseriti err-400" + st + ":");
    }
}
