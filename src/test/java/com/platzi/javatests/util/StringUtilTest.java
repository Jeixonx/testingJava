package com.platzi.javatests.util;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        assertEquals( "hola", StringUtil.repeat("hola", 1));

    }

    @Test
    public void repeat_string_multiple_times() {
        assertEquals( "holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals( "", StringUtil.repeat("hola", 1));

    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }

}