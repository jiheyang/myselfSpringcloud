package com.spring.providertwo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "user")
public class User implements Serializable{

    @TableField
    private Integer id;

    private String name;

    private Integer age;

    private String email;

}
