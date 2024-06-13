package com.convertor.constants;

public class FileProcessException extends RuntimeException {

    public FileProcessException(Throwable cause) {
        super(cause);
    }

    public FileProcessException(String message) {
        super(message);
    }
}
