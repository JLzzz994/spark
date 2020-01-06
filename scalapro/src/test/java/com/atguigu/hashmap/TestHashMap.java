package com.atguigu.hashmap;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<User, User> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(new User(), new User());
            System.out.println("i=" + i + "size=" + map.size() );
        }
    }
}

class User {
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}