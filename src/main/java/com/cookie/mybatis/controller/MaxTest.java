package com.cookie.mybatis.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cookie
 * @version 1.0
 * @date 2020/12/03 16:20
 */
public class MaxTest {
    public static void main(String[] args) {

        int[] array = {1,5,1,5,1,8,9};
        getMethod_4(array);
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j]) {
                    count++;
                }

            }
            if (count >= max) {
                max = count;
            }
        }

    }

    /**数组中元素重复最多的数
     * @param array
     * @author shaobn
     * @param array
     */
    public static void getMethod_4(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int count_2 = 0;
        int temp = 0;
        for(int i=0;i<array.length;i=i+count){
            if(i==array.length-1){
                temp =1;
                break;
            }
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
                continue;
            }
            if(count>count_2){
                count_2 = count;
                map.put(count_2, array[i]);
            }

        }
        System.out.println(map.get(count_2));
    }
}
