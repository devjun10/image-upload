package com.example.imageupload.exception;

import com.example.imageupload.exception.BaseExceptionType;

public class FileUploadFailedException extends RuntimeException {
    private final BaseExceptionType baseExceptionType;
    private final Class<?> clazz;

    public FileUploadFailedException(final BaseExceptionType baseExceptionType, Class<?> clazz) {
        super(baseExceptionType.getMessage());
        this.baseExceptionType = baseExceptionType;
        this.clazz = clazz;
    }

    public BaseExceptionType getBaseExceptionType() {
        return baseExceptionType;
    }

    public String getErrorPath(){
        return clazz.getPackage().toString();
    }
}
