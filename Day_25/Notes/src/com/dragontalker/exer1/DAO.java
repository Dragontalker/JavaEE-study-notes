package com.dragontalker.exer1;

import java.util.Map;

public class DAO<T> {
    private Map<String, T> map;

    //保存T类型的对象到Map的成员变量中
    public void save(String id, T entity) {}

    //从map中获取id对应的对象
    public T get(String id) {
        return null;
    }
}
