package com.itheima.service;

import com.itheima.domain.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll(Integer pageNum,Integer pageSize) throws Exception;
    Orders findById(String ordersId) throws Exception;
}
