package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll")
    public String findAll(@RequestParam(required = false,defaultValue = "1")Integer pageNum,
                      @RequestParam(required = false,defaultValue = "3") Integer pageSize, Model model,
                          String productName) throws Exception {
        List<Product> productList = productService.findAll(pageNum,pageSize,productName);
        PageInfo page=new PageInfo(productList);
        model.addAttribute("productName",productName);
        model.addAttribute("page",page);
        System.out.println(productName+"6666666666666666666666666666666666666666");
        return "product-list";
    }
    @RequestMapping("/findProductById")
    public String findById(Model model,String id) throws Exception{
        Product byId = productService.findProductById(id);
        model.addAttribute("productList",byId);
        return "product-list";
    }

   
    @RequestMapping("/save")
    public String save(Product product) throws Exception{
        if (product!=null){
            productService.save(product);

        }
       return "redirect:/product/findAll";
    }
    @RequestMapping("/delete")
    public String delete(String[] ids)throws Exception{
        for (String id : ids) {
            productService.delete(id);
        }
        return "redirect:/product/findAll";
    }
}
