package com.su.basics;

/**
 * 第一个程序
 * String 类型的定义
 * 输出语句
 * for循环基本格式
 * 判断String 字符串的长度的方法 length()
 * length() -> char[].length -> String字符串的底层原理就是char[]字符数组
 * */
public class Welcome {
    public static void main(String[] args) {
        String greeting="Welcome to Core Java!";
        System.out.println(greeting);
        for (int i=0;i<greeting.length();i++){
            System.out.println("循环次数");
            System.out.println("greeting的长度:"+greeting.length());
        }
        System.out.println();
    }
}
