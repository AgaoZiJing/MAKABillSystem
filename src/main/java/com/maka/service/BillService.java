package com.maka.service;

import com.maka.comment.R;
import com.maka.pojo.AccountData;
import com.maka.pojo.UserAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BillService {
    //插入账单
    int insertAccount(UserAccount useraccount);
    //查询账单
    List<Map> queryAllAccount(long id);
    //查询按日期
    AccountData queryaccount();

    //修改账单
    R updateAccount(UserAccount userAccount);
    //删除账单
    R deleteAccount(long id);
    //查询收入账单
    R queryIncomeDollar(long id);
    //查询当天所有账单
    R queryTodayAllAccount( long id);
    //查询一条账单详细信息
    R queryAccountInfo(long id);


    //查询一条账单详细信息s
    R queryAccountInformation(long id);



}
