package com.cyanfox.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Author bunny
 * @Date 2021/5/9 20:12
 * @Version 1.0
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
