package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value="/GetPwd1")
public class GetPwd1Controller {

    @RequestMapping(value="/getpwd1",method = RequestMethod.GET)
    public String getpwd1(){
        return "/views/GetPwd1";
    }

}
