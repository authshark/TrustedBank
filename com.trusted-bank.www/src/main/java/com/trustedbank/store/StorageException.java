package com.trustedbank.store;


public class StorageException extends Exception{
    public StorageException() {
    }

    public StorageException(String string) {
        super(string);
    }

    public StorageException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public StorageException(Throwable throwable) {
        super(throwable);
    }
}
