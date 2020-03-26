package com.service;

import com.po.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();

    public String getProductImg(String imgUrl);

    public List<Product> searchProduct(Product product);

    public Product getProductByPid(String pid);
}
