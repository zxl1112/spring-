package com.statement.controller;

import com.statement.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class StatementController {
    @Autowired
    private TestService testService;
    public void test(){
        testService.test();
    }
}
