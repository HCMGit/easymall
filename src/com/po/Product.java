package com.po;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private Double price;
    private String category;
    private int pnum;
    private String imgurl;
    private String description;

    @Override
    public int hashCode() {
        return id==null ? 0 : id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Product) {
            Product p = (Product) obj;
            if (id != null && id.equals(p.getId())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
