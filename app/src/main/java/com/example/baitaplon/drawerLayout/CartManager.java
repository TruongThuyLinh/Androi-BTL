// CartManager.java
package com.example.baitaplon.drawerLayout;

import com.example.baitaplon.product;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private static List<product> cartList = new ArrayList<>();

    public static List<product> getCartList() {
        return cartList;
    }

    public static void addToCart(product product) {
        cartList.add(product);
    }

    public static void clearCart() {
        cartList.clear();
    }
}
