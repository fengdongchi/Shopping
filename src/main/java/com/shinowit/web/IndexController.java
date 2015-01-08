package com.shinowit.web;

import com.shinowit.entity.*;
import com.shinowit.framework.dao.TmeMerchandisecinfoMapper;
import com.shinowit.framework.dao.TmeMerchandiseinfoMapper;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/indexg")
public class IndexController {
    @Resource
    private TmeMerchandisecinfoMapper mercinfo_dao;

    @Resource
    private TmeMerchandiseinfoMapper merinfo_dao;


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index1(@RequestParam(value="MerinpageIndex",required = false)Integer MerinpageIndex,HttpServletRequest request){
//
//        TmeMerchandiseinfoCriteria criteria=new TmeMerchandiseinfoCriteria();
//        TmeMerchandiseinfoCriteria.Criteria tiaojian=criteria.createCriteria();
//        tiaojian.andIdIsNotNull();
//        List<TmeMerchandiseinfo> merinfo_list=merinfo_dao.selectByExample(criteria);
//        request.getSession().setAttribute("merinfo_list",merinfo_list);

        if(MerinpageIndex==null){
            MerinpageIndex=1;
        }

        int totalPages;
        int record;
        TmeMerchandiseinfoCriteria criteria=new TmeMerchandiseinfoCriteria();
        criteria.setPageIndex(MerinpageIndex);
        criteria.setPageSize(4);
        try{

            record=merinfo_dao.countByExample(criteria);
            totalPages=record/4;
            if(record%4>0){
                totalPages+=1;
            }
            List<TmeMerchandiseinfo> merinfo_list=merinfo_dao.selectPage(criteria);

            request.getSession().setAttribute("merinfo_list",merinfo_list);
            request.getSession().setAttribute("totalPages",totalPages);
            request.getSession().setAttribute("MerinpageIndex",MerinpageIndex);
        }catch (Exception e){
            e.printStackTrace();
        }


        return "redirect:/indexg/merinfo";


    }


    @RequestMapping(value = "/merinfo",method = RequestMethod.GET)
    public String inner(@RequestParam(value="MerCpageIndex",required = false) Integer MerCpageIndex, Map map) {
        if (MerCpageIndex ==null) {
            MerCpageIndex = 1;
        }
        int totalPage;
        int record;
        TmeMerchandisecinfoCriteria criteria = new TmeMerchandisecinfoCriteria();
        criteria.setPageSize(10);
        criteria.setPageIndex(MerCpageIndex);
        try {
            List<TmeMerchandisecinfo> mercinfo_list = mercinfo_dao.selectPage(criteria);

            record = mercinfo_dao.countByExample(criteria);

            totalPage = record / 10;
            if (record % 10 > 0) {
                totalPage += 1;
            }

            map.put("mercinfo_list", mercinfo_list);
            map.put("totalPage", totalPage);
            map.put("MerCpageIndex", MerCpageIndex);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/views/index";

    }

}
