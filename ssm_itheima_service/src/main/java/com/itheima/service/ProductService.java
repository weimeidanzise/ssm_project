package com.itheima.service;

import com.itheima.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll(Integer pageNum,Integer pageSize,String productName) throws Exception;
    Product findProductById(String id) throws Exception;

    void save(Product product)throws Exception;

    void delete(String id) throws Exception;


}
