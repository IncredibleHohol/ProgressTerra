package dev.incrediblehohol.progressterra

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import dev.incrediblehohol.iprobonusviewlib.BannerComponentFragment

class MainActivity : AppCompatActivity() {

    private val clientId = "2c44d8c2-c89a-472e-aab3-9a8a29142315"
    private val deviceId = "7db72635-fd0a-46b9-813b-1627e3aa02ea"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                val fragment = BannerComponentFragment.newInstance(
                    clientId = clientId,
                    deviceId = deviceId,
                    totalTextSize = 24F,
                    darkGradientColor = Color.parseColor("#D2333E")
                )
                add(R.id.fragment_container, fragment)
            }
        }
    }
}