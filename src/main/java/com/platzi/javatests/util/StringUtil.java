package com.platzi.javatests.util;

public class StringUtil {

    public static String repeat(String str, int times){

        if (times < 0){
            throw new IllegalArgumentException("No se permite un numero de veces negativo");
        }
            String result = "";

            for (int i = 0; i < times; i++) {
                result += str;
            }

        return result;
    }


}
