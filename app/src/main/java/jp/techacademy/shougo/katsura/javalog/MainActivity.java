package jp.techacademy.shougo.katsura.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);

        BigDog bigdog = new BigDog("ヨーゼフ", 3);

        Human human = new Human("大五郎",56, "ダンスパーティー");
        human.say();
        human.think();
    }
}
