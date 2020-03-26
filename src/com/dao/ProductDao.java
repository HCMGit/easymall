package com.dao;

import com.po.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productDao")
@Mapper
public interface ProductDao {
    public List<Product> selectProductByPid(String pid);

    public void updateProductNum(Product product);

    public List<Product> getAllProduct();

    public List<Product> searchProduct(Product product);
}
