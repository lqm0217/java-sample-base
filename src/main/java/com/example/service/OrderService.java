package com.example.service;

import com.example.model.OrderSummary;
import com.github.pagehelper.PageInfo;

public interface OrderService {

  OrderSummary getOrderById(Long id) throws Exception;

  PageInfo<OrderSummary> getOrders(int pageNum, int pageSize) throws Exception;
}
