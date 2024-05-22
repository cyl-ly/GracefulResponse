package com.cylin.gracefulresponse.controller;


import com.cylin.gracefulresponse.domain.dto.PersonDTO;
import com.cylin.gracefulresponse.domain.dto.UserInfoDTO;
import com.cylin.gracefulresponse.exception.PasswordErrorException;
import com.cylin.gracefulresponse.exception.UserEmptyException;
import com.feiniaojin.gracefulresponse.GracefulResponse;
import com.feiniaojin.gracefulresponse.api.ExcludeFromGracefulResponse;
import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class demo {

    @RequestMapping("/test0")
    public void test0(){
        //return "hello world!";
    }

    @GetMapping("/test1")
    public int test1(){
        return 999;
    }

    @GetMapping("/test2")
    public int test2(){
        throw new RuntimeException();
    }

    @GetMapping("/test3")
    public void test3(){
        throw new PasswordErrorException();
    }

    @GetMapping("/test4")
    public void test4(){
        throw new UserEmptyException("自定义异常信息-用户不存在");
    }

    @PostMapping("/test5")
    public void test5(@Valid @RequestBody UserInfoDTO userInfoDTO){

    }

    @GetMapping("/test6")
    @ValidationStatusCode(code = "5006")
    public void test6(@NotNull(message = "name不能为空") String name){

    }

    @GetMapping("/test7")
    public void test7(){
        GracefulResponse.raiseException("6001", "自定义异常信息-用户不存在");
    }

    @GetMapping("/test8")
    @ExcludeFromGracefulResponse
    public int test8(){
        return 10;
    }
}
