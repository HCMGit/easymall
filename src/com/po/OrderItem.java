package com.po;

import lombok.Data;

@Data
public class OrderItem {
    private String order_id;
    private String product_id;
    private int buynum;
}
