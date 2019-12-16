package com.arseniiptrv.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arseniiptrv.swoosh.R
import com.arseniiptrv.swoosh.Utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        leagueNextBtn.setOnClickListener {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            if (selectedLeague != "") {
                startActivity(skillIntent)
            }
            else {
                Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
            }
        }
    }

    var selectedLeague = ""

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "Mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "Womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "Co-Ed"
    }

    /*fun skillBtnClicked (view: View) {
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }*/

    
}
