package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Orders;
import com.itheima.mapper.OrdersMapper;
import com.itheima.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/findAll")
    public String findAll(Model model,@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,
                          @RequestParam(name = "pageSize",required = true,defaultValue = "5") Integer pageSize
                        ) throws Exception {
        List<Orders> ordersList = ordersService.findAll(pageNum,pageSize);
        PageInfo page=new PageInfo(ordersList);
        model.addAttribute("page",page);
        return "orders-list";
    }
    @RequestMapping("/findById")
    public String findById(Model model,@RequestParam(name = "id", required = true)String ordersId)throws Exception{
        Orders ids = ordersService.findById(ordersId);
        System.out.println(ordersId+"66666666666666666666666666666666666");
        model.addAttribute("orders",ids);
        return "orders-show";
    }

}
