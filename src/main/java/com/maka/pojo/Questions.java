package com.maka.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class Questions {
  @ApiModelProperty(value = "questionId",notes = "问题id",dataType = "String",required =true)
  private int questionId;
  @ApiModelProperty(value = "question",notes = "具体问题",dataType = "String",required =true)
  private String question;

}
