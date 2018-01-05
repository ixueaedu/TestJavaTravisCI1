package com.ixuea.test;

import org.junit.Assert;
import org.junit.Test;

public class TestMathUtil {

    @Test
    public void testMax(){
        int a=30;
        int b=20;

        //调用MathUtil max方法
        int result=MathUtil.max(a,b);

        //如果MathUtil.max的方法，那么结果应该30，所以应该是result和a相当
        //如果有一天这里测试不通过，说明MathUtil.max方法被该出问题了
        Assert.assertEquals(result,a);
    }

@Test
public void testMin(){
    Assert.assertEquals(MathUtil.min(30,20),20);
    Assert.assertEquals(MathUtil.min(10,6),6);
    Assert.assertEquals(MathUtil.min(20,2),2);
    Assert.assertEquals(MathUtil.min(30,1),1);

//        补全测试
    Assert.assertEquals(MathUtil.min(1,30),1);
}
}
