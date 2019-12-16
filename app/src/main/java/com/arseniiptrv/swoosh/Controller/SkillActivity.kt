package com.arseniiptrv.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arseniiptrv.swoosh.Model.Player
import com.arseniiptrv.swoosh.R
import com.arseniiptrv.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        //player = intent.getParcelableExtra(EXTRA_PLAYER) ?: "value hasn't been assigned"
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        //selectedLeague = stringExtra
        //Log.e("ddd", selectedLeague)
        //Log.i("league", selectedLeague)
    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivityInt = Intent(this, FinishActivity::class.java)
            finishActivityInt.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivityInt)
        }
        else {
            Toast.makeText(this, "Please select a skill option", Toast.LENGTH_LONG).show()
        }
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "BEGINNER".toLowerCase()
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "BALLER".toLowerCase()
    }
}
