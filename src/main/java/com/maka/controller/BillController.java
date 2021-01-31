package com.maka.controller;

import com.maka.comment.R;

import com.maka.comment.constants;
import com.maka.pojo.AccountData;
import com.maka.pojo.Id;
import com.maka.pojo.UserAccount;
import com.maka.service.BillService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(value = "/记账接口insertBill", tags = "记账接口API")
@Controller
@RequestMapping(value = "/Bill")
public class BillController {
    @Autowired
    private BillService billService;

    @ApiOperation(value = "/新增记账接口/insertBill", notes = "添加记账信息,id,userId,billTime,不用给", httpMethod = "post", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", paramType = "query", dataType = "String", required = false),
            @ApiImplicitParam(name = "userId", value = "用户id", paramType = "query", dataType = "String", required = false),
            @ApiImplicitParam(name = "paymentId", value = "支付方式（支付宝，微信）", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "money", value = "金额", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "billTypeId", value = "账单类型(收入/支出)", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "incomeType", value = "收支类型(餐饮、服饰等)", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "billTime", value = "时间", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "common", value = "备注", paramType = "query", dataType = "String", required = true)

    })
    @PostMapping("/insertBill")
    @ResponseBody
        //插入账单
    R insertBill(@ApiParam(name = "UserAccount", value = "新增记账信息", required = true) UserAccount userAccount) {
        R r = new R();
        try {

//            userAccount.setBillTime(new Date());
            int i = billService.insertAccount(userAccount);

            if (i > 0) {
                r.setCode(200);
                r.setMsg("添加记账成功");
                r.setData("1");
            } else {
                r.setCode(501);
                r.setMsg("添加失败");
                r.setData("1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            r.setCode(500);
            r.setMsg("系统开小差，联系管理员");
        }
        return r;
    }

    //查询账单
    @ApiOperation(value = "/查询账单信息/queryAllBill", notes = "显示记账信息", httpMethod = "get", response = String.class)
    @GetMapping("/queryAllBill")
    @ResponseBody
    R queryAllBill() {

        R r = new R();

        List<Map> mapList = billService.queryAllAccount(constants.USER.getId());

        try {
            if (mapList != null) {
                r.setCode(200);
                r.setMsg("查询成功");
                r.setData(mapList);
            } else {
                r.setCode(501);
                r.setMsg("用户未进行记账");
                r.setData(mapList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            r.setCode(500);
            r.setMsg("系统开小差，联系管理员");
        }
        return r;
    }

    //修改账单
    @ApiOperation(value = "/修改账单信息/updateAccount", notes = "修改账单信息", httpMethod = "post", response = String.class)
    @PostMapping("/updateAccount")
    @ResponseBody
    public R updateAccount(UserAccount userAccount) {
        return billService.updateAccount(userAccount);
    }
    //删除账单
    @ApiOperation(value = "/删除账单信息/deleteAccount", notes = "删除账单信息", httpMethod = "get", response = R.class)
//    @PostMapping("/deleteAccount")
    @RequestMapping(value = "/deleteAccount",method = RequestMethod.GET)
    @ResponseBody
    public R deleteAccount(int id) {
        System.out.println(id);
        return billService.deleteAccount(id);
    }

    //查询收入账单
    @ApiOperation(value = "/收入账单信息/queryIncomeMoney", notes = "查询收入账单信息", httpMethod = "post", response = String.class)
    @PostMapping("/queryIncomeMoney")
    @ResponseBody
    public R queryIncomeMoney() {
        long id = constants.USER.getId();
//        R r = billService.queryIncomeMoney(1);
        R r = billService.queryIncomeDollar(id);
        return r;
    }
    //月份年度统计
    @ApiOperation(value = "/月份年度统计/queryAccount", notes = "月份年度统计", httpMethod = "post", response = String.class)
    @RequestMapping(value = "/queryAccount",method = RequestMethod.POST)
    @ResponseBody
    R queryaccount(){
        R r = new R();
        AccountData accountData;
        accountData= billService.queryaccount();
        try {

            if (accountData!=null) {
                r.setCode(200);
                r.setMsg("查询成功");
                r.setData(accountData);
            } else {
                r.setCode(501);
                r.setMsg("查询失败");
                r.setData("1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            r.setCode(500);
            r.setMsg("系统开小差，联系管理员");
        }
        return r;
    }
    //查询当天所有的账单

    //查询收入账单
    @ApiOperation(value = "/查询当天账单信息/queryTodayAllAccount", notes = "查询当天账单信息", httpMethod = "get", response = String.class)
    @GetMapping("/queryTodayAllAccount")
    @ResponseBody
    public R queryTodayAllAccount() {
        long id = constants.USER.getId();
//        R r = billService.queryIncomeMoney(1);
        R r = billService.queryTodayAllAccount(id);
        return r;
    }

    //查询一条详细账单
//    @ApiOperation(value = "/查询一条详细账单/queryAccountInfo", notes = "查询一条详细账单", httpMethod = "get", response = R.class)
    @RequestMapping(value = "/queryAccountInfo",method = RequestMethod.GET)
    @ResponseBody
    public R queryAccountInfo(int id) {
        System.out.println(id);
//        int id1 = id.getId();
        R r = billService.queryAccountInfo(id);
        return r;
    }


    //查询一条详细账单s
    @ApiOperation(value = "/查询一条详细账单/queryAccountInformation", notes = "查询一条详细账单", httpMethod = "get", response = R.class)
    @RequestMapping(value = "/queryAccountInformation",method = RequestMethod.GET)
    @ResponseBody
    public R queryAccountInformation(int id) {
        System.out.println(id);
//        int id1 = id.getId();
        R r = billService.queryAccountInformation(id);
        return r;
    }

}
