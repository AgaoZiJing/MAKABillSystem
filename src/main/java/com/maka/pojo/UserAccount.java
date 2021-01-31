package com.maka.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel
@Data
public class UserAccount {

  @ApiModelProperty(value = "id",notes = "用户ID,主键自增",dataType = "Long",required =false)
  private long id;
  @ApiModelProperty(value = "userId",notes = "用户Id",dataType = "Long",required =false)
  private long userId;
  @ApiModelProperty(value = "paymentId",notes = "支付方式（支付宝，微信）",dataType = "Long",required =true)
  private long paymentId;
  @ApiModelProperty(value = "money",notes = "金额",dataType = "Long",required =true)
  private double money;
  @ApiModelProperty(value = "billTypeId",notes = "账单类型(收入/支出)",dataType = "Long",required =true)
  private long billTypeId;
  @ApiModelProperty(value = "incomeType",notes = "收支类型(餐饮、服饰等)",dataType = "Long",required =true)
  private long incomeType;
  @ApiModelProperty(value = "billTime",notes = "时间",dataType = "Long",required =true)
  private Date billTime;
  @ApiModelProperty(value = "common",notes = "评论",dataType = "Long",required =true)
  private String common;

}
