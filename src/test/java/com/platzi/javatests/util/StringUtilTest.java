package com.platzi.javatests.util;
import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    public static void main(String[] args) {

        assertEquals( "holaholahola", StringUtil.repeat("hola", 2));
        assertEquals( "holaholahola", StringUtil.repeat("hola", 1));
        
    }
  
}