package com.maka.controller;

import com.maka.comment.R;
import com.maka.pojo.User;
import com.maka.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
//@CrossOrigin
@Api(value = "用户数据test",tags = "用户数据接口API")
public class UserController {
    @Autowired
    private UserService userService;
    //登录
    @GetMapping("/login")
    @ApiOperation(value = "用户登录接口",notes = "验证用户的用户名和密码",httpMethod = "get", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userCode",value = "用户名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "userPwd",value = "密码",paramType = "query",dataType = "String",required = true)
    })
    @ResponseBody
    public R login(String userCode,String userPwd){

        return userService.login(userCode, userPwd);
    }

    //注册
    @PostMapping("/register")
    @ApiOperation(value = "用户注册接口",notes = "用户名、密码和昵称,id不用给",httpMethod = "post", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",paramType = "query",dataType = "String",required = false),
            @ApiImplicitParam(name = "userCode",value = "账号",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "userPwd",value = "密码",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "userName",value = "昵称",paramType = "query",dataType = "String",required = true)
    })
    @ResponseBody
    public R register(User user){
        return userService.register(user);
    }

    //查询问题
    @GetMapping("/queryQuestion")
    @ResponseBody
    @ApiOperation(value = "常见问题",notes = "给出问题的 questionId 即可",httpMethod = "get", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "questionId",value = "问题Id",paramType = "query",dataType = "String",required = true),

    })
    public R queryQuestion(int questionId){
        return userService.queryQuestions(questionId);
    }


}
