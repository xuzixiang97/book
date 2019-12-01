package com.laofuzi.book.entity.request;

import com.laofuzi.book.entity.Cart;
import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {
    private Long userId;
    private Long addressId;
    private List<Cart> cartList;
}
