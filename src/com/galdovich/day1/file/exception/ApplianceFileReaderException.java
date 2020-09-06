package com.galdovich.day1.file.exception;

public class ApplianceFileReaderException extends Exception {

    public ApplianceFileReaderException() {
        super();
    }

    public ApplianceFileReaderException(String message) {
        super(message);
    }

    public ApplianceFileReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplianceFileReaderException(Throwable cause) {
        super(cause);
    }
}
