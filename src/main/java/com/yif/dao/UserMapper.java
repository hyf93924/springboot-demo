/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yif.dao;

import com.yif.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author heyif
 * @since v1.0 2018-10-29T20:56
 */
@Repository
@Mapper
public interface UserMapper {

    public String getPassword(String username);

    public String getRole(String username);

    public List<User> getUserList();
}
