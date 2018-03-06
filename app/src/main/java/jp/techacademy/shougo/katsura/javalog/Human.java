package jp.techacademy.shougo.katsura.javalog;


import android.util.Log;

public class Human extends Animal implements Thinkable {

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String hobby;

    public void say() {
        Log.d("javatest","私の名前は" + name + "です。年は" + age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest","私は" + hobby + "について考える");
    }



}
