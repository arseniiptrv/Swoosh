package com.arseniiptrv.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arseniiptrv.swoosh.R
import com.arseniiptrv.swoosh.Utilities.EXTRA_LEAGUE
import com.arseniiptrv.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var selectedLeague : String = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        val stringExtra = intent.getStringExtra(EXTRA_LEAGUE) ?: "value hasn't been assigned"
        selectedLeague = stringExtra
//      println(league)
        Log.e("ddd", selectedLeague)
        Log.i("league", selectedLeague)
    }

    fun onSkillFinishClicked(view: View) {
        if (selectedSkill != "") {
            val finishActivityInt = Intent(this, FinishActivity::class.java)
            finishActivityInt.putExtra(EXTRA_LEAGUE, selectedLeague)
            finishActivityInt.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishActivityInt)
        }
        else {
            Toast.makeText(this, "Please select a skill option", Toast.LENGTH_LONG).show()
        }
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        selectedSkill = "BEGINNER"
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        selectedSkill = "BALLER"
    }
}
