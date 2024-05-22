package com.cylin.gracefulresponse.exception;

import com.feiniaojin.gracefulresponse.api.ExceptionMapper;


@ExceptionMapper(code = "5001", msg = "密码错误")
public final class PasswordErrorException extends  RuntimeException{

}
