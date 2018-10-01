package com.example.service.impl;

import com.example.dao.common.OrderSummaryMapper;
import com.example.model.OrderSummary;
import com.example.model.OrderSummaryExample;
import com.example.model.OrderSummaryExample.Criteria;
import com.example.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderSummaryMapper orderSummaryMapper;

  @Override
  public OrderSummary getOrderById(Long id) throws Exception {
    OrderSummary orderSummary = orderSummaryMapper.selectByPrimaryKey(id);

    if (Objects.isNull(orderSummary)) {
      throw new NotFoundException(StringUtils.join("Order(", id, ") is not found!"));
    }

    return orderSummary;
  }

  @Override
  public PageInfo<OrderSummary> getOrders(OrderSummary orderSummary, int pageNum, int pageSize)
      throws Exception {
    OrderSummaryExample example = new OrderSummaryExample();
    Criteria criteria = example.createCriteria();
    if (orderSummary.getUserId() != null) {
      criteria.andUserIdEqualTo(orderSummary.getUserId());
    }
    if (StringUtils.isNotEmpty(orderSummary.getZip())) {
      criteria.andZipEqualTo(orderSummary.getZip());
    }
    example.setOrderByClause("id");

    PageHelper.startPage(pageNum, pageSize);
    List<OrderSummary> orders = orderSummaryMapper.selectByExample(example);

    if (CollectionUtils.isEmpty(orders)) {
      throw new NotFoundException(StringUtils.join("Order is not found!"));
    }

    PageInfo<OrderSummary> pageInfo = new PageInfo(orders);

    return pageInfo;
  }
}
