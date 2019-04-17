package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
    User login(String name,String password);
    public void delete(Integer id);
    public void update(User user);
    public  void  add(User user);
}
