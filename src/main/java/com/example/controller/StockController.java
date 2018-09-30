package com.example.controller;

import com.example.dao.common.StockMapper;
import com.example.model.Stock;
import com.example.model.StockExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "StockController")
public class StockController {

  @Autowired
  StockMapper stockMapper;

  @GetMapping("/getStock/{id}")
  @ResponseBody
  @ApiOperation(value = "getStockByKey", notes = "getStockByKey", httpMethod = "GET")
  public Stock getStockByKey(@PathVariable("id") Long id) {

    return stockMapper.selectByPrimaryKey(id);
  }

  @GetMapping("/getStocks")
  @ResponseBody
  @ApiOperation(value = "getStocks", notes = "getStocks", httpMethod = "GET")
  public List<Stock> getStocks() {

    return stockMapper.selectByExample(new StockExample());
  }

}
