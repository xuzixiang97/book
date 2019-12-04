package com.laofuzi.book.entity.response;

import lombok.Data;

/**
 * OrderItemDetailPreponse
 *
 * @author <a href="mailto:zixiang.xu@yunhutech.com">huohe</a>
 * @since 2019/12/04
 * <p>
 * desc：
 */
@Data
public class OrderItemDetailResponse {

    private Long id;

    private Long orderId;

    private Long bookId;

    private String bookName;

    private Integer quantity;

    private Integer unitprice;

    private String author;

    private String img;
}
