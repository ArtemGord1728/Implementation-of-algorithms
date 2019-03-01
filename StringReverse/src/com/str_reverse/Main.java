package com.str_reverse;

public class Main {

    public static void main(String[] args) {
        String c = "hello";
        int i;
        String temp = "";

        for (i = c.length() - 1; i >= 0; i--){
            temp += c.substring(i, i + 1);
        }
        System.out.println(temp);
    }
}
