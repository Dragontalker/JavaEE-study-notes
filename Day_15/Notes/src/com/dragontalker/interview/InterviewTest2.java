package com.dragontalker.interview;

interface Playable {
    void play();
}

interface Bounceable {
    void play();
}

interface Rollable extends Playable, Bounceable {
    Ball ball = new Ball("PingPong");
}

class Ball implements Rollable {
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    public void play() {
        //ball = new Ball("Football"); //ball是常量, 所以不能调用
        System.out.println(ball.getName());
    }
}

public class InterviewTest2 {
}
