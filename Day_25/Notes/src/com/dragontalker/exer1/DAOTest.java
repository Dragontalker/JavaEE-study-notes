package com.dragontalker.exer1;

public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001", new User(1001, 34, "周杰伦"));
    }
}
