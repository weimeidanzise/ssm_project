package com.itheima.mapper;

import com.itheima.domain.Member;
import com.itheima.domain.Orders;
import com.itheima.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrdersMapper {
    List<Orders> findAll() throws Exception;

    Orders findById(String ordersId) throws Exception;
}
