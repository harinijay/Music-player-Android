package com.example.musicplayer // Replace this with your package name

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaplayer = MediaPlayer.create(this, R.raw.music)

        val play_btn = findViewById<ImageButton>(R.id.play_btn)

        play_btn.setOnClickListener {
                if (!mediaplayer.isPlaying) {
                    mediaplayer.start()
                    play_btn.setImageResource(R.drawable.baseline_pause_24)
                } else {
                    mediaplayer.pause()
                    play_btn.setImageResource(R.drawable.baseline_play_arrow_24)
                }

        }
    }

//    override fun onDestroy() {
//        super.onDestroy()
//        mediaPlayer?.release()
//        mediaPlayer = null
//    }
}
