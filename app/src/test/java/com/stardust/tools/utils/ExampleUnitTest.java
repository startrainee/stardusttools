package com.stardust.tools.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test(){

        int b = 1024;
        System.out.println("-----------");
        System.out.println(StringUtils.numToHex8(b));
        System.out.println(StringUtils.numToHex16(b));
        System.out.println(StringUtils.numToHex32(b));
        b = 16;
        System.out.println("-----------");
        System.out.println(StringUtils.numToHex8(b));
        System.out.println(StringUtils.numToHex16(b));
        System.out.println(StringUtils.numToHex32(b));
        b = 32;
        System.out.println("-----------");
        System.out.println(StringUtils.numToHex8(b));
        System.out.println(StringUtils.numToHex16(b));
        System.out.println(StringUtils.numToHex32(b));


    }


}