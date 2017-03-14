package com.rc.ws.controller;

import com.rc.ws.models.GreetingModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by root on 2/27/17.
 */
@Controller
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template="Hello, %s!";

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    GreetingModel sayHello(@RequestParam(value = "name",required = false,defaultValue = "RoyalCyber") String name){
        return new GreetingModel("1",String.format(template,name));
    }
}
