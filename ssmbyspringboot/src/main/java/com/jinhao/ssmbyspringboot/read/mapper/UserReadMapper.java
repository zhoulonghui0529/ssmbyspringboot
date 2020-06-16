package com.jinhao.ssmbyspringboot.read.mapper;

import com.jinhao.ssmbyspringboot.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author zlh
 * @title: UserMapper
 * @projectName ssmbyspringboot
 * @description: TODO
 * @date 2020/6/1011:08
 */
@Mapper
public interface UserReadMapper {
    @Select({"select * from basic_user where id=#{id}"})
//    @ResultType(value = User.class)
    @Results(id = "userMap",value = {
            @Result(column = "id",property = "id",jdbcType = JdbcType.INTEGER),
            @Result(column = "basic_username",property = "username",jdbcType = JdbcType.VARCHAR),
            @Result(column = "basic_usersex",property = "sex",jdbcType = JdbcType.VARCHAR),
            @Result(column = "basic_useraddr",property = "address",jdbcType = JdbcType.VARCHAR)
    })
    public User selectUserById(@Param(value = "id") Integer id);

    @Select({"select * from basic_user"})
    @ResultMap("userMap")
    public List<User> selectUserList();
}
