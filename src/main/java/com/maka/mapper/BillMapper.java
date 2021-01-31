package com.maka.mapper;

import com.maka.comment.R;
import com.maka.pojo.UserAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BillMapper {
    //增加账单
    int insertAccount(UserAccount useraccount);
    //查询账单
    List<Map> queryAllAccount(@Param("id") long id);
    //修改账单
    int updateAccount(UserAccount userAccount);
    //删除账单
    int deleteAccount(@Param("id") long id);
    //查询收入账单
    List<Map> queryIncomeDollar(@Param("id") long id);
    //查询当天所有账单
    List<Map> queryTodayAllAccount(@Param("id") long id);
    //查询一条账单详细信息
    UserAccount queryAccountInfo(@Param("id") long id);

    //查询一条账单详细信息s
    Map queryAccountInformation(@Param("id") long id);

}
