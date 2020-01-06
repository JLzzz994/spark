package com.atguigu.java;

public class TestFinally {
    public static void main(String[] args) {
        new XX().test();
    }
}
class XX{
    public void test(){
        try {
            throw new RuntimeException("xxxx");
        } catch (RuntimeException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement ste : stackTrace) {
                if (ste.getMethodName().equals("main")) {
                    System.out.println(ste.getClassName());
                }
            }
        }
    }
}