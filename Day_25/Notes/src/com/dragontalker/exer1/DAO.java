package com.dragontalker.exer1;

import java.util.List;
import java.util.Map;

public class DAO<T> {
    private Map<String, T> map;

    //保存T类型的对象到Map的成员变量中
    public void save(String id, T entity) {}

    //从map中获取id对应的对象
    public T get(String id) {
        return null;
    }

    //替换map中key为id的内容, 改为entity对象
    public void update(String id, T entity) {}

    //返回map中存放的所有T对象
    public List<T> list() {
        return null;
    }
}
