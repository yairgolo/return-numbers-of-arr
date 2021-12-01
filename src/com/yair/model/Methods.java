package com.yair.model;

public class Methods {
    public static String returnArr(int[] arr){
        String st = "";
        for (int i = 0; i < arr.length; i++) {
            st += "" + arr[i];
        }
        return st;
    }
}
