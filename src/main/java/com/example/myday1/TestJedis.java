package com.example.myday1;

import com.example.myday1.jedis.JedisConfig;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestJedis {
    public static void main(String[] args) {
        List<Double> list = getRes(100.0, 10);
        double sum1 = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum1 = sum1+list.get(i);
            System.out.println(list.get(i));
//                    System.out.println(sum1);
                }

    }

    public static List<Double> getRes(double money, int members){
        int money1 = (int) (money*100.0);
        DecimalFormat df = new DecimalFormat( "0.00");
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < members-1; i++) {
            int re = 1;
            while(re > 0){
                re = (int)(new Random().nextFloat()*(money1));
                if(re < money1*0.9){
                    money1 = money1 - re;
                    break;
                }
            }
            list.add(Double.parseDouble(df.format(re*0.01)));
        }
        list.add(Double.parseDouble(df.format(money1*0.01)));
        return list;
    }
}
