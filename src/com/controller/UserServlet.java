package com.controller;

import com.dao.UserDao;
import com.entitys.User;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author zzh
 * @description
 * @date
 */
@WebServlet("/sys/user")
public class UserServlet extends HttpServlet {

    private UserService userService=new UserService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> listUser = UserDao.listAll();
        request.setAttribute("listUser",listUser);
        request.getRequestDispatcher("/userList.jsp").forward(request,response);//请求转发 数据传进去
    }
}
