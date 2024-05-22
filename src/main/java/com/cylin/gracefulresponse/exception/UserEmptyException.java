package com.cylin.gracefulresponse.exception;


import com.feiniaojin.gracefulresponse.api.ExceptionMapper;

@ExceptionMapper(code = "5002", msg = "用户不存在", msgReplaceable = true)
public final class UserEmptyException extends RuntimeException{
    public UserEmptyException(){

    }

    public UserEmptyException(String message){
        super(message);
    }
    public UserEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserEmptyException(Throwable cause) {
        super(cause);
    }

    public UserEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
