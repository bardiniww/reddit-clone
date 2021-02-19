package com.practice.reddit.exception;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exceptionMessage) {
        super(exceptionMessage);
    }

    public SpringRedditException(String exceptionMessage, Exception e) {
        super(exceptionMessage, e);
    }
}
