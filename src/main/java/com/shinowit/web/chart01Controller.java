package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value="/chart01")
public class chart01Controller {

    @RequestMapping(value="/chart001",method = RequestMethod.GET)
    public String char01(){
        return "/views/chart01";
    }
}
