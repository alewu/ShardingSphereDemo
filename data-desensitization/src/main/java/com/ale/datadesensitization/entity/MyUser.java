package com.ale.datadesensitization.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MyUser implements Serializable {


    private long id;

    private String name;

    private String pwd;

}