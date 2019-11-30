package com.laofuzi.book.entity;

import lombok.Data;

@Data

public class User extends BaseDO {
    private Long id;

    private String username;

    private String password;

    private String salt;

    private String email;

    private Integer type;

    private Integer status;

    private String activationCode;

    private String headerUrl;

}