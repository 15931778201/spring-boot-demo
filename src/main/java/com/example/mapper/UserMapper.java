package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: MaoLin
 * @Date: 2019/2/8 16:35
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    /**
     * @param username 用户名
     * @return 查询结果
     */
    @Select("SELECT * FROM t_user WHERE username = #{username}")
    List<User> findByUsername(@Param("username") String username);


    /**
     * xml配置方法
     * 保存用户信息
     * @param user 用户信息
     * @return 成功 1 失败 0
     */

    @Insert("INSERT INTO `t_user`(`username`,`password`) VALUES (#{username},#{password})")
    int insert(User user);
}