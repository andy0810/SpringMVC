package com.sun.springmvc.controller;


import com.sun.springmvc.bean.UserSessionBean;
import com.sun.springmvc.context.SessionContext;
import com.sun.springmvc.entity.Order;
import com.sun.springmvc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author sunzhongshu
 * @since 2020-01-08
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    SessionContext<UserSessionBean> sessionContext;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getAll")
    @ResponseBody
    public String getAll(){
        System.out.println(sessionContext.get());
      //  List<Order> orders = orderService.selectList(null);
        return null;
    }
    public static void main(String[] args){
        String s = "/vehicleData/vehicleList/aa/dd";
        for (String s1:s.split("vehicleData")){
            System.out.println(s1);
        }
        System.out.println("--------------------"+s.split("vehicleList").length);
        for (String s1:"/dd".split("dd")){
            System.out.println(s1);
        }
        System.out.println("-------"+s.split("dd")[0] + "xx");
        System.out.println("/dd".split("dd").length);
    }
}

