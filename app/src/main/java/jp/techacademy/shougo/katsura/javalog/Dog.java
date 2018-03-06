package jp.techacademy.shougo.katsura.javalog;

import android.util.Log;

class Dog extends Animal implements Movable {

    static String to_jp = "犬";

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「わんわん」");

    }

    public static void introduce(){
        Log.d("javatest","これは犬クラスです");
    }

    @Override
    public void move() {
        Log.d("javatest","this.name" + "は全力で逃走した");

    }


}
