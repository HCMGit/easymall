package com.service;

import com.po.*;

import java.util.List;
import java.util.Map;

public interface OrderService {
    public boolean addOrder(Order order, List<OrderItem> list);

    public List<OrderInfo> findOrderByUserId(int id);

}
