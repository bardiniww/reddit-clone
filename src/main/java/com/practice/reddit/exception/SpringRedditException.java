package com.practice.reddit.exception;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
