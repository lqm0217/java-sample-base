package com.example.controller;

import com.example.form.OrderForm;
import com.example.model.OrderSummary;
import com.example.service.OrderService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * get order information. <br/> structure: controller+service+dao
 */
@RestController
@Validated
@Api(value = "OrderController")
public class OrderController {

  @Autowired
  OrderService orderService;

  /**
   * get single order summary information by id.
   */
  @GetMapping("/getOrder/{id}")
  @ResponseBody
  @ApiOperation(value = "getOrder", notes = "getOrder", httpMethod = "GET")
  public OrderSummary getOrder(@PathVariable(value = "id") Long id) throws Exception {

    return orderService.getOrderById(id);
  }

  /**
   * get order summary information.
   */
  @PostMapping("/getOrders")
  @ResponseBody
  @ApiOperation(value = "getOrders", notes = "getOrders", httpMethod = "POST")
  public PageInfo<OrderSummary> getOrders(@RequestBody OrderForm from) throws Exception {

    OrderSummary orderSummary = new OrderSummary();
    BeanUtils.copyProperties(from, orderSummary);

    PageInfo<OrderSummary> pageInfo = orderService
        .getOrders(orderSummary, Optional.ofNullable(from.getPageNum()).orElse(1),
            Optional.ofNullable(from.getPageSize()).orElse(10));
    return pageInfo;
  }

  /**
   * test for spring session, use redis
   */
  @GetMapping("/session")
  @ResponseBody
  @ApiOperation(value = "session", notes = "session", httpMethod = "GET")
  public Object getSession(HttpServletRequest request) {

    request.getSession().setAttribute("requestUrl", "/session");

    Map<String, Object> map = new HashMap<>();
    map.put("sessionId", request.getSession().getId());
    map.put("message", request.getSession().getAttribute("requestUrl"));
    return map;
  }
}
