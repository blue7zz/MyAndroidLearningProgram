package today.zjc.myandroidlearningprogram.java;

import org.junit.Test;

import java.lang.System.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


import static org.junit.Assert.*;


public class ExampleBase {
    public void p(String p) {
        System.out.println(p);
    }

    @Test
    public void baseType() {
        p("---------------------一些注意事项---------------------");
        p("字节大小和最大值和最小值的关系");
        p("Byte占8位");
        p("左边第一位为符号为0代表正，1代表符");
        p("127：0111 1111");
        p("-128：1111 1111");
        p("最小值最后一位(-128[8])减去最大值最后一位(127[7]) === 1");
        p("");
//        p("关于char 正数可以对应ASCLL码表");


        p("---------------------一些注意事项---------------------");
        p("");

        p("---------------------boolean 布尔类型---------------------");
        p("装箱:" + Boolean.class.toString());
        p("类型：" + Boolean.TYPE);
        p("值True：" + Boolean.TRUE);
        p("值False：" + Boolean.FALSE);
        p("---------------------boolean---------------------");
        p("");

        p("---------------------byte 字节---------------------");
        p("装箱:" + Byte.class.toString());
        p("大小(位)：" + Byte.SIZE);
        p("最大值：" + Byte.MAX_VALUE);
        p("最小值：" + Byte.MIN_VALUE);
        p("---------------------byte---------------------");
        p("");


        p("---------------------short 短整型---------------------");
        p("装箱:" + Short.class.toString());
        p("大小(位)：" + Short.SIZE);
        p("最大值：" + Short.MAX_VALUE);
        p("最小值：" + Short.MIN_VALUE);
        p("---------------------short---------------------");
        p("");

        //int

        p("---------------------int 整型---------------------");
        p("装箱:" + Integer.class.toString());
        p("大小(位)：" + Integer.SIZE);
        p("最大值：" + Integer.MAX_VALUE);
        p("最小值：" + Integer.MIN_VALUE);
        p("---------------------init---------------------");
        p("");

        p("---------------------Long 长整型---------------------");
        p("装箱:" + Long.class.toString());
        p("大小(位)：" + Long.SIZE);
        p("最大值：" + Long.MAX_VALUE);
        p("最小值：" + Long.MIN_VALUE);
        p("特殊表示：" + 1000L);
        p("---------------------Long---------------------");
        p("");

        //float


        p("---------------------Float 浮点型---------------------");
        p("装箱:" + Float.class.toString());
        p("大小(位)：" + Float.SIZE);
        p("最大值：" + Float.MAX_VALUE);
        p("最小值：" + Float.MIN_VALUE);
        float f = 100.33333f;
        p("特殊表示(默认为double,float 需要特殊表示)：" + f);
        p("---------------------Float---------------------");
        p("");


        //double
        p("---------------------Double 双精度浮点型---------------------");
        p("装箱:" + Double.class.toString());
        p("大小(位)：" + Double.SIZE);
        p("最大值：" + Double.MAX_VALUE);
        p("最小值：" + Double.MIN_VALUE);
        p("---------------------Double---------------------");
        p("");


        //char
        p("---------------------char Character 双精度浮点型---------------------");
        p("装箱:" + Character.class.toString());
        p("大小(位)：" + Character.SIZE);
        p("最大值127：\\uffff" + Character.MAX_VALUE);
        p("最小值-128：\\u0000" + Character.MIN_VALUE);
        p("---------------------char---------------------");
        p("");

    }

    @Test
    public void string() {
        String str = "Hello"; //自动加入堆内
        String str1 = new String("dddd");
        str1.intern();        //手动加入堆内


        StringBuffer s = new StringBuffer(str1);  //安全的带线程锁的
        StringBuilder s1 = new StringBuilder(str); //非安全的
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


}
