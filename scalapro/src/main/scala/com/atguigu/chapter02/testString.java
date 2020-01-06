package com.atguigu.chapter02;



import java.lang.reflect.Field;

public class testString {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /*String s = " a b ";
        //反射获得属性
        Field field = String.class.getDeclaredField("value");
        //获取private的访问权限
        field.setAccessible(true);
        //获取s对象的属性
        char[] o = (char[])field.get(s);
        o[2] = 'd';
        System.out.println(s);*/
        byte b =1 ;
        b= b++;
        System.out.println(b);
    }
}
