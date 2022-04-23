package jp.techacademy.bunta.tsurumi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("bunta tsurumi", 22,"野球")
        human.say()
        human.think()

        val human2 = Human("bunta tsurumi2",23,"サッカー")
        human2.say()
        human2.think()

    }
}