package com.example.imageupload.exception;


public class BusinessException extends RuntimeException {

    private final BaseExceptionType baseExceptionType;
    private final Class<?> clazz;

    public BusinessException(final BaseExceptionType baseExceptionType, Class<?> clazz) {
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
