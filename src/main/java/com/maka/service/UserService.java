package com.maka.service;

import com.maka.comment.R;
import com.maka.pojo.Questions;
import com.maka.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    //登录
    R login(String userCode,String userPwd);

    //注册
    R register(User user);



    //查询常见问题
    R queryQuestions(int questionId);

}
