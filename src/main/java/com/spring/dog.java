package com.spring;

public class dog {
    private String name;
    private String nickName;
    private Integer birth;

    public dog(String name, String nickName, Integer birth) {
        this.name = name;
        this.nickName = nickName;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }
}





