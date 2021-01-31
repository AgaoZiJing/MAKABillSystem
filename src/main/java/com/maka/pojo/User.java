package com.maka.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel
@Data
public class User {
  @ApiModelProperty(value = "id",notes = "用户ID,主键自增",dataType = "Long",required =false)
  private long id;
  @ApiModelProperty(value = "userCode",notes = "用户账号",dataType = "String",required =true)
  private String userCode;
  @ApiModelProperty(value = "userPwd",notes = "用户密码",dataType = "String",required =true)
  private String userPwd;
  @ApiModelProperty(value = "userName",notes = "用户昵称",dataType = "String",required =true)
  private String userName;

  private List<com.maka.pojo.UserAccount> UserAccount;


}