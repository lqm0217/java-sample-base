package com.example.service.impl;

import com.example.dao.common.OrderSummaryMapper;
import com.example.model.OrderSummary;
import junit.framework.TestCase;
import org.apache.ibatis.javassist.NotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Date;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class OrderServiceImplTest {

  @InjectMocks
  OrderServiceImpl service;
  @Mock
  OrderSummaryMapper mapper;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void getOrderById_1() {
    OrderSummary osMock = new OrderSummary(Long.parseLong("1"), new Date(), true, 5, "12131232342");

    when(mapper.selectByPrimaryKey(Mockito.anyLong())).thenReturn(osMock);
    try {
      OrderSummary osResult = service.getOrderById(Long.parseLong("1"));
      TestCase.assertEquals(osMock, osResult);
    } catch (Exception ex) {
      TestCase.fail();
    }
  }

  @Test
  public void getOrderById_2() {
    when(mapper.selectByPrimaryKey(Mockito.anyLong())).thenReturn(null);
    try {
      OrderSummary osResult = service.getOrderById(Long.parseLong("1"));
      TestCase.fail();

    } catch (Exception ex) {
      TestCase.assertEquals(NotFoundException.class, ex.getClass());
      TestCase.assertEquals("Order(1) is not found!", ex.getMessage());

    }
  }
}
