package com.example.baitaplon.drawerLayout;

import com.example.baitaplon.product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static Cart instance;
    private List<product> products = new ArrayList<>();

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addProduct(product product) {
        products.add(product);
    }
    public void removeProduct(product product) {
        products.remove(product);
    }
    public List<product> getProducts() {
        return products;
    }
    //phương thức lấy tổng
    public int getTotalProducts() {
        return products.size();
    }
}
