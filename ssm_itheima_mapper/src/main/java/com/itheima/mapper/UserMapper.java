package com.itheima.mapper;

import com.itheima.domain.UserInfo;

public interface UserMapper {
     UserInfo findByUserName(String username) throws Exception;
}
