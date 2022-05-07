package com.example.imageupload.exception;

public class ErrorPath {

    public static String getErrorPath(Class<?> clazz) {
        return clazz.getPackage().toString();
    }
}


