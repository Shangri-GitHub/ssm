package com.demo.service;

import com.demo.dao.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户服务类
 *
 * @author Wwwwei
 */
public interface UserService {

    Integer createUser(UserEntity userEntity);

    List<UserEntity> login(String name, String password);

    Integer updateUser(UserEntity userEntity);

    Integer deleteUser(Integer id);

    UserEntity getUserById(Integer id);
}
