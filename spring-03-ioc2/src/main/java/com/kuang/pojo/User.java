package com.kuang.pojo;

/**
 * @author cs0324
 * @date 2021/03/21 17:56
 */
public class User {
    private String name;

    User() {
        System.out.println("空参构造");
    }

    User(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name:"+name);
    }
}
