package com.demo.dao;

import com.demo.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户Dao类
 *
 * @author Wwwwei
 */

@Repository
public interface UserDao {
    /**
     * 插入用户记录
     *
     * @param userEntity
     * @return
     */
    Integer insert(UserEntity userEntity);

    /**
     * 删除用户记录
     *
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 更新用户记录
     *
     * @param userEntity
     * @return
     */
    Integer update(UserEntity userEntity);

    /**
     * 根据用户id查找用户
     *
     * @param id
     * @return
     */
    UserEntity selectById(Integer id);


    //根据用户名和密码查询用户
    //注解的两个参数会自动封装成map集合，括号内即为键



    public List<UserEntity> findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);




}
