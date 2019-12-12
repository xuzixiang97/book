package com.laofuzi.book.entity.request;

import com.laofuzi.book.entity.Cart;
import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {
    private Long userId;
    private Long addressId;
    private List<Long> cartList;
    /**
     * 详情页下单 书籍id
     */
    private Long bookId;
    /**
     * 书籍数量
     */
    private Integer account;
}
