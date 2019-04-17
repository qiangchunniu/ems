package com.baizhi.serviceimp;

import com.baizhi.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceimp implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> selectAll() {
        List<User> list = userDAO.selectAll();
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User login(String name, String password) {
        User login = userDAO.login(name, password);
        return login;
    }

    @Override
    public void delete(Integer id) {
        userDAO.delete(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void add(User user) {
        user.setId(null);
        user.setPassword(null);
        user.setStatr("0");
        userDAO.add(user);
    }
}
