package com.zhangjunlin.mongo.service;

import com.zhangjunlin.mongo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Tony
 * @description
 * @createTime 2018/6/28 14:23
 */
@Repository
public interface UserService {

    void save(User users);

    User findByName(String name);
}
