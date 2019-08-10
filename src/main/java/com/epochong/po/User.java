package com.epochong.po;

/**
 * @author epochong
 * @date 2019/8/9 21:50
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class User {
    private int userId;

    private String userName;

    private String userAddr;

    public User() {

    }

    public User(int userId, String userName, String userAddr) {
        this.userId = userId;
        this.userName = userName;
        this.userAddr = userAddr;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddr='" + userAddr + '\'' +
                '}';
    }
}
