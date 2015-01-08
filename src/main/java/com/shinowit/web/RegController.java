package com.shinowit.web;


import com.shinowit.Email.Email;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import com.shinowit.framework.dao.TbaMemberinfoMapper;
import com.shinowit.validate.UserinfoValidator;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping(value="/views")
public class RegController {

    @Resource
    private TbaMemberinfoMapper memberinfo_dao;

    @Resource
    private Email mail;

    @RequestMapping(value = "/reg1",method = RequestMethod.GET)
    public String prepareNew(@ModelAttribute("user") TbaMemberinfo user){
//        user.setAge(20);//提供一些缺省值简化用户输入
        return "/views/reg";
    }


    @RequestMapping(value = "/reg1",method = RequestMethod.POST)
    public String reg1(@ModelAttribute("user") TbaMemberinfo user,RedirectAttributes redirectAttributes,Map map,@RequestParam("Validate_Code")String valid,@RequestParam("pwd1")String pwd1,@RequestParam("email")String email,HttpSession session,HttpServletRequest request) {

//        request.getSession().getAttribute("rand");
//
        String valid_code = (String) session.getAttribute("rand");

        String valid_string=request.getSession(true).getId();

        String valid_url="http://localhost:8080/user/valid?username="+user+"&validString="+valid_string;
        mail.sendMail("用户激活",valid_url,email);


//        TbaMemberinfo mebinfo = memberinfo_dao.selectByPrimaryKey(user.getUsername());

        TbaMemberinfoCriteria criteria=new TbaMemberinfoCriteria();
        criteria.createCriteria().andUsernameEqualTo(user.getUsername());
        //TbaMemberinfoCriteria.Criteria tiaojian=criteria.createCriteria();
        //tiaojian.andUsernameEqualTo(user.getUsername());
        List<TbaMemberinfo> member_list=memberinfo_dao.selectByExample(criteria);

        if ((valid_code.equals(valid)) && (member_list.size()==0 )&&(user.getPwd().equals(pwd1))) {

            int user_info = memberinfo_dao.insert(user);

            if (0 < user_info) {
                redirectAttributes.addFlashAttribute("msg", "注册成功!");
                return "redirect:/loging/login";
            }
        }


            redirectAttributes.addAttribute("msg", "验证码输入错误或者用户名已存在！!");//前台拿不到msg怎么回事！
            return "redirect:/views/reg1";


    }



}
