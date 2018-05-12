package com.ideal;

import java.util.Scanner;

/**
 * @author lzz 578289079@qq.com
 * @date 2018/5/12
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入正整数：");
        Scanner scan = new Scanner(System.in);
        int counts = Integer.parseInt(scan.next());
        for(int i = 0; i < counts; i++){
            System.out.println("==============第" + (i + 1) + "行==============");
        }
    }
}
