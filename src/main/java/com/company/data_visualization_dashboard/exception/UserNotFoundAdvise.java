package com.company.data_visualization_dashboard.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class UserNotFoundAdvise {
    
@ResponseBody
@ExceptionHandler(UserNotFoundException.class)
    public Map<String ,String> exceptionHandler(UserNotFoundException exception)
    {
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",exception.getMessage());

        return errorMap;
    }
}
