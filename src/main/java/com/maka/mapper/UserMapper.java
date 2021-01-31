package com.maka.mapper;

import com.maka.pojo.Questions;
import com.maka.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //登录
    User login(@Param("userCode") String userCode, @Param("userPwd") String userPwd);

    //注册
    int register(User user);

    //查询常见问题
    Questions queryQuestions(@Param("questionId") int questionId);
}
