package com.yjy.demo.Pojo;

public class User {

    private  String username;
    private  String password;
    private  int id;

    User(String username,String password){
        this.password=password;
        this.username=username;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
