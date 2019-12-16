package com.arseniiptrv.swoosh.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arseniiptrv.swoosh.R
import com.arseniiptrv.swoosh.Utilities.EXTRA_LEAGUE
import com.arseniiptrv.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val extraLeague = intent.getStringExtra(EXTRA_LEAGUE)
        val extraSkill = intent.getStringExtra(EXTRA_SKILL)
        searchLeaguesText.text = "Looking for $extraLeague $extraSkill league near you..."
    }
}
