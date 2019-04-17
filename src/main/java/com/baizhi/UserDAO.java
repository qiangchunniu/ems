package com.baizhi;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface UserDAO {
    List<User> selectAll();
    User login(@Param("name")String name, @Param("password") String password);
    public void delete(@Param("id")Integer id);
    public void update(User user);
    public  void  add(User user);
}
