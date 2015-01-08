package com.shinowit.web;

import com.shinowit.entity.TmeMerchandisecinfoCriteria;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoCriteria;
import com.shinowit.framework.dao.TmeMerchandisecinfoMapper;
import com.shinowit.framework.dao.TmeMerchandiseinfoMapper;
import org.springframework.http.HttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value="/innerg")
public class InnerController {

    @Resource
    private TmeMerchandiseinfoMapper merinfo_dao;

    @RequestMapping(value="/inner")
    public String inner(@RequestParam("merchandisecid")String merchandisecid,Map map,HttpServletRequest request){

        request.getSession().setAttribute("merchandisecid",merchandisecid);

        TmeMerchandiseinfoCriteria criteria=new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tiaojian=criteria.createCriteria();
        tiaojian.andMerchandisecidEqualTo(merchandisecid);
        List<TmeMerchandiseinfo> merinfo_list=merinfo_dao.selectByExample(criteria);
        map.put("merinfo_list",merinfo_list);
//        map.put("merchandisecid",merchandisecid);
        return "/views/inner-page";
    }
    @RequestMapping(value="/innerinfo")
    public String innerinfo(@RequestParam(value="merchandiseid",required = false)String merchandiseid,HttpSession session,HttpServletRequest request){
        if(merchandiseid==null){
            merchandiseid="00001";
        }

        TmeMerchandiseinfo merchaninfo=merinfo_dao.selectByPrimaryKey(merchandiseid);
        request.getSession().setAttribute("merchaninfo",merchaninfo);
        String merchandisecid=merchaninfo.getMerchandisecid();

        return "redirect:/innerg/inner?merchandisecid="+merchandisecid;
    }



}
