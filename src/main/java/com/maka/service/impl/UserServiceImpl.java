package com.maka.service.impl;

import com.maka.comment.R;
import com.maka.comment.constants;
import com.maka.mapper.UserMapper;
import com.maka.pojo.Questions;
import com.maka.pojo.User;
import com.maka.service.UserService;
import com.maka.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    //登录
    public R login(String userCode, String userPwd) {
        R r = new R();

        try {
            String mdPwd = MD5.getMD5(userPwd).toString();
            User user = userMapper.login(userCode, mdPwd);

            if (user!=null){

                constants.USER=user;
                System.out.println(constants.USER.toString());
                r.setCode(200);
                r.setMsg("登录成功！");
            }else {
                r.setCode(501);
                r.setMsg("你特么自己的账号密码都不知道了吗！");
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            r.setCode(500);
            r.setMsg("服务器异常！");
        }
        return r;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    //注册
    public R register(User user) {
        R r = new R();
        try {
            String mdPwd = MD5.getMD5(user.getUserPwd()).toString();
            user.setUserPwd(mdPwd);
            if(userMapper.register(user)>0){
                r.setCode(200);
                r.setMsg("注册成功！");
            }else {
                r.setCode(501);
                r.setMsg("注册失败！");
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            r.setCode(500);
            r.setMsg("服务器异常！");
        }
        return r;
    }
    //查询问题答案
    @Override
    public R queryQuestions(int questionId) {
        R r = new R();
        try{
            Questions questions = userMapper.queryQuestions(questionId);
            if (questions==null){
                r.setCode(501);
                r.setMsg("没有这个问题");
            }else{
                r.setCode(200);
                r.setMsg("查询成功");
                r.setData(questions);
            }
        }catch (Exception e) {
            e.printStackTrace();
            r.setCode(500);
            r.setMsg("服务器异常！");
        }
        return r;
    }
}
