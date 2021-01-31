package com.maka.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Maxnum {

     public BigDecimal maxnum(Map<Integer,BigDecimal> map){
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        for (BigDecimal value : map.values()) {
            list.add(value);
        }

        BigDecimal max = Collections.max(list);
        return max;
    }
}
