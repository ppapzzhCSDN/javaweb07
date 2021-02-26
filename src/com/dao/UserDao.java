package com.dao;

import com.entitys.User;
import com.utils.DateUtil;
import com.utils.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//搞数据库的；
/**
 * @author zzh
 * @description
 * @date
 */
public class UserDao {
    public static ArrayList<User> listAll() {
        ArrayList<User> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        try {
            conn = DbUtil.getConn();
            String sql = "select * from sys_user ";

            prep = conn.prepareStatement(sql);
            rs = prep.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String username = rs.getString("username");
                Integer sex = rs.getInt("sex");
                Date createTime = rs.getDate("create_time");

                User user0 = new User();
                user0.setId(id);
                user0.setUsername(username);
                user0.setSex(sex);
                user0.setCreateTime(DateUtil.getDateString(createTime));
                list.add(user0);
            }
            System.out.println(list.size());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(rs, prep, conn);
            return list;
        }
    }
    public int addGoods(User user) {
        int result = 0;
        Connection conn = null;
        PreparedStatement prep = null;
        try {
            conn = DbUtil.getConn();
            String sql = "insert into sys_user(username,email,age,sex,create_time) values (?,?,?,?,?)";
            prep = conn.prepareStatement(sql);
//            prep.setString(1, user.getId());//id是自动增加 不用
            prep.setString(1,user.getUsername());
            prep.setString(2, user.getEmail());
            prep.setInt(3, user.getAge());
            prep.setInt(4, user.getSex());
            prep.setString(5, user.getCreateTime());
            result = prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(prep, conn);
        }
        return result;
    }
}
