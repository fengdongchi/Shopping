package com.shinowit.web;

import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import com.shinowit.framework.dao.TbaMemberinfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/26.
 */
@Controller
@RequestMapping(value="/loging")
public class LoginController {

    @Resource
    private TbaMemberinfoMapper login_dao;

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login(@ModelAttribute("loginfo")TbaMemberinfo loginfo){
        return "/views/login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login1(@Valid @ModelAttribute("loginfo")TbaMemberinfo loginfo,Map map,BindingResult bindingResult,HttpSession session){


        if (bindingResult.hasErrors()) {
            return "redirect:/loging/login";
        }

        TbaMemberinfoCriteria criteria=new TbaMemberinfoCriteria();
        criteria.createCriteria().andUsernameEqualTo(loginfo.getUsername());
        List<TbaMemberinfo> login_list=login_dao.selectByExample(criteria);

        if(login_list.size()>0){
            for(TbaMemberinfo u:login_list){
                if(u.getPwd().equals(loginfo.getPwd())){
                    session.setAttribute("username",u.getUsername());
                    return "redirect:/indexg/index";
                }
            }
        }
        map.put("msg","账号或密码错误，请重新输入！");
        return "redirect:/loging/login";
    }

}
