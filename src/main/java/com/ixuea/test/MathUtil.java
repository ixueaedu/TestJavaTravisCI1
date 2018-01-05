package com.ixuea.test;

public class MathUtil {

    /**
     * 返回a,b两个数中最大数的
     *
     * @param a
     * @param b
     * @return
     */
    public static int max(int a, int b) {
        return a > b ? a : b;

//                return a>b?b:a;// 这是错误的
    }


    public static int min(int a, int b) {
        if (a > b) {
            //假设这里还有很多逻辑
            return b;
        } else {
            //假设这里还有很多逻辑
            return a;
        }
    }

    public static int someMethod(int a, int b) {
        int x=0;
        int y=x+10;
        int z=20+y;


        int i=z+z;
        int j=i*10;
        int k=i+a+b;

        int h=i*j;

        int s=2+h*2;
        int w=9+s;

        int y1=2+w*10;

        int a1=b+2;

        int b1=w+a1;

        int a11=b+2;

        int b12=w+a1;

        if (a > b) {
            //假设这里还有很多逻辑
            return b;
        } else {
            //假设这里还有很多逻辑
            return a;
        }
    }
}
