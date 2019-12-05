package com.laofuzi.book.entity.response;

import lombok.Data;

/**
 * UserCartResponse
 *
 * @author <a href="mailto:zixiang.xu@yunhutech.com">huohe</a>
 * @since 2019/12/04
 * <p>
 * desc：
 */
@Data
public class UserCartResponse {
    private Long id;

    private Long userId;

    private Long bookId;

    private Integer number;

    private String name;

    private String describe;

    private String author;

    private String publisher;

    private String publishDate;

    private Integer unitprice;

    private Integer quantity;

    private Long categoryId;

    private String img;

    private Integer score;

}
