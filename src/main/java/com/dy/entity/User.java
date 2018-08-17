package com.dy.entity;

import java.util.List;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.13 11:13
 * @Description:
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private int deleteFlag;
    private User bestFriend;
    private List<User> friendList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public User getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(User bestFriend) {
        this.bestFriend = bestFriend;
    }

    public List<User> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<User> friendList) {
        this.friendList = friendList;
    }
}
