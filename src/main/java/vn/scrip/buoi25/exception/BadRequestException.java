package vn.scrip.buoi26.exception;
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}