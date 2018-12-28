package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.domain.Product;
import com.itheima.mapper.ProductMapper;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll(Integer pageNum,Integer pageSize,String productName) throws Exception {
        PageHelper.startPage(pageNum,pageSize);
        System.out.println("9999999999999999999999999999999"+productName);
        return productMapper.findAll(productName);
    }

    @Override
    public Product findProductById(String id) throws Exception {
        return productMapper.findProductById(id);
    }

    @Override
    public void save(Product product) throws Exception {
        productMapper.save(product);
    }

    @Override
    public void delete(String id) throws Exception {
        productMapper.delete(id);
    }




}
