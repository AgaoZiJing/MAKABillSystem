package com.maka.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class BillType {
  @ApiModelProperty(value = "billTypeId",notes = "账单类型id",dataType = "String",required =true)
  private long billTypeId;
  @ApiModelProperty(value = "billType",notes = "账单类型(收入/支出)",dataType = "String",required =true)
  private String billType;


}
