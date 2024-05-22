package com.cylin.gracefulresponse.config;

import com.cylin.gracefulresponse.exception.NotFoundException;
import com.feiniaojin.gracefulresponse.AbstractExceptionAliasRegisterConfig;
import com.feiniaojin.gracefulresponse.ExceptionAliasRegister;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GracefulResponseConfig extends AbstractExceptionAliasRegisterConfig {

    @Override
    protected void registerAlias(ExceptionAliasRegister aliasRegister) {
        //注册异常别名
        aliasRegister.doRegisterExceptionAlias(NotFoundException.class);
    }
}
