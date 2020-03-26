package com.po;

import lombok.Data;

import java.util.Map;

@Data
public class OrderInfo {
    private Order order;
    private Map<Product, Integer> map;
}
