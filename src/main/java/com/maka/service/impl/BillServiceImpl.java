package com.maka.service.impl;

import com.maka.comment.R;
import com.maka.comment.constants;
import com.maka.mapper.BillMapper;
import com.maka.pojo.AccountData;
import com.maka.pojo.UserAccount;
import com.maka.service.BillService;
import com.maka.utils.Maxnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMapper billMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    //插入账单
    public int insertAccount(UserAccount userAccount) {
        //得到用户的id
        long id = constants.USER.getId();
        userAccount.setUserId(id);

        System.out.println("===============BillServiceImpl========================");
        System.out.println(id);

        userAccount.setUserId(id);
        return billMapper.insertAccount(userAccount);
    }

    @Override
    //查询账单
    public List<Map> queryAllAccount(long id) {
        return billMapper.queryAllAccount(id);
    }

    //查询收入账单
    @Override
    public AccountData queryaccount() {
        AccountData accountData=new AccountData();
        List<Map>map1=new LinkedList<>();
        List<Map>map2=new LinkedList<>();
        List<Map>map3=new LinkedList<>();
        List<Map>map4=new LinkedList<>();
        List<Map>map5=new LinkedList<>();
        List<Map>map6=new LinkedList<>();
        List<Map>map7=new LinkedList<>();
        List<Map>map8=new LinkedList<>();
        List<Map>map9=new LinkedList<>();
        List<Map>map10=new LinkedList<>();
        List<Map>map11=new LinkedList<>();
        List<Map>map12=new LinkedList<>();
        Map<Integer,List<Map>>mouthaccountdata= new HashMap<>();

        List<Map> useraccounts = billMapper.queryAllAccount(1);

            for (Map useraccount : useraccounts) {
                Date time  = (Date) useraccount.get("billTime");
                String substring = time.toString().substring(0, 7);
                switch (substring){
                    case "2021-01":
                        map1.add(useraccount);
                        continue;
                    case "2021-02":
                        map2.add(useraccount);
                        continue;
                    case "2021-03":
                        map3.add(useraccount);
                        continue;
                    case "2021-04":
                        map4.add(useraccount);
                        continue;
                    case "2021-05":
                        map5.add(useraccount);
                        continue;
                    case "2021-06":
                        map6.add(useraccount);
                        continue;
                    case "2021-07":
                        map7.add(useraccount);
                        continue;
                    case "2021-08":
                        map8.add(useraccount);
                        continue;
                    case "2021-09":
                        map9.add(useraccount);
                        continue;
                    case "2021-10":
                        map10.add(useraccount);
                        continue;
                    case "2021-11":
                        map11.add(useraccount);
                        continue;
                    case "2021-12":
                        map12.add(useraccount);
                }
            }
            mouthaccountdata.put(1,map1);
        mouthaccountdata.put(2,map2);
        mouthaccountdata.put(3,map3);
        mouthaccountdata.put(4,map4);
        mouthaccountdata.put(5,map5);
        mouthaccountdata.put(6,map6);
        mouthaccountdata.put(7,map7);
        mouthaccountdata.put(8,map8);
        mouthaccountdata.put(9,map9);
        mouthaccountdata.put(10,map10);
        mouthaccountdata.put(11,map11);
        mouthaccountdata.put(12,map12);
        Map<Integer,List<Map>> aq=  mouthaccountdata;
        //将一年数据进行分类
        BigDecimal money1 = BigDecimal.ZERO;
        BigDecimal money2 = BigDecimal.ZERO;
        BigDecimal money3 = BigDecimal.ZERO;
        BigDecimal money4 = BigDecimal.ZERO;
        BigDecimal money5= BigDecimal.ZERO;
        BigDecimal money6= BigDecimal.ZERO;
        BigDecimal money7= BigDecimal.ZERO;
        BigDecimal money8= BigDecimal.ZERO;
        BigDecimal money9= BigDecimal.ZERO;
        BigDecimal money10= BigDecimal.ZERO;
        BigDecimal money11= BigDecimal.ZERO;
        BigDecimal money12= BigDecimal.ZERO;
        BigDecimal money01 = BigDecimal.ZERO;
        BigDecimal money02 = BigDecimal.ZERO;
        BigDecimal money03 = BigDecimal.ZERO;
        BigDecimal money04 = BigDecimal.ZERO;
        BigDecimal money05= BigDecimal.ZERO;
        BigDecimal money06= BigDecimal.ZERO;
        BigDecimal money07= BigDecimal.ZERO;
        BigDecimal money08= BigDecimal.ZERO;
        BigDecimal money09= BigDecimal.ZERO;
        BigDecimal money010= BigDecimal.ZERO;
        BigDecimal money011= BigDecimal.ZERO;
        BigDecimal money012= BigDecimal.ZERO;
        List<Map> map;
        BigDecimal m;
        for(Map.Entry<Integer, List<Map>> a:mouthaccountdata.entrySet()){

            int i=a.getKey();
            switch (i){
                case 1:
                    map=a.getValue();
                    for (Map map13 : map){

                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money01=money01.add(m);
                            }else {
                                money1=money1.add(m);
                            }
                        }

                    continue;
                case 2:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money02=money02.add(m);
                            }else {
                                money2 = money2.add(m);
                            }
                        }

                    continue;
                case 3:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money03=money03.add(m);
                            }else {
                                money3 = money3.add(m);
                            }
                        }

                    continue;
                case 4:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money04=money04.add(m);
                            }else {
                                money4 = money4.add(m);
                            }
                        }

                    continue;
                case 5:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money05=money05.add(m);
                            }else {
                                money5=money5.add(m);}
                        }

                    continue;
                case 6:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money06=money06.add(m);
                            }else {
                                money6=money6.add(m);}
                        }

                    continue;
                case 7:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money07=money07.add(m);
                            }else {
                                money7=money7.add(m);}

                    }
                    continue;
                case 8:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money08=money08.add(m);
                            }else {
                                money8=money8.add(m);}
                        }

                    continue;
                case 9:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money09=money09.add(m);
                            }else {
                                money9=money9.add(m);}
                        }

                    continue;
                case 10:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money010=money010.add(m);
                            }else {
                                money10=money10.add(m);}
                        }

                    continue;
                case 11:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money011=money011.add(m);
                            }else {
                                money11=money11.add(m);}
                        }

                    continue;
                case 12:
                    map=a.getValue();

                        for (Map map13 : map){
                            m= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                money012=money012.add(m);
                            }else {
                                money12=money12.add(m);}
                        }

                    continue;
            }
        }
        //收入放入
        Map<Integer,BigDecimal> mapin =new HashMap<>();
        mapin.put(1,money1);
        mapin.put(2,money2);
        mapin.put(3,money3);
        mapin.put(4,money4);
        mapin.put(5,money5);
        mapin.put(6,money6);
        mapin.put(7,money7);
        mapin.put(8,money8);
        mapin.put(9,money9);
        mapin.put(10,money10);
        mapin.put(11,money11);
        mapin.put(12,money12);
        //支出放入
        Map<Integer,BigDecimal> mapout =new HashMap<>();
        mapout.put(1,money01);
        mapout.put(2,money02);
        mapout.put(3,money03);
        mapout.put(4,money04);
        mapout.put(5,money05);
        mapout.put(6,money06);
        mapout.put(7,money07);
        mapout.put(8,money08);
        mapout.put(9,money09);
        mapout.put(10,money010);
        mapout.put(11,money011);
        mapout.put(12,money012);
        accountData.setEveMouthAccountin(mapin);
        accountData.setEveMouthAccountout(mapout);
        Maxnum maxnum =new Maxnum();
        accountData.setMaxMouthAccountin(maxnum.maxnum(mapin));
        accountData.setMaxMouthAccountout(maxnum.maxnum(mapout));
        //年收支
        List<Map>yearmap1=new LinkedList<>();
        List<Map>yearmap2=new LinkedList<>();
        List<Map>yearmap3=new LinkedList<>();
        Map<Integer,List<Map>>  yearaccountdata= new HashMap<>();

            for (Map useraccount : useraccounts) {
                Date time  = (Date) useraccount.get("billTime");
                String substring = time.toString().substring(0, 4);
                switch (substring){
                    case "2019":
                        yearmap1.add(useraccount);
                        continue;
                    case "2020":
                        yearmap2.add(useraccount);
                        continue;
                    case "2021":
                        yearmap3.add(useraccount);
                        continue;
                }
            }

        yearaccountdata.put(2019,yearmap1);
        yearaccountdata.put(2020,yearmap2);
        yearaccountdata.put(2021,yearmap3);

        //将一年数据进行分类
        BigDecimal ymoney1 = BigDecimal.ZERO;
        BigDecimal ymoney2 = BigDecimal.ZERO;
        BigDecimal ymoney3 = BigDecimal.ZERO;
        BigDecimal ymoney01 = BigDecimal.ZERO;
        BigDecimal ymoney02 = BigDecimal.ZERO;
        BigDecimal ymoney03 = BigDecimal.ZERO;
        List<Map> ymap;
        BigDecimal ym;
        for(Map.Entry<Integer, List<Map>> a:yearaccountdata.entrySet()){

            int i=a.getKey();
            switch (i){
                case 2019:
                    ymap=a.getValue();

                        for (Map map13 : ymap){
                            ym= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                ymoney01=ymoney01.add(ym);
                            }else {
                                ymoney1=ymoney1.add(ym);
                            }
                        }

                    continue;
                case 2020:
                    ymap=a.getValue();

                        for (Map map13 : ymap){
                            ym= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                ymoney02=ymoney02.add(ym);
                            }else {
                                ymoney2 = ymoney2.add(ym);
                            }
                        }

                    continue;
                case 2021:
                    ymap=a.getValue();

                        for (Map map13 : ymap){
                            ym= (BigDecimal) map13.get("money");
                            String l= (String) map13.get("billType");
                            if(l.equals("支出")){
                                ymoney03=ymoney03.add(ym);
                            }else {
                                ymoney3 = ymoney3.add(ym);
                            }

                    }
                    continue;

            }
        }
        //收入放入
        Map<Integer,BigDecimal> ymapin =new HashMap<>();
        ymapin.put(1,ymoney1);
        ymapin.put(2,ymoney2);
        ymapin.put(3,ymoney3);
        //支出放入
        Map<Integer,BigDecimal> ymapout =new HashMap<>();
        ymapout.put(1,ymoney01);
        ymapout.put(2,ymoney02);
        ymapout.put(3,ymoney03);
        accountData.setEveYeearAccountin(ymapin);
        accountData.setEveYeearAccountout(ymapout);

        accountData.setMaxYearAccountin(maxnum.maxnum(ymapin));
        accountData.setMaxYearAccountout(maxnum.maxnum(ymapout));

        return accountData;
    }

    @Override
    //修改账单
    public R updateAccount(UserAccount userAccount) {
        R r = new R();
        if (billMapper.updateAccount(userAccount)>0){
            r.setCode(200);
            r.setMsg("修改成功！");
        }else {
            r.setCode(500);
            r.setMsg("修改失败！");
        }
        return r;
    }

    @Override
    //删除账单
    public R deleteAccount(long id) {
        R r = new R();
        if (billMapper.deleteAccount(id)>0){
            r.setCode(200);
            r.setMsg("删除成功！");
        }else {
            r.setCode(500);
            r.setMsg("删除失败！");
        }
        return r;
    }

    //查询收入的账单
    @Override
    public R queryIncomeDollar(long id) {
        R r = new R();
        List<Map> list = billMapper.queryIncomeDollar(id);
        if (list!=null){
            BigDecimal money=BigDecimal.ZERO;
            int count=0;
            double redEnvelopes=0;

            for (Map map : list) {
                BigDecimal m= (BigDecimal) map.get("money");
                 money=money.add(m);
                 count++;
            }

            redEnvelopes=count/5;  //每五条存入，就是1块钱


            Map hashMap = new HashMap();
            hashMap.put("money",money);
            hashMap.put("count",count);
            hashMap.put("redEnvelopes",redEnvelopes);
            hashMap.put("UserAccount",list);

            r.setCode(200);
            r.setMsg("查询成功");
            r.setData(hashMap);
        }else {
            r.setCode(501);
            r.setMsg("查询失败");
        }
        return r;
    }

    @Override
    public R queryTodayAllAccount(long id) {
        R r = new R();
        List<Map> list = billMapper.queryTodayAllAccount(id);
        if (list!=null){
            r.setCode(200);
            r.setMsg("查询成功");
            r.setData(list);
            }
        else {
            r.setCode(501);
            r.setMsg("查询失败");
        }
        return r;
    }

    @Override
    public R queryAccountInfo(long id) {
        R r = new R();
        UserAccount userAccount = billMapper.queryAccountInfo(id);
        if (userAccount!=null){
            r.setCode(200);
            r.setMsg("查询成功");
            r.setData(userAccount);
        }
        else {
            r.setCode(501);
            r.setMsg("查询失败");
        }
        return r;
    }


    @Override
    public R queryAccountInformation(long id) {
        R r = new R();
        Map map = billMapper.queryAccountInformation(id);
        if (map!=null){
            r.setCode(200);
            r.setMsg("查询成功");
            r.setData(map);
        }
        else {
            r.setCode(501);
            r.setMsg("查询失败");
        }
        return r;
    }
}
