package com.jinhao.ssmbyspringboot.write.mapper;

import com.jinhao.ssmbyspringboot.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zlh
 * @title: UserWriteMapper
 * @projectName ssmbyspringboot
 * @description: TODO
 * @date 2020/6/1611:18
 */
@Mapper
public interface UserWriteMapper {
    @Insert("INSERT INTO `student_master`.`basic_user` (`id`, `basic_username`, `basic_usersex`, `basic_useraddr`) " +
            "VALUES " +
            "(default, #{username}, #{sex}, #{address})")
    public void insert(User user);
}
