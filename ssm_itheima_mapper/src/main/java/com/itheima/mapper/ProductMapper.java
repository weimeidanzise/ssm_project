package com.itheima.mapper;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    List<Product> findAll(@Param("productName") String productName) throws Exception;

    Product findProductById(String id) throws Exception;

    void save(Product product)throws Exception;

    void delete(String id) throws Exception;


}
