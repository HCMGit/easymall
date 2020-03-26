package com.service;

import com.po.Product;

import java.util.Map;

public interface CartService {

    public Product addToCart(String pid, Integer buyNum);

    public Product getProduct(String pid);
}
