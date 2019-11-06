package org.mozilla.automationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val versionInfo = packageManager.getPackageInfo(packageName, 0)
        versionText.text = "versionCode: " + versionInfo.versionCode.toString()
    }
}