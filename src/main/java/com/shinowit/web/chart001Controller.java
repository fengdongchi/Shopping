package com.shinowit.web;

import com.shinowit.entity.TbaMembeaddrinfo;
import com.shinowit.entity.TbaMembeaddrinfoCriteria;
import com.shinowit.framework.dao.TbaMembeaddrinfoMapper;
import com.shinowit.framework.dao.TbaMemberinfoMapper;
import org.omg.Dynamic.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/6.
 */
@Controller
@RequestMapping(value = "/meraddr")
public class chart001Controller {
    @Resource
    private TbaMembeaddrinfoMapper meraddr_dao;

    @RequestMapping(value = "/addr",method = RequestMethod.GET)
    public String select(@RequestParam("username")String username,Map map){

        TbaMembeaddrinfoCriteria criteria=new TbaMembeaddrinfoCriteria();
        TbaMembeaddrinfoCriteria.Criteria tiaojian=criteria.createCriteria();
        tiaojian.andUsernameEqualTo(username);
        List<TbaMembeaddrinfo> meraddinfo= meraddr_dao.selectByExample(criteria);
        if(meraddinfo.size()>0){
            for(TbaMembeaddrinfo meraddrinfo:meraddinfo){
                map.put("meraddrinfo",meraddrinfo);
            }
        }

        return "/views/chart01";
    }
}
