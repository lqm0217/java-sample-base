package com.example.controller.api;

import com.example.dao.common.StockMapper;
import com.example.model.Stock;
import com.example.model.StockExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stock")
@Api(value = "StockController")
public class StockController {

  @Autowired
  StockMapper stockMapper;

  @GetMapping(value = "/getStock/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @ResponseBody
  @ApiOperation(value = "getStockByKey", notes = "getStockByKey", httpMethod = "GET")
  public Stock getStockByKey(@PathVariable("id") Long id) throws Exception {

    throw new Exception("GlobalErrorController test");
    // return stockMapper.selectByPrimaryKey(id);
  }

  @GetMapping(value = "/getStocks", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @ResponseBody
  @ApiOperation(value = "getStocks", notes = "getStocks", httpMethod = "GET")
  public List<Stock> getStocks() {

    return stockMapper.selectByExample(new StockExample());
  }

}
