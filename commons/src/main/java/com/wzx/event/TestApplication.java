package com.wzx.event;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月14日 14:47
 */
public class TestApplication {

    private String name;
    private int age;

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
        return "TestApplication{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
