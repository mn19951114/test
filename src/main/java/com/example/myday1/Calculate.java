package com.example.myday1;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Data
public class Calculate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(str == null || str == " "){
                System.out.println(str);
            }else{
                String[] arr = str.toLowerCase().split("");
                StringBuffer st = new StringBuffer();
                for (int i = 0; i < arr.length; i++) {
                    if ("a".equals(arr[i])){
                        arr[i] = arr[i].toUpperCase() ;
                    }
                    if ("e".equals(arr[i])){
                        arr[i] = arr[i].toUpperCase() ;
                    }
                    if ("i".equals(arr[i])){
                        arr[i] = arr[i].toUpperCase() ;
                    }
                    if ("o".equals(arr[i])){
                        arr[i] = arr[i].toUpperCase() ;
                    }
                    if ("u".equals(arr[i])){
                        arr[i] = arr[i].toUpperCase() ;
                    }
                    st.append(arr[i]);
                }
                System.out.println(st.toString());
            }
        }

        public static boolean isPrime(int i){
            boolean flag = true;
            if (i == 1){
                flag = false;
            }
            for (int j = 2; j <= i-1; j++) {
                if (i%j==0){
                    flag= false;
                    break;
                }
            }
            return flag;
        }

        public static String getResult(int para){
            String result = "0";
            if (para == 1 || para%2 != 0){
                return result;
            }
            int mid = para/2;
            for (int i = 1; i < mid; i++) {
                if (mid-i < 0){
                    return result;
                }
                if (isPrime(mid-i) && isPrime(mid + i)){
                    return ""+(mid-i)+" "+(mid+i);
                }
            }
            return result;
        }

}
