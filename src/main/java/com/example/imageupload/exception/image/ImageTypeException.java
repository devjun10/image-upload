package com.example.imageupload.exception.image;

import com.example.imageupload.exception.BaseExceptionType;
import org.springframework.http.HttpStatus;

public enum ImageTypeException implements BaseExceptionType {

    FileUploadFailedException(500, "이미지 업로드에 실패했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final int errorCode;
    private final String message;
    private final HttpStatus httpStatus;

    ImageTypeException(int errorCode, String message, HttpStatus httpStatus) {
        this.errorCode = errorCode;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
