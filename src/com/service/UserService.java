package com.service;


import com.dao.UserDao;
import com.entitys.User;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zzh
 * @description
 * @date
 */

public class UserService {
   private UserDao userDao= new UserDao();
    public List<User> listAll(){
        return new ArrayList<>();
    }

}
