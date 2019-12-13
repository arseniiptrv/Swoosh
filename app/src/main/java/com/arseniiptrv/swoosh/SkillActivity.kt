package com.arseniiptrv.swoosh

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SkillActivity : AppCompatActivity() {

    var league : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        val stringExtra = intent.getStringExtra(EXTRA_LEAGUE) ?: "value hasn't been assigned"
        league = stringExtra
//      println(league)
        Log.e("ddd", league)
        Log.i("league", league)
    }
}
