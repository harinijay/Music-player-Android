import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplayer.R

class MusicPlayerActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private var isPaused = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the MediaPlayer with your audio file or URL
        mediaPlayer = MediaPlayer.create(this, R.raw.music)
    }

    fun onPlayPauseClicked(view: View) {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.pause()
            isPaused = true
            // Update your play/pause button UI
        } else {
            if (isPaused) {
                mediaPlayer.start()
                isPaused = false
                // Update your play/pause button UI
            } else {
                // Start playing from the beginning
                mediaPlayer.seekTo(0)
                mediaPlayer.start()
                // Update your play/pause button UI
            }
        }
    }

    fun onSkipNextClicked(view: View) {
        // Implement the logic to skip to the next track
    }

    fun onSkipPreviousClicked(view: View) {
        // Implement the logic to skip to the previous track
    }

    override fun onDestroy() {
        super.onDestroy()
        // Release the MediaPlayer when the activity is destroyed
        mediaPlayer.release()
    }
}
