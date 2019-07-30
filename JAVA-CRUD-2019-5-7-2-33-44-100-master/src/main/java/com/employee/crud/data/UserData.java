package com.employee.crud.data;

import com.employee.crud.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    public static List<User> userData() {
        List<User> userList = new ArrayList<>();
        User userOne = new User(0, "小明", 20,"男");
        User userTwo = new User(1, "小红", 19, "女");
        User userThree = new User(2, "小智", 15, "男");
        User userFour = new User(3, "小钢", 16, "女");
        User userFive = new User(4, "小夏", 15, "女");
        userList.add(userOne);
        userList.add(userTwo);
        userList.add(userThree);
        userList.add(userFour);
        userList.add(userFive);
        return userList;
    }
}
