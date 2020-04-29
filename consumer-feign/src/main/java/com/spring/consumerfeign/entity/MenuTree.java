package com.spring.consumerfeign.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MenuTree implements Serializable{

    private Integer id;

    private Integer pid;

    private String name;

}
