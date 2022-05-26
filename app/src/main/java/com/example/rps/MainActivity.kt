package com.example.rps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        restart_btn.setOnClickListener {
            clear_score()
        }
        scissors_btn.setOnClickListener {
            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors_icons));
            val computer_move = (1..4).random()
            if (computer_move == 1) {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.stone_icons));
                winner_tv.text = "Computer has won"
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()
            } else if (computer_move == 2) {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper_icons));
                winner_tv.text = "Player has won"
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            } else {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors_icons));
                winner_tv.text = "Draw"
            }
        }

        paper_btn.setOnClickListener {
            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper_icons));
            val computer_move = (1..4).random()
            if (computer_move == 1) {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.stone_icons));
                winner_tv.text = "Player has won"
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            }
            else if (computer_move == 2) {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper_icons));
                winner_tv.text = "Draw"
            } else {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors_icons));
                winner_tv.text = "Computer has won"
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()
            }
        }

        rock_btn.setOnClickListener {
            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.stone_icons));
            val computer_move = (1..4).random()
            if (computer_move == 1) {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.stone_icons));
                winner_tv.text = "Draw"

            } else if (computer_move == 2) {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper_icons));
                winner_tv.text = "Computer has won"
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()

            } else {
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors_icons));
                winner_tv.text = "Player has won"
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            }
        }
    }

    private fun clear_score() {
        computer_score.text = "0"
        player_score.text = "0"
        winner_tv.text = ""
        user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));
        computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));
    }
}