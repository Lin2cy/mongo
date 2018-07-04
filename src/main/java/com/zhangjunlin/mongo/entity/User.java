package com.zhangjunlin.mongo.entity;

/**
 * @author Tony
 * @description
 * @createTime 2018/7/3 15:16
 */
public class User {


    private double score;

    private String name;

    private int age;


    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
