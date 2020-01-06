package com.atguigu.hashmap;

public class TestProtected {
    public static void main(String[] args) throws CloneNotSupportedException {
        M m = new M();
        m.clone();
    }
}
class M {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}