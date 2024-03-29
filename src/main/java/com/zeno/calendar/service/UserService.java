package com.zeno.calendar.service;

import com.zeno.calendar.pojo.User;

public interface UserService {
    boolean queryEmailIsExist(String email);

    boolean queryUsernameIsExist(String username);

    void saveUser(User user);

    User queryUserForLogin(String email, String password);

    void updateUserInfo(User user);

    User queryUserInfo(String userId);

}