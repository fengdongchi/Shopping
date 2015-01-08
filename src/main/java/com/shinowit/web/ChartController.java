package com.shinowit.web;

import com.shinowit.entity.*;
import com.shinowit.framework.dao.ChartMapper;
import com.shinowit.framework.dao.TmeMerchandiseinfoMapper;
import com.shinowit.framework.dao.TmeOrderdetailsinfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
@RequestMapping(value = "/chartg")
public class ChartController {

    @Resource
    private TmeMerchandiseinfoMapper merchandiseinfo_dao;

    @Resource
    private ChartMapper char_dao;

    @RequestMapping(value = "/chart",method = RequestMethod.GET)
    public String chart(@RequestParam("merchandiseid")String merchandiseid,@RequestParam(value = "chartpageIndex",required = false)Integer chartpageIndex) {

        TmeMerchandiseinfo merchandise=merchandiseinfo_dao.selectByPrimaryKey(merchandiseid);

        Chart chartinfo=new Chart();

        chartinfo.setMerchandiseid(merchandiseid);
        chartinfo.setPrice(merchandise.getPrice());
        chartinfo.setDescribe(merchandise.getDescribe());
        chartinfo.setMerchandisename(merchandise.getMerchandisename());
        chartinfo.setPicpath(merchandise.getPicpath());

        char_dao.insert(chartinfo);

        return "redirect:/chartg/chart_list";
    }
    @RequestMapping(value = "/chart_list")
    public String chartlist(@RequestParam(value="chartpageIndex",required = false)Integer chartpageIndex,Map map){

        if(chartpageIndex==null){
            chartpageIndex=1;
        }
        ChartCriteria criteria=new ChartCriteria();
        criteria.setPageIndex(chartpageIndex);
        criteria.setPageSize(4);
        int totalPages;
        int record;

        record=char_dao.countByExample(criteria);
        totalPages=record/4;
        if(record%4>0){
            totalPages+=1;
        }

        List<Chart> chart_list=char_dao.selectPage(criteria);

        map.put("totalPages",totalPages);
        map.put("chartpageIndex",chartpageIndex);
        map.put("chart_list",chart_list);

        return "/views/chart";
    }
}
