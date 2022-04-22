package jp.techacademy.bunta.tsurumi.kotlinlog

import android.util.Log

open class Human : Animal ,Thinkable{
    constructor(name: String, age: Int): super(name, age) {
    }

    var hobby:String = "野球"

    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name+"です。"+
                "年は"+this.age+"歳です。")
    }

    override fun think() {
        Log.d("kotlintest","私は"+hobby+"について考える")
    }

}