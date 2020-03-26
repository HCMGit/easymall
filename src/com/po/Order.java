package com.po;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String id;
    private double money;
    private String receiverinfo;
    private int paystate;
    private Date ordertime;
    private int user_id;
}
